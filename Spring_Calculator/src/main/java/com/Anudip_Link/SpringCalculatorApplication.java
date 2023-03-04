package com.Anudip_Link;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SpringCalculatorApplication {
	
	
	
	
		//Addition
	     @RequestMapping("/add")
	     public String Addition(@RequestParam(name="num", required=true, defaultValue="25")int num1,
	     						@RequestParam(name="num", required=true, defaultValue="45") int num2)
	     {
	    	 int ans = num1+num2;
	    	 return"<body bgcolor='Pink' text='Yellow'><center><h1>Addition is :-"+ans+"</h1></center></body>";
	    	 
	     }
	     
	     //Substraction
	     
	         @RequestMapping("/sub")
	         public String Substraction(@RequestParam(name="num", required=true, defaultValue="25")int num1,
	         						@RequestParam(name="num", required=true, defaultValue="45") int num2)
	         {
	        	 int ans = num1-num2;
	        	 return"<body bgcolor='Pink' text='Yellow'><center><h1>Addition is :-"+ans+"</h1></center></body>";
	        	 
	         }
	         
	         
	         //Multiplication
	         
	             @RequestMapping("/mul")
	             public String Multiplication(@RequestParam(name="num", required=true, defaultValue="25")int num1,
	             						@RequestParam(name="num", required=true, defaultValue="45") int num2)
	             {
	            	 int ans = num1*num2;
	            	 return"<body bgcolor='Pink' text='Yellow'><center><h1>Addition is :-"+ans+"</h1></center></body>";
	            	 
	             }
	         
	             
	           //Division
	             
	                 @RequestMapping("/div")
	                 public String Division(@RequestParam(name="num", required=true, defaultValue="25")int num1,
	                 						@RequestParam(name="num", required=true, defaultValue="45") int num2)
	                 {
	                	 int ans = num1/num2;
	                	 return"<body bgcolor='Pink' text='Yellow'><center><h1>Addition is :-"+ans+"</h1></center></body>";
	                	 
	                 }
	


	public static void main(String[] args) {
		SpringApplication.run(SpringCalculatorApplication.class, args);
	}

}
