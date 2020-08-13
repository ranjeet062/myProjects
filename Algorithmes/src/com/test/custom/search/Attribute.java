package com.test.custom.search;

public class Attribute extends Expression{

	private final String name_;
	public Attribute(String name) {
		super(Operator.ATTRIBUTE);
		name_= name;
	}
    public String getName() {
        return name_;
    }
	
}
