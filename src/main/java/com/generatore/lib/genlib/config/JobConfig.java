package com.generatore.lib.genlib.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Bean;

public class JobConfig {


    @Bean
    public Job GeneratoreJob(JobRepository jobRepository, Step stepGeneratore)
    {
        return new JobBuilder("generatoreJob",jobRepository).start(stepGeneratore).build();
    }

}
