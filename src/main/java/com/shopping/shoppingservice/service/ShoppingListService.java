package com.shopping.shoppingservice.service;

import com.shopping.shoppingservice.model.ShoppingList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingListService {

    private List<ShoppingList> shoppingLists = new ArrayList<>();



    public List<ShoppingList> getShoppingLists(){
        return shoppingLists;
    }

    public void addShoppingList(ShoppingList shoppingList){
        shoppingLists.add(shoppingList);
    }


    public List<ShoppingList> deleteShoppingList(String productId){
        shoppingLists.remove(shoppingLists.stream().filter(x -> x.getProductId().equals(productId)).findFirst().get());
        return shoppingLists;
    }




}
