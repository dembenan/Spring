package net.codejava.Service;
import net.codejava.Model.Categorie_article;
import net.codejava.Repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Categorie_articleService {
    @Autowired
    private Categorie_articleRepository repoc;

        public List<Categorie_article> listAll(){
        return repoc.findAll();
    }

    public void save(Categorie_article categorie_article){
        repoc.save(categorie_article);
    }

    public Categorie_article get(Integer id_categorie){
        return repoc.findById(id_categorie).get();
    }

    public void delete(Integer id_categorie){

        repoc.deleteById(id_categorie);
    };
}

