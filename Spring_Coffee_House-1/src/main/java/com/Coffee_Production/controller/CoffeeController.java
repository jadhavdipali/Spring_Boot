package com.Coffee_Production.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Coffee_Production.entity.Coffee;

@RestController
public class CoffeeController 
{	
		List<Coffee> coffees=new ArrayList<Coffee>();
		
		//Adding values
		
		public CoffeeController()
		{
			coffees.addAll(List.of
					(new Coffee("Hot Coffee",150.70),
					new Coffee("Cold Coffee",150.70),
					new Coffee("Cappuccino",150.70),
					new Coffee("Espresso",150.70),
					new Coffee("Americano",150.70),
					new Coffee("Latte",150.70),
					new Coffee("Iced Coffee",150.70),
					new Coffee("Caffee Mocha",150.70)));
		}
		@RequestMapping("/coffees")
		List<Coffee> getAllLeds()
		{
				return coffees;	
		}
}
