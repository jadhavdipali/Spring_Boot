package com.Constructor_Injection.entity1;

import com.Constructor_Injection.entity2.Subject;

public class Trainer 
{
	private Subject subject;
	
	public Trainer(Subject subject)
	{
		this.subject = subject;
	}
	
	//Printing The Constructor Injections
	public String teach()
	{
		return "<body bgcolor='pink' text='Blue'>"
					+ "<center><h1>Pallavi is Training "+subject.getSub_Name()+" To Dipali</h1></center>"
			+ "</body>";
	}
}