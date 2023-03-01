package ÖvningsUppgifter.Uppg_2a;

public class MathOperationMain {

    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    public static void main(String args[]) {
/*
      MathOperation addition = ???
      MathOperation subtraction =  ???
      MathOperation multiplication = ???
      MathOperation division = ???
      System.out.println("10 + 5 = " + operate(10, 5, addition));
      System.out.println("10 - 5 = " + operate(10, 5, subtraction));
      System.out.println("10 x 5 = " + operate(10, 5, multiplication));
      System.out.println("10 / 5 = " + operate(10, 5, division));
		*/

        MathOperation addition = (a,b) -> a+b;
        MathOperation subtraction = (a,b) -> a-b;
        MathOperation multiplication = (a,b) -> a*b;
        MathOperation division = (a,b) -> a/b;

        System.out.println("10 + 5 = " + operate(10, 5, addition));
        System.out.println("10 - 5 = " + operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + operate(10, 5, division));

        //annat sätt
        System.out.println(addition.operation(10,5));
        System.out.println(subtraction.operation(10,5));
        System.out.println(multiplication.operation(10,5));
        System.out.println(division.operation(10,5));


    }
}