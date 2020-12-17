package com.ronnakash.reviewhub.items;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class ItemsService {
    
    List<String> items;

    @PostConstruct
    private void init(){
        items = new ArrayList<>();
    }

    public void createItem(String name){
        items.add(name);
    }

    public List<String> getItems(){
        return items;
    }

}
