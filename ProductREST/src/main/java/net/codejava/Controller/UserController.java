package net.codejava.Controller;
import net.codejava.Service.*;
import net.codejava.Model.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class UserController {

    @Autowired
    private UserService service ;

    @GetMapping("/users")
    public List<User> list(){
        return service.listAll();
    }

    @GetMapping("/users/{id}")
    public User get(@PathVariable Integer id){
        return service.get(id);
    }

    @PostMapping("/users")
    public void add(@RequestBody User users){
        service.save(users);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<?> update(@RequestBody User users,@PathVariable Integer id) {
        try {
            User existUser = service.get(id);
            service.save(users);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }







}
