package inheritance;

public class Review{
    private String restType;
    private String foodQuality;
    private int stars = 0;
    private int priceCat = 0;



    public Review(String restType, String foodQuality, int stars, int priceCat) {
        this.restType = restType;
        this.foodQuality = foodQuality;
        this.stars = stars;
        this.priceCat = priceCat;
    }

    public int getPriceCat() {
        return priceCat;
    }

    public int getStars() {
        return stars;
    }

    public String getRestType() {
        return restType;
    }

    public void setRestType(String restType) {
        this.restType = restType;
    }

    public String getFoodQuality() {
        return foodQuality;
    }

    public void setFoodQuality(String foodQuality) {
        this.foodQuality = foodQuality;
    }

    public String toString() {
        return String.format("This restaurant serves %s and is %s. I gave it %d stars and is %d $'s.", restType, foodQuality, stars, priceCat);
    }
}
