package com.noctil.test.noctiltest.controller;

import java.util.Map;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("api/GetJSONRecording")
public class JobRecordingController {

    public static final Logger LOGGER = LoggerFactory.getLogger(JobRecordingController.class);

    
    @GetMapping("/convert")
    public String convertXmlToJson(@RequestParam("inputFile") String inputFile) throws Exception {
        // JobParameters jobParameters = new JobParametersBuilder()
        //         .addString("inputFile", inputFile)
        //         .addString("outputFile", outputFile)
        //         .toJobParameters();

        // jobLauncher.run(xmlToJsonJob, jobParameters);

        return "XML to JSON conversion started for file: " + inputFile;
    }
    
}
