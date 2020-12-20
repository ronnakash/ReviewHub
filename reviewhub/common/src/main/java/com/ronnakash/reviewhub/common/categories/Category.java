package com.ronnakash.reviewhub.common.categories;

import java.util.UUID;

public interface Category {

    String getName();
    UUID getId();
    Set<Item> getItems();

}
