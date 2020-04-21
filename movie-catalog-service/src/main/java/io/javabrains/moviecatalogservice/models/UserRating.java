package io.javabrains.moviecatalogservice.models;

import java.util.List;

public class UserRating {

    List<Rating> userRatingList;

    public UserRating() {
    }


    public UserRating(List<Rating> userRatingList) {
        this.userRatingList = userRatingList;
    }


    public List<Rating> getUserRatingList() {
        return userRatingList;
    }

    public void setUserRatingList(List<Rating> userRatingList) {
        this.userRatingList = userRatingList;
    }

    @Override
    public String toString() {
        return "UserRating{" +
                "ratingList=" + userRatingList +
                '}';
    }
}
