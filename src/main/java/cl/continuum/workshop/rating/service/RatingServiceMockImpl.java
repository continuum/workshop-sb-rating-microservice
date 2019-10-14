package cl.continuum.workshop.rating.service;

import cl.continuum.workshop.rating.model.Rating;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Profile("mock")
public class RatingServiceMockImpl implements RatingService {
    @Override
    public List<Rating> getRatingByProductName(String productName) {
        Random random = new Random();
        return Arrays.asList(
                new Rating(1L, productName, random.nextInt(5) + 1, random.nextInt(50), random.nextInt(100_000) + 150_000L, "Amazon"),
                new Rating(1L, productName, random.nextInt(5) + 1, random.nextInt(50), random.nextInt(100_000) + 150_000L, "Ebay"),
                new Rating(1L, productName, random.nextInt(5) + 1, random.nextInt(50), random.nextInt(100_000) + 150_000L, "Aliexpress"));
    }
}
