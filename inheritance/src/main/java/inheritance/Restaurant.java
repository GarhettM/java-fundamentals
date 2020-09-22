package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private double stars = 0;
    private double priceCat = 0;
    private int numReviews = 0;
    private ArrayList<Review> listOfReviews = new ArrayList<>();

    public Restaurant(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStars() {
        return this.stars;
    }

    public void setStars(int stars) {
        double newStarCount = this.stars + stars;
        this.stars = newStarCount/numReviews;
    }

    public void setPriceCat(int priceCat) {
        double newPriceCount = this.priceCat + priceCat;
        this.priceCat = newPriceCount/numReviews;
    }

    public double getPriceCat() {
        return this.priceCat;
    }

    public ArrayList<Review> getListOfReviews() {
        return listOfReviews;
    }

    public void setListOfReviews(ArrayList<Review> listOfReviews) {
        this.listOfReviews = listOfReviews;
    }

    public String addReview(String restType, String foodQuality, int stars, int priceCat)   {

        Review newReview = new Review(restType, foodQuality, stars, priceCat);
        numReviews++;
        this.setStars(newReview.getStars());
        this.setPriceCat(newReview.getPriceCat());
        listOfReviews.add(newReview);
        for(Review rev : listOfReviews) {
            System.out.println(rev);
        }
        return String.format("This restaurant serves Fast Food and is garbage. I gave it 1 stars and is 1 $'s.", name, stars, restType, foodQuality, priceCat);
    }

    public String toString() {
        return String.format("%s is a restaurant.", name);
    }
}
