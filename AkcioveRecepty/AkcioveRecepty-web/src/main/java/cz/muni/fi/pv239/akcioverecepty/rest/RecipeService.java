/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pv239.akcioverecepty.rest;

import cz.muni.fi.pv239.akcioverecepty.dao.RecipeDAO;
import cz.muni.fi.pv239.akcioverecepty.entity.Recipe;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Peter
 */
@Path("recipes")
public class RecipeService {
    
    private static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    private RecipeDAO recipeDAO = applicationContext.getBean("recipe", RecipeDAO.class);
    
    @Context
    private UriInfo context;
    
    public RecipeService() {
    }
    
    @GET
    @Produces("text/plain")
    public String getPlain() {
        StringBuilder returnString = new StringBuilder();
        List<Recipe> recipes = recipeDAO.getAllRecipes();
        for (Recipe r : recipes) {
            returnString.append(r.toString());
            returnString.append("\n");
        }

        return returnString.toString();
    }
}
