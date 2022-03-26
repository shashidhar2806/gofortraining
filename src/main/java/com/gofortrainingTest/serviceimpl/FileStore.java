package com.gofortrainingTest.serviceimpl;

import org.springframework.stereotype.Service;


@Service
public class FileStore {
	
//	@Autowired
//	private AmazonS3 s3;
//	
//	public void save(String path, String fileName, 
//			Optional<Map<String, String>> optionalMetaData, InputStream inputStream) {
//		
//		
//		ObjectMetadata metaData = new ObjectMetadata();
//		
//		optionalMetaData.ifPresent(map -> {
//			if(!map.isEmpty()) {
//				map.forEach(metaData::addUserMetadata);
//			}
//		});
//		
//		
//		
//		try {
//			s3.putObject(path, fileName, inputStream, metaData);
//		} catch (AmazonServiceException e) {
//			System.out.println("Error in FileStore...");
//			throw new IllegalArgumentException("Failed to store file to s3...", e);
//			// TODO: handle exception
//		}
//		
//	}

}
