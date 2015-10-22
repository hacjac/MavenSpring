package com.hwccy.MavenHibernate.controller;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UploadController {
	
	@RequestMapping(value="/file/upload",method=RequestMethod.POST)
	public void upload(HttpServletRequest request) {
		DiskFileItemFactory factory=new DiskFileItemFactory();
		ServletFileUpload upload=new ServletFileUpload(factory);
		try {
			List items=upload.parseRequest(request);
			for (Iterator iterator = items.iterator(); iterator.hasNext();) {
				FileItem fileItem = (FileItem) iterator.next();
				String name=fileItem.getName();
				File file=new File("E:\\j2ee\\MavenSpring\\src\\main\\resources\\file\\",
						name.substring(name.lastIndexOf("\\")>=0?name.lastIndexOf("\\"):0));
				fileItem.write(file);
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
