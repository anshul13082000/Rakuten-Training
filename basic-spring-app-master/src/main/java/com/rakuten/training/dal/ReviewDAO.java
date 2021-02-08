package com.rakuten.training.dal;

import java.util.List;

import com.rakuten.training.domain.Review;

public interface ReviewDAO {

	Review save(Review r);

	List<Review> findByProduct_Id(int id);

	Review findById(int id);

}