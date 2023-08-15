package com.shopping.shoppingservice.controller;

import com.shopping.shoppingservice.model.ShoppingList;
import com.shopping.shoppingservice.service.ShoppingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopper")
public class ShoppingController {

    @Autowired
    private ShoppingListService shoppingListService;

    @RequestMapping("/hello")
    public String getHello() {
        return "Hello World";
    }

    @RequestMapping("/queryshoppinglist/{productId}/{productName}/{productDesc}")
    public ShoppingList getShoppingListDetails(@PathVariable String productId, @PathVariable String productName, @PathVariable String productDesc){
        return new ShoppingList(productId, productName, productDesc);
    }

    @RequestMapping("/shoppinglist")
    public List<ShoppingList> getShoppingList(){
        return shoppingListService.getShoppingLists();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/addshoppinglist")
    public void addShoppingList(@RequestBody ShoppingList shoppingList){
        shoppingListService.addShoppingList(shoppingList);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/deletesl/{productId}")
    public List<ShoppingList> deleteShoppingList(@PathVariable String productId){
        return shoppingListService.deleteShoppingList(productId);
    }


}
