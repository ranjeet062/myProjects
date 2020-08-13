package com.ranjeet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ranjeet.aspect.Loggable;

@Component
public class AnimalService {

	@Autowired
	private Animal animal;
	
	@Autowired
	private HumanBeing human;
	

	@Loggable
	public HumanBeing getHuman() {
		return human;
	}

	public void setHuman(HumanBeing human) {
		this.human = human;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
}
