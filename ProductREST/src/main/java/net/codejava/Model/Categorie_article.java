package net.codejava.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Categorie_article {
    private Integer id_categorie;
    private String nom_categorie;


    /*
    @ManyToOne
    @JoinColumn(name="id_user", nullable=false)
    private User users;

     */

    @OneToMany(mappedBy = "categorie_article")
    private List<Article> Article;



    public Categorie_article() {
    }
    public Categorie_article(Integer id_categorie, String nom_categorie) {

        this.id_categorie = id_categorie;
        this.nom_categorie = nom_categorie;


    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Integer getId_categorie() {
        return id_categorie;
    }

    public void setId_categorie(Integer id_categorie) {
        this.id_categorie = id_categorie;
    }

    public String getNom_categorie() {
        return nom_categorie;
    }

    public void setNom_categorie(String nom_categorie) {
        this.nom_categorie = nom_categorie;
    }
}



