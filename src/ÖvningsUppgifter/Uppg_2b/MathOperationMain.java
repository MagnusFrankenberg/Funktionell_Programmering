package ÖvningsUppgifter.Uppg_2b;

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

        MathOperation addition = (a, b) -> a+b;
        MathOperation subtraction = (a, b) -> a-b;
        MathOperation multiplication = (a, b) -> a*b;
        MathOperation division = (a, b) -> a/b;

        System.out.println("10 + 5 = " + operate(10, 5, addition));
        System.out.println("10 - 5 = " + operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + operate(10, 5, division));

        //annat sätt
        System.out.println(addition.operation(10,5));
        System.out.println(subtraction.operation(10,5));
        System.out.println(multiplication.operation(10,5));
        System.out.println(division.operation(10,5));

        System.out.println("-------------------");

        //Uppgift 2b
        //MathOperation addition = (a, b) -> a + b;
        //MathOperation subtraction = (a, b) -> a - b;
        //(i, j) -> m.operation(i, j) + operation(i, j);
        // (10-5)+(10+5) = 20

        MathOperation justTesting = addition.add(subtraction);

        System.out.println(justTesting.operation(3,4));
        //  (-1) + 7 = 6

        //(i, j) -> operation(m.operation(i,j), operation(i,j));
        MathOperation test2 = addition.doubleUp(subtraction);

        System.out.println(test2.operation(3,4));
        // op (-1, 7) = 6

        // default MathOperation andThen(MathOperation after){
        // return (i, j) -> after.operation(operation(i,j), operation(i,j));
        MathOperation test3 = addition.andThen(subtraction);

        System.out.println(test3.operation(1,2));


        MathOperation magnus1 =  addition.multiply(addition);
        System.out.println(magnus1.operation(2,4));

        MathOperation magnus2 = addition.divide(subtraction);
        System.out.println(magnus2.operation(12,10));


    }
}