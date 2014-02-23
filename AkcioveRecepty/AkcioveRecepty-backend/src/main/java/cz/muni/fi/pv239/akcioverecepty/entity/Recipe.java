package cz.muni.fi.pv239.akcioverecepty.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author Peter
 */
@Entity
@NamedQuery(name = "getAllRecipes", query = "SELECT r FROM Recipe r")
public class Recipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Ingredient> ingredients;
    private String steps;

    @Override
    public String toString() {
        return "Recipe{" + "id=" + id + ", title=" + title + ", ingredients=" + ingredients + ", steps=" + steps + '}';
    }
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Recipe() {
    }
    
    public Recipe(String title, List<Ingredient> ingredients, String steps) {
        this.title = title;
        this.ingredients = ingredients;
        this.steps = steps;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    
    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    
    public String getSteps() {
        return steps;
    }
    
    public void setSteps(String steps) {
        this.steps = steps;
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Equals and Hashcode">
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Recipe other = (Recipe) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    //</editor-fold>
}
