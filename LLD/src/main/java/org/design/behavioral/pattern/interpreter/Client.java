package org.design.behavioral.pattern.interpreter;

public class Client {
    public static void main(String[] args) {
        Expression num1 = new NumberExpression(5);
        Expression num2 = new NumberExpression(10);

        Expression addition = new AddExpression(num1, num2);
        int sum = addition.interpret();
        System.out.println("Rayansh and Cikaa Solving Sum :");
        System.out.println("5 + 10 = " + sum);

        Expression num3 = new NumberExpression(2);
        Expression subtraction = new SubtractExpression(addition, num3);

        System.out.println("( 5 + 10 ) - 2 = " + subtraction.interpret());
        int i = new SubtractExpression(
            new AddExpression(new NumberExpression(5), new NumberExpression(10)),
            new NumberExpression(2)
        ).interpret();

        System.out.println("Result of ( 5 + 10 ) - 2 = " + i);

    }
}
