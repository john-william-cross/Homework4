package edu.dmacc.codedsm.hw4;

public class VariableAdder {

    final int FIRST_INT = 1;
    int secondInt = 2;

    public static void main(String[] args) {

        int thirdInt = 3;

        VariableAdder sum = new VariableAdder();

        int result = sum.FIRST_INT + sum.secondInt + thirdInt;

        System.out.println(result);
    }
}

