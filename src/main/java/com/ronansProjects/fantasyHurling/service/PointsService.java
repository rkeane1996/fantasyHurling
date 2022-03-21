package com.ronansProjects.fantasyHurling.service;

import com.ronansProjects.fantasyHurling.model.Hurler;
import com.ronansProjects.fantasyHurling.model.Points;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PointsService {

    @Autowired
    private HurlerService hurlerService;
    
    private int calculatePoints(List<Points> pointsList) {
        int totalPoints = 0;
        for (Points p: pointsList) {
            totalPoints += p.getValue();
        }
        return totalPoints;
    }

    public void assignGameweekPointsToHurler(List<Points> pointsList, int hurlerId, int gameweek){
        int points = calculatePoints(pointsList);
        System.out.println("Total points = " + points);
        Hurler hurler = hurlerService.getHurler(hurlerId);
        hurler.updatePoints(points,gameweek);
        hurlerService.updateHurler(hurler);
    }
}
