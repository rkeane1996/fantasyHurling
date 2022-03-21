package com.ronansProjects.fantasyHurling.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.concurrent.atomic.AtomicInteger;

@Document("hurler")
public class Hurler {

    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);

    private int id;
    private String name;
    private String county;
    private Position position;
    private int[] gameweekPoints = new int[]{0,0,0,0,0,0,0,0,0,0,0};
    private int totalpoints;

    public int[] getGameweekPoints() {
        return gameweekPoints;
    }

    public Hurler(String name, String county, Position position) {
        this.id = ID_GENERATOR.getAndIncrement();
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

    public int getTotalpoints(){return this.totalpoints;}

    public void updatePoints(int points, int gameweek){
        this.gameweekPoints[gameweek] = points;
        this.totalpoints+=points;
    }

    @Override
    public String toString() {
        return "Hurler{" +
                "id=" + /*id*/
                ", name='" + name + '\'' +
                ", county='" + county + '\'' +
                ", position=" + position +
                '}';
    }
}
