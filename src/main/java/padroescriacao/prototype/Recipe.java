package padroescriacao.prototype;

import java.util.ArrayList;
import java.util.List;

public class Recipe implements Cloneable {
    private String name;
    private List<Ingredient> ingredients;

    public Recipe(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void scale(double factor) {
        for (Ingredient ingredient : ingredients) {
            ingredient.scale(factor);
        }
    }

    @Override
    public Recipe clone() throws CloneNotSupportedException {
        Recipe recipeClone = (Recipe) super.clone();
        recipeClone.ingredients = new ArrayList<>();
        for (Ingredient ingredient : ingredients) {
            recipeClone.ingredients.add(ingredient.clone());
        }
        return recipeClone;
    }

    @Override
    public String toString() {
        return "Recipe{name='" + name + "', ingredients=" + ingredients + "}";
    }
}
