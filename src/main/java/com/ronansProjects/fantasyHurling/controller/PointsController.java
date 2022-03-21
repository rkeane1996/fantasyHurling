package com.ronansProjects.fantasyHurling.controller;


import com.ronansProjects.fantasyHurling.model.Points;
import com.ronansProjects.fantasyHurling.service.PointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@RestController
@RequestMapping("/points")
public class PointsController {

    @Autowired
    private PointsService pointsService;
    
    @PutMapping(value="/assignPoints/{hurlerId}/{gameweek}")
    public void assignPoints(
            @PathVariable int hurlerId,
            @PathVariable int gameweek,
            @RequestBody List<Points> points){
        pointsService.assignGameweekPointsToHurler(points, hurlerId, gameweek);
    }

}
