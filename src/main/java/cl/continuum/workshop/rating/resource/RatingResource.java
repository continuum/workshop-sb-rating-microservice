package cl.continuum.workshop.rating.resource;

import cl.continuum.workshop.rating.model.Rating;
import cl.continuum.workshop.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/rating", produces = "application/json")
public class RatingResource {
    @Autowired
    private RatingService service;

    @GetMapping(path = "")
    ResponseEntity<List<Rating>> getRating(@RequestParam(name = "name") String name) {
        List<Rating> ratings = service.getRatingByProductName(name);

        if (ratings == null) {
            return ResponseEntity.status(404).build();
        }

        return ResponseEntity.ok(ratings);
    }
}
