package com.ranjeet.factory;

import com.ranjeet.Animal;
import com.ranjeet.AnimalService;
import com.ranjeet.Circle;
import com.ranjeet.HumanBeing;
import com.ranjeet.Triangle;

public class FactoryService {

	public Object getBean(String type){
		if(type=="animal") return new Animal();
		if(type=="humam") return new HumanBeing();
		if(type=="animalService") return new AnimalServiceProxy();
		
		return null;
	}
}
