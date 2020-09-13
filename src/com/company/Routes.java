package com.company;

import java.util.Objects;

public class Routes {
    private String id;
    private String name;
    private int distance;
    private int daysOnTheRoad;
    private int payment;

    public Routes() {
    }

    public Routes(String name, int distance, int daysOnTheRoad, int payment) {
        this.name = name;
        this.distance = distance;
        this.daysOnTheRoad = daysOnTheRoad;
        this.payment = payment;
    }

    public Routes(String id, String name, int distance, int daysOnTheRoad, int payment) {
        this.id = id;
        this.name = name;
        this.distance = distance;
        this.daysOnTheRoad = daysOnTheRoad;
        this.payment = payment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDaysOnTheRoad() {
        return daysOnTheRoad;
    }

    public void setDaysOnTheRoad(int daysOnTheRoad) {
        this.daysOnTheRoad = daysOnTheRoad;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Routes{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", distance=" + distance +
                ", daysOnTheRoad=" + daysOnTheRoad +
                ", payment=" + payment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Routes routes = (Routes) o;
        return id.equals(routes.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


