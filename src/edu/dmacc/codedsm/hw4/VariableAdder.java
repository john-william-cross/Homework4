package edu.dmacc.codedsm.hw4;

public class VariableAdder {

    public final int FIRST_INT = 1;
    public int secondInt = 2;       //I notice the code still works without making these variables public

    public static void main(String[] args) {

        int thirdInt = 3;

        VariableAdder sum = new VariableAdder();

        int result = sum.FIRST_INT + sum.secondInt + thirdInt;

        System.out.println(result);

    }
}

