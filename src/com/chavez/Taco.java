package com.chavez;
//fields
public class Taco {
    private String name;
    private String location;
    private double price;
    private double rating;
    private int numOfRatings;
    private static int tacoHolder;

    //getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getNumOfRatings() {
        return numOfRatings;
    }

    public void setNumOfRatings(int numOfRatings) {
        this.numOfRatings = numOfRatings;
    }

    public void rateTaco(int score){


        if(rating > 0 && rating < 11) {
            rating = ((rating * numOfRatings) + score) / ++numOfRatings;
        }

    }


    public void displayTaco(){
        System.out.println(
                "\n The taco location is: " + location +
                "\n The price is: " + price +
                "\n The taco rating is: " + rating +
                "\n The number of ratings is: " + numOfRatings);

    }
//improved taco




    public static int showMeTheTacos(){
        return tacoHolder;
    }



    public Taco(){
        tacoHolder++;
        name = "";
        location = "";
        price = 0;
        rating = 0;
        numOfRatings = 0;

    }

    public Taco(String n, String l, double p){

        name = n;
        location = l;
        price = p;
        tacoHolder++;

    }
    protected void finalize(){
        tacoHolder--;
    }
}

