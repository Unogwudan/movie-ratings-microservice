package com.unogwudan.microservices.ratingsdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unogwudan.microservices.ratingsdataservice.models.Rating;
import com.unogwudan.microservices.ratingsdataservice.models.UserRating;

@RestController
@RequestMapping("ratings")
public class RatingsResource {
	
	@GetMapping("{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 5);
	}
	
	@GetMapping("users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		// Get all the rated movies
		List<Rating> ratings = Arrays.asList(new Rating("1234", 4), new Rating("5678", 3));
		UserRating userRatings =  new UserRating(ratings);
		return userRatings;
	} 
}
