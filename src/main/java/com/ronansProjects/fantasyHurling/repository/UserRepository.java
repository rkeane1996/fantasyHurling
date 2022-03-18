package com.ronansProjects.fantasyHurling.repository;

import com.ronansProjects.fantasyHurling.model.Team;
import com.ronansProjects.fantasyHurling.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

    User findById(int id);

}
