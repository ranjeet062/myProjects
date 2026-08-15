package org.design.behavioral.pattern.strategy;

public class Test {
    public static void main(String[] args) {
        Context context = new Context(new StrategyA());
        context.executeStrategy(); // Output: Executing strategy A

        context.setStrategy(new StrategyB());
        context.executeStrategy(); // Output: Executing strategy B
    }
}
