package net.codejava.Service;
import net.codejava.Model.Article;
import net.codejava.Repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository repoa;

    public List<Article> listAll(){
        return repoa.findAll();
    }

    public void save(Article Article){
        repoa.save(Article);
    }

    public Article get(Integer id_article){
        return repoa.findById(id_article).get();
    }

    public void delete(Integer id_article){

        repoa.deleteById(id_article);
    };
}

