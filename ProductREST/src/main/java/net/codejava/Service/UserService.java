package net.codejava.Service;
import net.codejava.Model.User;
import net.codejava.Repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repou;

    public List<User> listAll(){
        return repou.findAll();
    }

    public void save(User users){
        repou.save(users);
    }

    public User get(Integer id){
        return repou.findById(id).get();
    }

    public void delete(Integer id_user){

        repou.deleteById(id_user);
    };
}
