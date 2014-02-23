/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pv239.akcioverecepty.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Peter
 */
@Entity
public class Food implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "title_en")
    private String titleEn;
    @Column(name = "title_cz")
    private String titleCz;
    @Column(name = "title_sk")
    private String titleSk;
    @ManyToOne
    private Category category;

    @Override
    public String toString() {
        return "Food{" + "id=" + id + ", titleEn=" + titleEn + ", titleCz=" + titleCz + ", titleSk=" + titleSk + ", category=" + category + '}';
    }
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Food() {
    }
    
    public Food(String titleEn, String titleCz, String titleSk, Category category) {
        this.titleEn = titleEn;
        this.titleCz = titleCz;
        this.titleSk = titleSk;
        this.category = category;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
    }

    public String getTitleCz() {
        return titleCz;
    }

    public void setTitleCz(String titleCz) {
        this.titleCz = titleCz;
    }

    public String getTitleSk() {
        return titleSk;
    }

    public void setTitleSk(String titleSk) {
        this.titleSk = titleSk;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Equals and Hascode">
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Food other = (Food) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    //</editor-fold>
}
