package com.test.custom.search;

public class Literal extends Expression {

	private Object value_;
	public Literal(Object value) {
		super(Operator.LITERAL);
		value_=value;
	}

	public Object getValue(){
		return value_;
	}
}
