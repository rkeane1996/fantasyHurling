package com.ronansProjects.fantasyHurling.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.concurrent.atomic.AtomicInteger;

@Document("team")
public class Team {

    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1);
    private int id;
    private int userId;
    private String teamName;
    private Hurler[] teamPlayers;
    private Hurler[][] gameWeekTeam;
    private int points;

    public Hurler[][] getAllGameWeekTeam() {
        return gameWeekTeam;
    }

    public Hurler[] getSpecificGameWeekTeam(int gameweek) {
        return gameWeekTeam[gameweek];
    }

    public void setGameWeekTeam(int gameweek, Hurler[] players) {
        this.gameWeekTeam[gameweek] = players;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Team(int userId, String teamName, Hurler[] teamPlayers) {
        this.id = ID_GENERATOR.getAndIncrement();
        this.userId = userId;
        this.teamName = teamName;
        this.teamPlayers = teamPlayers;
    }

    public int getUserId() {
        return userId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Hurler[] getTeamPlayers() {
        return teamPlayers;
    }

    public void setTeamPlayers(Hurler[] teamPlayers) {
        this.teamPlayers = teamPlayers;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", userId=" + userId +
                ", teamName='" + teamName + '\'' +
                ", teamPlayers=" + teamPlayers +
                '}';
    }
}
