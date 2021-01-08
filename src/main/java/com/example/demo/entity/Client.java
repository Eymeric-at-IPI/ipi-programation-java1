package com.example.demo.entity;

import javax.persistence.*;

/**
 * Entity représentant un article.
 */
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nom;

    @Column
    private String prenom;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String _prenom) {
        this.prenom = _prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String _nom) {
        this.nom = _nom;
    }

}
