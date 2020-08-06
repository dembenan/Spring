package net.codejava.Model;

import javax.persistence.*;
import java.util.List;


@Entity
public class User {
    private Integer id_user;
    private String nom_user;
    private String prenom_user;
    private String type_user;
    private String password_user;
    private Float solde;

    @OneToMany(mappedBy = "users")
    private List<Favoris> fovoris;

    public User() {
    }

    public User(Integer id_user, String nom_user, String prenom_user, String type_user, String password_user, Float solde) {

        this.id_user = id_user;
        this.nom_user = nom_user;
        this.prenom_user = prenom_user;
        this.type_user=type_user;
        this.password_user=password_user;
        this.solde=solde;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getNom_user() {
        return nom_user;
    }

    public void setNom_user(String nom_user) {
        this.nom_user = nom_user;
    }

    public String getPrenom_user() {
        return prenom_user;
    }

    public void setPrenom_user(String prenom_user) {
        this.prenom_user = prenom_user;
    }

    public String getType_user() {
        return type_user;
    }

    public void setType_user(String type_user) {
        this.type_user = type_user;
    }

    public String getPassword_user() {
        return password_user;
    }

    public void setPassword_user(String password_user) {
        this.password_user = password_user;
    }

    public Float getSolde() {
        return solde;
    }

    public void setSolde(Float solde) {
        this.solde = solde;
    }
}
