package com.ronnakash.reviewhub.common.items;

import java.util.UUID;

public interface ItemsService {

    void createItem(Item item);
    Item getItem(UUID id);
    Item getItem(String name);
    void updateItem(UUID id, ItemBuilder builder);
    // TODO: moving to gRPC
      
}
