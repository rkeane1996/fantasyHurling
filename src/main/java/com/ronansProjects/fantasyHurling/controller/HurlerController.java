package com.ronansProjects.fantasyHurling.controller;

import com.ronansProjects.fantasyHurling.model.Hurler;
import com.ronansProjects.fantasyHurling.service.HurlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@RestController
@RequestMapping(name = "/hurler")
public class HurlerController {

    @Autowired
    private HurlerService hurlerService;
    
    @GetMapping(value="/getHurler")
    public Hurler getHurler(@RequestParam int id) { return hurlerService.getHurler(id); }

    @GetMapping(value = "/getAllHurlers")
    public List<Hurler> getAllHurlers() { return hurlerService.getAllHurlers(); }

    @GetMapping(value = "/getAllKeepers")
    public List<Hurler> getAllKeepers() { return hurlerService.getAllKeepers(); }

    @GetMapping(value = "/getAllDefenders")
    public List<Hurler> getAllDefenders() { return hurlerService.getAllDefenders(); }

    @GetMapping(value = "/getAllMidfielders")
    public List<Hurler> getAllMidfielders() { return hurlerService.getAllMidfielders(); }

    @GetMapping(value = "/getAllForwards")
    public List<Hurler> getAllForwards() { return hurlerService.getAllForwards(); }

    @GetMapping(value = "/getHurlersPerCounty")
    public List<Hurler> getHurlersPerCounty(@RequestParam String county) {
        return hurlerService.getHurlersPerCounty(county);
    }
    
}
