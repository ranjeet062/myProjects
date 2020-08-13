package com.ranjeet.gupta;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
/*@DiscriminatorValue(value = "BIKE")*/
public class TwoWheeler extends Vehical {
 private String steeringWheeal;

public String getSteeringWheeal() {
	return steeringWheeal;
}

public void setSteeringWheeal(String steeringType) {
	this.steeringWheeal = steeringType;
}

 
}
