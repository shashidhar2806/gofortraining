package com.gofortrainingTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gofortrainingTest.serviceimpl.StorageServiceImpl;


@CrossOrigin("*")
@RestController
public class S3Controller {
	
	@Autowired
	private StorageServiceImpl storageService;

	@PostMapping(value = "/saveFile")
	public ResponseEntity<String> uploadFile(@RequestParam(value = "file") MultipartFile file){
		return new ResponseEntity<>(storageService.uploadFile(file), HttpStatus.OK);
	}
	
}
