package TP;

import java.io.Serializable;

public class produit implements Serializable {
    public long id;
    public String nom;
    public String marque;
    public double prix;
    public String description;
    public int Nbstock;



    public long getId() {
        return id;
    }

    public  void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNbstock() {
        return Nbstock;
    }

    public void setNbstock(int nbstock) {
        Nbstock = nbstock;
    }

    public produit(long id, String nom, String marque, double prix, String description, int nbstock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        Nbstock = nbstock;
    }

    public produit() {
    }

    @Override
    public String toString() {
        return "produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", Nbstock=" + Nbstock +
                '}';
    }
}
