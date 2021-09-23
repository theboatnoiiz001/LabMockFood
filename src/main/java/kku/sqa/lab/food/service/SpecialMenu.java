package kku.sqa.lab.food.service;

import java.util.ArrayList;
import java.util.List;

import kku.sqa.lab.food.api.FoodService;

public class SpecialMenu {
	private FoodService foodService;
    public SpecialMenu(FoodService foodService) {

        super();
        this.foodService = foodService;

    }
    //get only books relative to cooking in the catalogue of a certain month
    public List <String> getFoodList(String nameShop) {

        List <String> foodlist = new ArrayList<String>();
        List <String> allfoodlist = foodService.getFoodList(nameShop);
        for (String food: allfoodlist) {

            if (food.contains("pork")) {
                foodlist.add(food);

            }

        }
        return foodlist;

    }
}
