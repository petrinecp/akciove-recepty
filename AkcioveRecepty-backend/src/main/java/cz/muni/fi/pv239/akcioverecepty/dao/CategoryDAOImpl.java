/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pv239.akcioverecepty.dao;

import cz.muni.fi.pv239.akcioverecepty.entity.Category;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author Peter
 */
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

    @PersistenceContext
    EntityManager em;
    
    public void createCategory(Category category) {
        em.persist(category);
    }

    public Category getCategory(Long id) {
        return em.find(Category.class, id);
    }
    
}
