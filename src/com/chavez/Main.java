package com.chavez;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Taco test = new Taco();

        test.setName("Chorizo");
        test.setLocation("El Tibu, Madera");
        test.setPrice(1.78);
        test.setNumOfRatings(5);
        test.setRating(8);





        Taco test2 = new Taco("asada", "Fresno, CA", 2.00);

        Taco.showMeTheTacos();

        test.displayTaco();
        test2.displayTaco();


        System.out.println("\n This is the amount of tacos in system is " + Taco.showMeTheTacos());
    }


}
