package com.annotations.SpringAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Processor {

	public void process() {
		System.out.println("Inside Snapdragon");
		
	}

	@Override
	public String toString() {
		return "Inside Snapdragon tostring";
	}
	

}
