package com.jobapp.ReviewMs.service;

import com.jobapp.ReviewMs.entity.Review;

import java.util.List;

public interface ReviewService {

    List<Review> getAllReviews(Long companyId);

    boolean addReview(Long companyId,Review review);

    Review getReview(Long companyId,Long reviewId,Review review);

    boolean updateReview(Long companyId,Long reviewId,Review review);

    boolean deleteReview(Long companyId,Long reviewId);

}
