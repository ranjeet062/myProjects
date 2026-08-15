package org.design.behavioral.pattern.command;

public class OrderInvoker {
    private Command command;

    public OrderInvoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
