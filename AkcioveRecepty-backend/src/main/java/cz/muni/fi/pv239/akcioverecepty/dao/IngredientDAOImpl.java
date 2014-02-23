package cz.muni.fi.pv239.akcioverecepty.dao;

import cz.muni.fi.pv239.akcioverecepty.entity.Ingredient;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * @author Peter Petrinec
 */
@Transactional
public class IngredientDAOImpl implements IngredientDAO {

    @PersistenceContext
    EntityManager em;

    public IngredientDAOImpl() {
    }

    public IngredientDAOImpl(EntityManager em) {
        if (em == null) {
            throw new IllegalArgumentException("Entity manager cannot be null");
        }
        this.em = em;
    }

    public void createIngredient(Ingredient ingredient) {
        //TODO: validacia
        em.persist(ingredient);
    }

    public Ingredient getIngredient(Long id) {
        //TODO: validacia
        return em.find(Ingredient.class, id);
    }
}
