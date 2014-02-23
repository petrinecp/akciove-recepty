package cz.muni.fi.pv239.akcioverecepty.dao;

import cz.muni.fi.pv239.akcioverecepty.entity.Category;

/**
 *
 * @author Peter
 */
public interface CategoryDAO {
    void createCategory(Category category);
    Category getCategory(Long id);
}
