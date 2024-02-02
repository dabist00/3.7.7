public class Cereal {
    private String name;
    private String type;
    private int calories;
    private int protein;
    private int fat;
    private int sodium;
    private float fiber;
    private float carbohydrates;
    private int sugar;
    private int potassium;
    private int vitamins;
    private int shelf;
    private float weight;
    private float cup;
    private float rating;

    public Cereal(String name, String type, int calories, int protein, int fat, int sodium, float fiber, float carbohydrates, int sugar, int potassium, int vitamins, int shelf, float weight, float cup, float rating){
        this.name = name;
        this.type = type;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.fiber = fiber;
        this.carbohydrates = carbohydrates;
        this.sugar = sugar;
        this.potassium = potassium;
        this.vitamins = vitamins;
        this.shelf = shelf;
        this.weight = weight;
        this.cup = cup;
        this.rating = rating;
    }

    public String toString(){
        return name;
    }
}
