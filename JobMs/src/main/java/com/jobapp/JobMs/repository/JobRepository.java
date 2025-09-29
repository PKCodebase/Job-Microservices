package com.jobapp.JobMs.repository;

import com.jobapp.JobMs.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job,Long> {
}
