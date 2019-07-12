package com.advyteam.microservices.ratingservice.models;

import java.util.ArrayList;
import java.util.List;

public class UserRating {

    private List<Rating> userRAting;

    public List<Rating> getUserRAting() {
        return userRAting;
    }

    public void setUserRAting(ArrayList<Rating> userRAting) {
        this.userRAting = userRAting;
    }
}
