package kku.sqa.lab.food.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import kku.sqa.lab.food.api.FoodService;

class FoodListTestMock {

	@Test
	void test() {
		FoodService foodService = mock(FoodService.class);
		List <String> listFood = Arrays.asList("Grilled pork with rice","Fried chicken with rice","Crispy pork with rice","Thai traditional fried rice with pork","Chef’s special fried rice");
		when(foodService.getFoodList("goodies")).thenReturn(listFood);
		
		SpecialMenu speacialMenu = new SpecialMenu(foodService);
		List <String> foodList = speacialMenu.getFoodList("goodies");
		System.out.println(foodList);
		assertEquals(4,foodList.size());
	}

}
