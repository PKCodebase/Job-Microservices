package com.jobapp.JobMs.service;

import com.jobapp.JobMs.entity.Job;

import java.util.List;

public interface JobService {

    List<Job> findAll();

    void createJob(Job job);

    Job getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJob(Long id, Job updatedJob);
}
