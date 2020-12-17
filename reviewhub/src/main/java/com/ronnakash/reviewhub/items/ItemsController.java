package com.ronnakash.reviewhub.items;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public List<String> items() {
        return itemsService.getItems();
    }

    @RequestMapping(value = "/items/{name}", method = RequestMethod.GET)
    public RedirectView secret(@PathVariable("name") String name) {
        itemsService.createItem(name);
        return new RedirectView("/items");
    }

}
