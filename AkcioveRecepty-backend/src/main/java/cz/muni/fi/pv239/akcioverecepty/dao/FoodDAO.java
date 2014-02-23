package cz.muni.fi.pv239.akcioverecepty.dao;

import cz.muni.fi.pv239.akcioverecepty.entity.Food;

/**
 *
 * @author Peter
 */
public interface FoodDAO {
    void createFood(Food food);
    Food getFood(Long id);
}
