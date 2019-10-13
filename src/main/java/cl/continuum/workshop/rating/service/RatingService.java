package cl.continuum.workshop.rating.service;

import cl.continuum.workshop.rating.model.Rating;

import java.util.List;

public interface RatingService {
    List<Rating> getRatingByProductName(String productName);
}
