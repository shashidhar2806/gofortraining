package com.gofortrainingTest.serviceimpl;

import java.io.File;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectRequest;

@Service
public class StorageServiceImpl {
	
	@Value("${application.bucket.name}")
	 private String bucketName;
	
	// @Value("${application.bucket.name}")
//		 private String bucketName = "gofortraining-test";
	 
	 @Autowired
	 private AmazonS3 s3Client;
	 
	 private File convertMultipartFileToFile(MultipartFile file) {
		 File convertedFile = new File(file.getOriginalFilename());
		 try(FileOutputStream fos = new FileOutputStream(convertedFile)) {
			fos.write(file.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return convertedFile;
	 }
	 
	 public String uploadFile(MultipartFile file) {
		 File fileObj = convertMultipartFileToFile(file);
		 String fileName = file.getOriginalFilename() + "-" + System.currentTimeMillis();
		 s3Client.putObject(new PutObjectRequest(bucketName, fileName, fileObj));
		 fileObj.delete();
		 return "File uploaded : " + fileName;
	 }
//	 

}
