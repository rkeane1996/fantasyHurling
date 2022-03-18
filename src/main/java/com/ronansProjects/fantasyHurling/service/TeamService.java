package com.ronansProjects.fantasyHurling.service;

import com.ronansProjects.fantasyHurling.model.Hurler;
import com.ronansProjects.fantasyHurling.model.Team;
import com.ronansProjects.fantasyHurling.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public Team createTeam(Team team){
        return teamRepository.insert(team);
    }

    public Team submitTeam(Team team) {
        return teamRepository.save(team);
    }

    public Team getUsersTeam(int userId) {
        return teamRepository.findByUserId(userId);
    }

    public Team submitGameweekTeam(int gameweek, int userId) {
        Team team = teamRepository.findByUserId(userId);
        team.setGameWeekTeam(gameweek, team.getTeamPlayers());
        return teamRepository.save(team);
    }

    public Hurler[] getGameweekTeam(int gameweek, int userId) {
        Team team = teamRepository.findByUserId(userId);
        return team.getSpecificGameWeekTeam(gameweek);
    }
}
