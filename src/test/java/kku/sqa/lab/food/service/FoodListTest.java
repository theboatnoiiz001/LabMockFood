package kku.sqa.lab.food.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import kku.sqa.lab.food.api.FoodService;
import kku.sqa.lab.food.stub.FoodPortal;

class FoodListTest {

	@Test
	void test() {
		FoodService foodService = new FoodPortal();
		SpecialMenu listfood = new SpecialMenu(foodService);
		List<String> foodList = listfood.getFoodList("goodies");
		assertEquals(5,foodList.size());
	}

}
