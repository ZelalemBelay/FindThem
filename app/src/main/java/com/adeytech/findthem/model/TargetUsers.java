package com.adeytech.findthem.model;

public class TargetUsers {

    String name;
    Coordinate coordinate;
    String status;

    public TargetUsers(String name, Coordinate coordinate, String status) {
        this.name = name;
        this.coordinate = coordinate;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
