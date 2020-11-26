package HomeWork;

public class AnimalsLegs {

    public static void main(String[] args) {

        int cows = 23;
        int chickens = 42;
        int cowsLegs = 4;
        int chickenLegs = 2;
        int totalLegs;

        cowsLegs = cows * cowsLegs;
        chickenLegs = chickens * chickenLegs;
        totalLegs = cowsLegs + chickenLegs;


        int cowsPrice = 1253;
        int chickensPrice = 11;
        int totalPrice;

        cowsPrice = cowsPrice * cows;
        chickensPrice = chickensPrice * chickens;
        totalPrice =  cowsPrice + chickensPrice;



        System.out.println(totalLegs);
        System.out.println(totalPrice);

    }
}
