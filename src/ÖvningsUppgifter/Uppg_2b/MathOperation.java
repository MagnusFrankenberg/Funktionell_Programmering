package ÖvningsUppgifter.Uppg_2b;

public interface MathOperation {
    int operation(int a, int b);

    //uppgift 2b. GÖr inget vettigt
    //MathOperation justTesting = addition.add(subtraction);
    default MathOperation add(MathOperation m){
        return (i, j) -> m.operation(i, j) + operation(i, j);
    }

    default MathOperation doubleUp(MathOperation m){
        return (i, j) -> operation(m.operation(i,j), operation(i,j));
    }

    default String test(Integer i){
        return "hej";
    }


    default MathOperation andThen(MathOperation after){
        return (i, j) -> after.operation(operation(i,j), operation(i,j));
    }

    default MathOperation multiply(MathOperation m){
        return (i,j)-> m.operation(i,j) * operation(i,j);
    }

    default MathOperation divide(MathOperation m){
        return (i,j)-> operation(i,j)/m.operation(i,j);
    }

}
