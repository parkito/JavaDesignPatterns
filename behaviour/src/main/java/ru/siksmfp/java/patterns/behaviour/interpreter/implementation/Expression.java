package ru.siksmfp.java.patterns.behaviour.interpreter.implementation;

public abstract class Expression {

    protected String leftOperand;
    protected String rightOperand;

    public abstract String interpret(String string);

    protected Expression() {
    }

    protected Expression(String leftOperand) {
        this.leftOperand = leftOperand;
    }

    protected Expression(String leftOperand, String rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }
}
