package com.ronnakash.reviewhub.common.reviews;

import java.util.UUID;

public interface Review {

    UUID getId();
    String getOrigin();
    Item getItem();
    Score getScore();
    String getDescription();

}
