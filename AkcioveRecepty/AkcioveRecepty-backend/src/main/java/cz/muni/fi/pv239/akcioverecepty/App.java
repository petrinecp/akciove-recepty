package cz.muni.fi.pv239.akcioverecepty;

import cz.muni.fi.pv239.akcioverecepty.dao.CategoryDAO;
import cz.muni.fi.pv239.akcioverecepty.dao.FoodDAO;
import cz.muni.fi.pv239.akcioverecepty.dao.IngredientDAO;
import cz.muni.fi.pv239.akcioverecepty.dao.RecipeDAO;
import cz.muni.fi.pv239.akcioverecepty.entity.Category;
import cz.muni.fi.pv239.akcioverecepty.entity.Food;
import cz.muni.fi.pv239.akcioverecepty.entity.Ingredient;
import cz.muni.fi.pv239.akcioverecepty.entity.Recipe;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appContext = 
    	  new ClassPathXmlApplicationContext("applicationContext.xml");
        
        CategoryDAO categoryDAO = (CategoryDAO)appContext.getBean("category");
        FoodDAO foodDAO = (FoodDAO)appContext.getBean("food");
        IngredientDAO ingredientDAO = (IngredientDAO)appContext.getBean("ingredient");
        RecipeDAO recipeDAO = (RecipeDAO)appContext.getBean("recipe");
        
        Category category = new Category("kategoria1");
        categoryDAO.createCategory(category);
        
        Food food = new Food("Onion", "Cibule", "Cibuľa", category);
        foodDAO.createFood(food);
        
        Ingredient ingredient = new Ingredient(food, 1, Unit.ks);
        ingredientDAO.createIngredient(ingredient);
        
        List<Ingredient> ingredients = new ArrayList<Ingredient>();
        ingredients.add(ingredient);
        Recipe recipe = new Recipe("Nakrájaná cibuľa", ingredients, "Cibuľu očistíme a nakrájame na \"mesiačiky\".");
        recipeDAO.createRecipe(recipe);
        
    }
}
