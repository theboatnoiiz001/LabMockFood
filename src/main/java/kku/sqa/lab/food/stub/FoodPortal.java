package kku.sqa.lab.food.stub;

import java.util.Arrays;
import java.util.List;

import kku.sqa.lab.food.api.FoodService;

public class FoodPortal implements FoodService{
	
	public List<String> getFoodList(String nameShop) {
		
		return Arrays.asList("Grilled pork with rice","Fried chicken with rice","Crispy pork with rice","Grilled pork with noodles","Fried chicken with noodles","Crispy pork with noodles","Thai traditional fried rice with pork","Chef’s special fried rice");
	
	}

}
