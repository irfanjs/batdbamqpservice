package com.infy.ci.batdbamqpservice;

import java.util.ArrayList;
import java.util.List;

public class ObjectClass {
	
	public ObjectClass(String resultType) {
		name = resultType;
		
	}
	
	public String name;
	public List<Integer> data = new ArrayList<Integer>();
}
