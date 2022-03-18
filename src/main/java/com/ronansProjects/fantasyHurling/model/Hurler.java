package com.ronansProjects.fantasyHurling.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("hurler")
public class Hurler {

    @Id
    private int id;

    private String name;
    private String county;
    private Position position;
    private int[] gameweekPoints;
    private int totalpoints;

    public int[] getGameweekPoints() {
        return gameweekPoints;
    }

    public void setGameweekPoints(int[] gameweekPoints) {
        this.gameweekPoints = gameweekPoints;
    }



    public Hurler(String name, String county, Position position) {
        this.name = name;
        this.county = county;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCounty() {
        return county;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    private void calculateTotalPoints(){
        for (int points:
             this.gameweekPoints) {
            this.totalpoints+=points;
        }
    }

    public void setTotalpoints() {
        this.calculateTotalPoints();
    }

    public int getTotalpoints(){return this.totalpoints;}

    @Override
    public String toString() {
        return "Hurler{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", county='" + county + '\'' +
                ", position=" + position +
                '}';
    }
}
