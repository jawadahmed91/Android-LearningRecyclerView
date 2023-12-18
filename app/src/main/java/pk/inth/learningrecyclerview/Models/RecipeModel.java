package pk.inth.learningrecyclerview.Models;

public class RecipeModel {

    int foodImage;
    String foodName;

    public RecipeModel(int foodImage, String foodName) {
        this.foodImage = foodImage;
        this.foodName = foodName;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
