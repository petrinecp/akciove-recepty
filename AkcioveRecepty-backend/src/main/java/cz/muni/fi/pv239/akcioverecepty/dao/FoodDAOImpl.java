/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pv239.akcioverecepty.dao;

import cz.muni.fi.pv239.akcioverecepty.entity.Food;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author Peter
 */
@Transactional
public class FoodDAOImpl implements FoodDAO {
    
    @PersistenceContext
    EntityManager em;
    
    public void createFood(Food food) {
        em.persist(food);
    }

    public Food getFood(Long id) {
        return em.find(Food.class, id);
    }
    
}
