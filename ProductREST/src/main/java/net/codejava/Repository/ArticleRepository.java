package net.codejava.Repository;
import net.codejava.Model.Article;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository <Article,Integer> {
}


