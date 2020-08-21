package com.annotations.SpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component

public class Samsung {
	
	@Autowired
	Processor proc;
	public Processor getProc() {
		return proc;
	}
	public void setProc(Processor proc) {
		this.proc = proc;
	}
	public void config() 
	{
		System.out.println("Inside Samsung class");
		System.out.println(proc);
	}

}
