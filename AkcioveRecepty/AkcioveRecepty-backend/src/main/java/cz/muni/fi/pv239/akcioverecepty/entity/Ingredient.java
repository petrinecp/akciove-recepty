/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pv239.akcioverecepty.entity;

import cz.muni.fi.pv239.akcioverecepty.Unit;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author Peter Petrinec
 * @version 1.0
 */
@Entity
public class Ingredient implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    private Food food;
    private int amount;
    @Enumerated(EnumType.STRING)
    private Unit unit;

    @Override
    public String toString() {
        return "Ingredient{" + "id=" + id + ", food=" + food + ", amount=" + amount + ", unit=" + unit + "}";
    }
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Ingredient() {
    }
    
    public Ingredient(Food food, int amount, Unit unit) {
        this.food = food;
        this.amount = amount;
        this.unit = unit;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Equals and Hashcode">
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Ingredient other = (Ingredient) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    //</editor-fold>
}
