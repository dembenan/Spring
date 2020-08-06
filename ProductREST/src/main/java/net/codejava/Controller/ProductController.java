package net.codejava.Controller;
import net.codejava.Service.*;
import net.codejava.Model.Product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class ProductController {

    @Autowired
    private ProductService service ;

    @GetMapping("/products")
    public List<Product> list(){
        return service.listAll();
    }

    @GetMapping("/products/{id}")
    public Product get(@PathVariable Integer id){
        return service.get(id);
    }

    @PostMapping("/products")
    public void add(@RequestBody Product product){
        service.save(product);
    }
    @PutMapping("/products/{id}")
    public ResponseEntity<?> update(@RequestBody Product product,@PathVariable Integer id) {
        try {
            Product existProduct = service.get(id);
            service.save(product);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }







}
