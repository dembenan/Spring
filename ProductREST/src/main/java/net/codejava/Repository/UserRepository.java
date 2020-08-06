package net.codejava.Repository;
import net.codejava.Model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User ,Integer> {
}

