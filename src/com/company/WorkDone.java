package com.company;

import java.time.LocalDate;
import java.util.Objects;

public class WorkDone {

    private String id;
    private String driverId;
    private LocalDate dateOfDeparture;
    private LocalDate returnDate;
    private int premium;

    public WorkDone() {
    }

    public WorkDone(String driverId, LocalDate dateOfDeparture, LocalDate returnDate, int premium) {
        this.driverId = driverId;
        this.dateOfDeparture = dateOfDeparture;
        this.returnDate = returnDate;
        this.premium = premium;
    }

    public WorkDone(String id, String driverId, LocalDate dateOfDeparture, LocalDate returnDate, int premium) {
        this.id = id;
        this.driverId = driverId;
        this.dateOfDeparture = dateOfDeparture;
        this.returnDate = returnDate;
        this.premium = premium;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public LocalDate getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(LocalDate dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "WorkDone{" +
                "id='" + id + '\'' +
                ", driverId='" + driverId + '\'' +
                ", dateOfDeparture=" + dateOfDeparture +
                ", returnDate=" + returnDate +
                ", premium=" + premium +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkDone workDone = (WorkDone) o;
        return id.equals(workDone.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
