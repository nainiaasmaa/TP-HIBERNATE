/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Lenovo
 */
@Entity 
@Table(name = "produits")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
     @Column(name = "marque")
    private String marque ;
      @Column(name = "reference")
    private String reference ;
       @Column(name = "dateAchat")
    private Date dateAchat;
        @Column(name = "prix")
    private Double prix ;
         @Column(name = "designation")
    private String designation;

    public void setId(int id) {
        this.id = id;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Produit(String marque, String reference, Date dateAchat, Double prix, String designation) {
        this.marque = marque;
        this.reference = reference;
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.designation = designation;
    }
    public Produit() {
      
    }

    public int getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public String getReference() {
        return reference;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public Double getPrix() {
        return prix;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", marque=" + marque + ", reference=" + reference + ", dateAchat=" + dateAchat + ", prix=" + prix + ", designation=" + designation + '}';
    }
    
    
}
