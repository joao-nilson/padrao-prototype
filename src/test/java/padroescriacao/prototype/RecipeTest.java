package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void testCloneAndScale() throws CloneNotSupportedException {
        Recipe recipe = new Recipe("Pancakes");
        recipe.addIngredient(new Ingredient("Flour", 200));
        recipe.addIngredient(new Ingredient("Sugar", 50));

        Recipe recipeClone = recipe.clone();
        recipeClone.setName("Pancakes x2");
        recipeClone.scale(2);

        assertEquals("Recipe{name='Pancakes', ingredients=[Flour=200.0g, Sugar=50.0g]}", recipe.toString());
        assertEquals("Recipe{name='Pancakes x2', ingredients=[Flour=400.0g, Sugar=100.0g]}", recipeClone.toString());
    }
}
