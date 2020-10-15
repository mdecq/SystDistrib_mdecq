package fr.i.demo1210.web.controller.web;

import java.io.Serializable;

public class Product implements Serializable {
    private int code;
    private String nom;
    private double prix;

    public Product(int code, String nom, double prix) {
        this.code = code;
        this.nom = nom;
        this.prix = prix;
    }

    public int getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
