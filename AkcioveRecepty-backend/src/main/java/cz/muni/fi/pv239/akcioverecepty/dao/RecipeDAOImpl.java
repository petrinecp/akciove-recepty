package cz.muni.fi.pv239.akcioverecepty.dao;

import cz.muni.fi.pv239.akcioverecepty.entity.Recipe;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 *
 * @author Peter
 */
@Transactional
public class RecipeDAOImpl implements RecipeDAO {
    
    @PersistenceContext
    EntityManager em;
    
    public void createRecipe(Recipe recipe) {
        em.persist(recipe);
    }

    public Recipe getRecipe(Long id) {
        return em.find(Recipe.class, id);
    }

    public List<Recipe> getAllRecipes() {
        TypedQuery<Recipe> query = em.createNamedQuery("getAllRecipes", Recipe.class);
        return (List<Recipe>) query.getResultList();
    }
}
