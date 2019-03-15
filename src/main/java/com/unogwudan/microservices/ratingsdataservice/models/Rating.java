package com.unogwudan.microservices.ratingsdataservice.models;

public class Rating {

	private String movieId;
	private int rating;
	
	public Rating() {}

	public Rating(String movieId, int rating) {
		this.movieId = movieId;
		this.rating = rating;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "RatingResource [movieId=" + movieId + ", rating=" + rating + "]";
	}

}
