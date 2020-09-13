package com.company;

import java.util.Objects;

public class Drivers {

    private String id;
    private String fullName;
    private int experience;

    public Drivers() {
    }

    public Drivers(String fullName, int experience) {
        this.fullName = fullName;
        this.experience = experience;
    }

    public Drivers(String id, String fullName, int experience) {
        this.id = id;
        this.fullName = fullName;
        this.experience = experience;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Drivers{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", experience=" + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drivers drivers = (Drivers) o;
        return id.equals(drivers.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
