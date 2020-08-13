package com.ranjeet.factory;

import com.ranjeet.Animal;
import com.ranjeet.AnimalService;
import com.ranjeet.aspect.LogginAspect;

public class AnimalServiceProxy extends AnimalService {

	public Animal getAnimal(){
		new LogginAspect().loggingAdvice();
		return super.getAnimal();
		
	}
}
