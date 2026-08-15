package org.design.behavioral.pattern.interpreter2;

public class Client {
    public static void main(String[] args) {
        Expression expression = new OrExpression(new AndExpression(
                new TotalGT(1000), new IsPrime()
        ), new CountryEq("US"));

        System.out.println("Condition: " + expression.interpret(new CartContext(1200, "US", true)));


        Expression expression1 = new OrExpression(new AndExpression(
                new TotalGT(1500), new IsPrime()
        ), new CountryEq("US"));

        System.out.println("Condition: " + expression1.interpret(new CartContext(1200, "IND", false)));

        Expression expression2 = new AndExpression(new OrExpression(
                new TotalGT(1500), new IsPrime()
        ), new CountryEq("US"));

        System.out.println("Condition: " + expression2.interpret(new CartContext(1200, "IND", true)));
    }
}
