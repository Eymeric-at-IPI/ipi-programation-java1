package com.example.demo.dto;

/**
 * Classe permettant d'exposer des données au format JSON au client.
 */
public class ClientDto {
    private Long id;
    private String nom;
    private String prenom;

    public ClientDto() {

    }

    public ClientDto(Long _id, String _nom, String _prenom) {
        this.id = _id;
        this.nom = _nom;
        this.prenom = _prenom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long _id) {
        this.id = _id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String _nom) {
        this.nom = _nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String _prenom) {
        this.prenom = _prenom;
    }
}
