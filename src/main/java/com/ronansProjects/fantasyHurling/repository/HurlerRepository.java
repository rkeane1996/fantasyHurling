package com.ronansProjects.fantasyHurling.repository;

import com.ronansProjects.fantasyHurling.model.Hurler;
import com.ronansProjects.fantasyHurling.model.Position;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HurlerRepository extends MongoRepository<Hurler, Integer> {

    Hurler findById(int id);

    List<Hurler> findByPosition(Position position);

    List<Hurler> findByCounty(String county);
}
