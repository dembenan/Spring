package net.codejava.Controller;
import net.codejava.Model.Article;
import net.codejava.Model.Categorie_article;
import net.codejava.Service.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService service ;

    @GetMapping("/article")
    public List<Article> list(){
        return service.listAll();
    }

    @GetMapping("/article/{id}")
    public Article get(@PathVariable Integer id){
        return service.get(id);
    }

    @PostMapping("/article")
    public void add(@RequestBody Article Article){
        service.save(Article);
    }
    @PutMapping("/article/{id}")
    public ResponseEntity<?> update(@RequestBody Article Article, @PathVariable Integer id) {
        try {
            Article existArticle = service.get(id);
            service.save(Article);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/article/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }







}

