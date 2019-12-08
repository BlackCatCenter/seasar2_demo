package com.seasar2_demo.action;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;


public class UploadServlet extends HttpServlet{
	
		
		private static final long serialVersionUID = 7798464901577760319L;

		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		}

		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			// 判断表单是否支持文件上传
			boolean isMultipartContent = ServletFileUpload.isMultipartContent(request);
			if (isMultipartContent) {
				DiskFileItemFactory factory = new DiskFileItemFactory();
				ServletFileUpload servletFileUpload = new ServletFileUpload(factory);
				try {
					// 得到并处理表单中的每项
					List<FileItem> fileItems = servletFileUpload.parseRequest(request);
					for (FileItem fileitem : fileItems) {
						if (fileitem.isFormField()) {
							processCommonField(fileitem);
						} else {
							processUploadField(fileitem);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}

		// 处理普通表单项
		private void processCommonField(FileItem fileitem) {
			try {
				String fieldName = fileitem.getFieldName();
				String fieldValue = fileitem.getString("UTF-8");
				System.out.println(fieldName + "=" + fieldValue);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}

		// 处理上传表单项
		public void processUploadField(FileItem fileItem) {
			try {
				// 创建存放上传文件的目录
				String folderPath="D://upload";
				File folder = new File(folderPath);
				if (!folder.exists()) {
					folder.mkdirs();
				}
				// 生成不重复的文件名
				String fileName = fileItem.getName();
				if (fileName != null) {
					fileName = FilenameUtils.getName(fileName);
				}
				fileName = UUID.randomUUID() + "_" + fileName;
				// 按照日期生成子文件名称
				String dateDirectory = makeDateDirectory(folder);
				// 创建文件
				File file = new File(folder, dateDirectory + File.separator + fileName);
				// 存放被上传的文件
				fileItem.write(file);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// 依据日期生成子文件夹
		public String makeDateDirectory(File folder) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();
			String dateDirectory = simpleDateFormat.format(date);
			File file = new File(folder, dateDirectory);
			if (!file.exists()) {
				file.mkdirs();
			}
			return dateDirectory;
		}
	}

