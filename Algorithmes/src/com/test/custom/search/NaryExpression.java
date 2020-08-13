package com.test.custom.search;

import java.util.Arrays;
import java.util.List;

public class NaryExpression extends Expression {

	private List<Expression> operands_;
	
	public NaryExpression(Operator operator, List<Expression> operands) {
		super(operator);
		operands_=operands;
	}
	
	public NaryExpression(Operator operator, Expression... operands) {
		this(operator,Arrays.asList(operands));
	}

	public List<Expression> getOperands() {
        return operands_;
    }

}
