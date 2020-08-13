package com.test.custom.search;

public class AttrvalueExpression extends NaryExpression {

	public AttrvalueExpression(Operator operator, String attribute, Object value) {
		super(operator, new Attribute(attribute), new Literal(value));
	}


}
