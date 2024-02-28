package com.noctil.test.noctiltest.service;

import org.springframework.batch.item.xml.StaxEventItemReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileSystemResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;

import com.noctil.test.noctiltest.Model.Recording;

@Service
public class JobService {

    @Bean
public StaxEventItemReader<Recording> itemReader(@Value("${input.file}") String inputFile) {
    StaxEventItemReader<Recording> xmlFileReader = new StaxEventItemReader<>();
    xmlFileReader.setResource(new FileSystemResource(inputFile));
    xmlFileReader.setFragmentRootElementName("RECORDING");

    Jaxb2Marshaller unmarshaller = new Jaxb2Marshaller();
    unmarshaller.setClassesToBeBound(Recording.class);
    xmlFileReader.setUnmarshaller(unmarshaller);

    return xmlFileReader;
}


    
}
