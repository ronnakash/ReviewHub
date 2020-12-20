package com.ronnakash.reviewhub.common.items;

import java.util.UUID;

public interface Item {

    String getName();
    UUID getId();
    Set<Category> getCategories();
    List<Review> getReviews();
      
}
