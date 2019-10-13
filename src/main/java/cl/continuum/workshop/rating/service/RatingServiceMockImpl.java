package cl.continuum.workshop.rating.service;

import cl.continuum.workshop.rating.model.Rating;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

@Service
@Profile("mock")
public class RatingServiceMockImpl implements RatingService {
    private static Map<Long, Rating> ratingSource = new HashMap<>();

    static {
        Random random = new Random();
        ratingSource.put(1L, new Rating(1L, "Nintendo Switch", random.nextInt(5) + 1, random.nextInt(50), random.nextInt(100_000) + 150_000L, "Amazon"));
        ratingSource.put(2L, new Rating(2L, "Nintendo Switch Lite", random.nextInt(5) + 1, random.nextInt(50), random.nextInt(100_000) + 150_000L, "Amazon"));
        ratingSource.put(3L, new Rating(1L, "Xbox One X", random.nextInt(5) + 1, random.nextInt(50), random.nextInt(100_000) + 150_000L, "Amazon"));
    }

    @Override
    public List<Rating> getRatingByProductName(String productName) {
        return ratingSource.values()
                .stream()
                .filter((r) -> r.getProductName().toLowerCase().contains(productName.toLowerCase()))
                .collect(Collectors.toList());
    }
}
