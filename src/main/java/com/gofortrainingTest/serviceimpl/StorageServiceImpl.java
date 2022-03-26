package com.gofortrainingTest.serviceimpl;

import org.springframework.stereotype.Service;

@Service
public class StorageServiceImpl {
	
//	 @Value("${application.bucket.name}")
//	 private String bucketName;
//	 
//	 @Autowired
//	 private AmazonS3 s3Client;
//	 
//	 private File convertMultipartFileToFile(MultipartFile file) {
//		 File convertedFile = new File(file.getOriginalFilename());
//		 try(FileOutputStream fos = new FileOutputStream(convertedFile)) {
//			fos.write(file.getBytes());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		 return convertedFile;
//	 }
//	 
//	 public String uploadFile(MultipartFile file) {
//		 File fileObj = convertMultipartFileToFile(file);
//		 String fileName = file.getOriginalFilename() + "-" + System.currentTimeMillis();
//		 s3Client.putObject(new PutObjectRequest(bucketName, fileName, fileObj));
//		 fileObj.delete();
//		 return "File uploaded : " + fileName;
//	 }
//	 

}
