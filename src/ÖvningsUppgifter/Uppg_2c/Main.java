package ÖvningsUppgifter.Uppg_2c;


public class Main{


    public static void main(String[] args) {


        SingleDigitOperation square = x-> x*x;
        System.out.println(square.operate(6));


        SingleDigitOperation isPositive = x-> x > 0 ? 1:0;

        System.out.println(isPositive.operate(-4));
        System.out.println(isPositive.operate(6));






        //Traditionellt sätt att skriva på med anonym klass
        SingleDigitOperation ickefunktion = new SingleDigitOperation() {
            @Override
            public int operate(int x) {
                return x*x;
            }
        };

        System.out.println(ickefunktion.operate(7));
    }
}
