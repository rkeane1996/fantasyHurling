package com.ronansProjects.fantasyHurling.model;

public enum Points {

    PLAYED_FULL_GAME(2),
    PLAYED_HALF_GAME(1),
    GOAL_SCORED(3),
    POINT_SCORED(1),
    FREES_BONUS(2),
    PENALTY_SCORED(2),
    SIDLINE_SCORED(2);

    Points(int i) {
        this.value = i;
    }

    private int value;

    public int getValue() {
        return value;
    }
}
