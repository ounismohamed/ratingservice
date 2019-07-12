package com.advyteam.microservices.ratingservice.ressources;

import com.advyteam.microservices.ratingservice.models.Rating;
import com.advyteam.microservices.ratingservice.models.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

@RestController
@RequestMapping("/ratings")
public class RatingRessource {
@GetMapping("/{movieId}")
public Rating getMovieRatings (@PathVariable ("movieId") String movieId){ return  new Rating("12",4); }

@GetMapping("/users/{userId}")
public UserRating getUserRatings (@PathVariable ("userId") String userId){

    ArrayList<Rating> ratings = new ArrayList<Rating>();
    ratings.add( new Rating("1234",4));
    ratings.add(new Rating("4567",3));
    UserRating userRating = new UserRating();
    userRating.setUserRAting(ratings);

return userRating;
}
}
