package io.javabrains.ratingdataservice.models;

import java.util.List;

public class UserRating {

    List<Rating> userRatingList;

    public UserRating(List<Rating> userRatingList) {
        this.userRatingList = userRatingList;
    }

    public UserRating() {
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
