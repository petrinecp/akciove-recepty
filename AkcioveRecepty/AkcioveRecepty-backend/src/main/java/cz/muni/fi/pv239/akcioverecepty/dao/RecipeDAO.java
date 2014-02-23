package cz.muni.fi.pv239.akcioverecepty.dao;

import cz.muni.fi.pv239.akcioverecepty.entity.Recipe;
import java.util.List;

/**
 *
 * @author Peter
 */
public interface RecipeDAO {
    void createRecipe(Recipe recipe);
    Recipe getRecipe(Long id);
    List<Recipe> getAllRecipes();
}
