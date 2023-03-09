package com.Constructor_Injection.entity2;

public class Subject 
{
	private String Sub_Name;
	
	public Subject(String Sub_Name)
	{
		this.Sub_Name = Sub_Name;
	}

	public String getSub_Name()
	{
		return Sub_Name;
	}
}
