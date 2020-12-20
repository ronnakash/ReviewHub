package com.ronnakash.reviewhub.common.reviews;

public interface Score {

    List<ScoreComponent> getComponents();
    Double getAvg();

}
