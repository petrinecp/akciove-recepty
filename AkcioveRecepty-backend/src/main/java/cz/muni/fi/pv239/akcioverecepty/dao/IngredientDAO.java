/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pv239.akcioverecepty.dao;

import cz.muni.fi.pv239.akcioverecepty.entity.Ingredient;

/**
 * @author Peter Petrinec
 * @version 1.0
 */
public interface IngredientDAO {
    /**
     * 
     * @return 
     */
    void createIngredient(Ingredient ingredient);
    Ingredient getIngredient(Long id);
}
