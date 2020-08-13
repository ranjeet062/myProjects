package com.ranjeet.gupta;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
/*@DiscriminatorValue(value="CAR")*/
public class FourWheeler extends Vehical {

	 private String steeringHandle;

	 public String getSteeringHandle() {
	 	return steeringHandle;
	 }

	 public void setSteeringHandle(String steeringType) {
	 	this.steeringHandle = steeringType;
	 }
}
