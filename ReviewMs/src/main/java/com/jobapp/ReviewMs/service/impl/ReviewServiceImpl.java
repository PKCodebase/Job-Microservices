package com.jobapp.ReviewMs.service.impl;

import com.jobapp.ReviewMs.entity.Review;
import com.jobapp.ReviewMs.service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Override
    public List<Review> getAllReviews(Long companyId) {
        return List.of();
    }

    @Override
    public boolean addReview(Long companyId, Review review) {
        return false;
    }

    @Override
    public Review getReview(Long companyId, Long reviewId, Review review) {
        return null;
    }

    @Override
    public boolean updateReview(Long companyId, Long reviewId, Review review) {
        return false;
    }

    @Override
    public boolean deleteReview(Long companyId, Long reviewId) {
        return false;
    }
}
