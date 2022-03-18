package com.ronansProjects.fantasyHurling.controller;

import com.ronansProjects.fantasyHurling.model.Hurler;
import com.ronansProjects.fantasyHurling.model.Team;
import com.ronansProjects.fantasyHurling.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private TeamService teamService;
    
    @PostMapping(value="/createTeam")
    public Team createTeam(@RequestBody Team team) {
        return teamService.createTeam(team);
    }

    @PutMapping(value="/submitTeam")
    public Team submitTeam(@RequestBody Team team) {
        return teamService.submitTeam(team);
    }

    @PostMapping(value="/submitGameweekTeam")
    public Team submitGameweekTeam(
            @RequestParam int gameweek,
            @RequestParam int userId) {
        return teamService.submitGameweekTeam(gameweek, userId);
    }
    
    @GetMapping(value="/getUsersTeam")
    public Team getTeam(@RequestParam int userId) {
        return teamService.getUsersTeam(userId);
    }

    @GetMapping(value="/getGameweekTeam")
    public Hurler[] getGameweekTeam(
            @RequestParam int gameweek,
            @RequestParam int userId) {
        return teamService.getGameweekTeam(gameweek, userId);
    }

    
    
}
