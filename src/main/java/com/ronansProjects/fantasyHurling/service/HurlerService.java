package com.ronansProjects.fantasyHurling.service;

import com.ronansProjects.fantasyHurling.model.Hurler;
import com.ronansProjects.fantasyHurling.model.Position;
import com.ronansProjects.fantasyHurling.repository.HurlerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HurlerService {

    @Autowired
    private HurlerRepository hurlerRepository;

    public Hurler updateHurler(Hurler hurler) {
        return hurlerRepository.save(hurler);
    }

    public Hurler getHurler(int id){ return hurlerRepository.findById(id); }

    public List<Hurler> getAllHurlers() { return hurlerRepository.findAll(); }

    public List<Hurler> getAllKeepers() { return hurlerRepository.findByPosition(Position.GOALKEEPER); }

    public List<Hurler> getAllDefenders() { return hurlerRepository.findByPosition(Position.DEFENDER); }

    public List<Hurler>  getAllMidfielders() { return hurlerRepository.findByPosition(Position.MIDFIELD); }

    public List<Hurler> getAllForwards() { return hurlerRepository.findByPosition(Position.FORWARD); }

    public List<Hurler> getHurlersPerCounty(String county){ return hurlerRepository.findByCounty(county); }
}
