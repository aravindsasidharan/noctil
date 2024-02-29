package com.noctil.test.noctiltest.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.noctil.test.noctiltest.service.JobService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("api/GetJSONRecording")
public class JobRecordingController {

    public static final Logger LOGGER = LoggerFactory.getLogger(JobRecordingController.class);

    @Autowired
    private JobService jobservice;
//    @GetMapping("/convert")
//    public String convertXmlToJson(@RequestParam("inputFile") String inputFile) throws Exception {
//        // JobParameters jobParameters = new JobParametersBuilder()
//        //         .addString("inputFile", inputFile)
//        //         .addString("outputFile", outputFile)
//        //         .toJobParameters();
//
//        // jobLauncher.run(xmlToJsonJob, jobParameters);
//
//        return "XML to JSON conversion started for file: " + inputFile;
//    }
//    
    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("inputFile") MultipartFile file) {
        // Handle the file upload logic here
        if (!file.isEmpty()) {
            String fileName = file.getOriginalFilename();
            // Process the file...
            try {
				InputStream inputStream = file.getInputStream();
				
				jobservice.itemReader(inputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            
            return "File uploaded successfully: " + fileName;
        } else {
            return "Failed to upload file: File is empty";
        }
    }
}
