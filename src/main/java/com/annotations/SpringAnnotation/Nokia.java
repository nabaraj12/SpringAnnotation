package com.annotations.SpringAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Nokia implements Processor {

	@Override
	public String toString() {
		return "InsideNokia toString";
	}

	public void process() {
		// TODO Auto-generated method stub
		
	}

}
