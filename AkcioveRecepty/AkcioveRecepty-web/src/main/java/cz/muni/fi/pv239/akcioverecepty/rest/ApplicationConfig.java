package cz.muni.fi.pv239.akcioverecepty.rest;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Peter
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(cz.muni.fi.pv239.akcioverecepty.rest.RecipeService.class);
    }
}
