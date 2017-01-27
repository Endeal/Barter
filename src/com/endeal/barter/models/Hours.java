package com.endeal.barter.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by james on 12/20/2016.
 */

public class Hours {
    private List<Cycle> monday;
    private List<Cycle> tuesday;
    private List<Cycle> wednesday;
    private List<Cycle> thursday;
    private List<Cycle> friday;
    private List<Cycle> saturday;
    private List<Cycle> sunday;

    public Hours() {
        this(new ArrayList<Cycle>(), new ArrayList<Cycle>(), new ArrayList<Cycle>(), new ArrayList<Cycle>(), new ArrayList<Cycle>(), new ArrayList<Cycle>(), new ArrayList<Cycle>());
    }

    public Hours(List<Cycle> monday, List<Cycle> tuesday, List<Cycle> wednesday, List<Cycle> thursday, List<Cycle> friday, List<Cycle> saturday, List<Cycle> sunday) {
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
    }

    public List<Cycle> getMonday() {
        return monday;
    }

    public void setMonday(List<Cycle> monday) {
        this.monday = monday;
    }

    public List<Cycle> getTuesday() {
        return tuesday;
    }

    public void setTuesday(List<Cycle> tuesday) {
        this.tuesday = tuesday;
    }

    public List<Cycle> getWednesday() {
        return wednesday;
    }

    public void setWednesday(List<Cycle> wednesday) {
        this.wednesday = wednesday;
    }

    public List<Cycle> getThursday() {
        return thursday;
    }

    public void setThursday(List<Cycle> thursday) {
        this.thursday = thursday;
    }

    public List<Cycle> getFriday() {
        return friday;
    }

    public void setFriday(List<Cycle> friday) {
        this.friday = friday;
    }

    public List<Cycle> getSaturday() {
        return saturday;
    }

    public void setSaturday(List<Cycle> saturday) {
        this.saturday = saturday;
    }

    public List<Cycle> getSunday() {
        return sunday;
    }

    public void setSunday(List<Cycle> sunday) {
        this.sunday = sunday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hours hours = (Hours) o;

        if (monday != null ? !monday.equals(hours.monday) : hours.monday != null) return false;
        if (tuesday != null ? !tuesday.equals(hours.tuesday) : hours.tuesday != null) return false;
        if (wednesday != null ? !wednesday.equals(hours.wednesday) : hours.wednesday != null)
            return false;
        if (thursday != null ? !thursday.equals(hours.thursday) : hours.thursday != null)
            return false;
        if (friday != null ? !friday.equals(hours.friday) : hours.friday != null) return false;
        if (saturday != null ? !saturday.equals(hours.saturday) : hours.saturday != null)
            return false;
        return sunday != null ? sunday.equals(hours.sunday) : hours.sunday == null;

    }

    @Override
    public int hashCode() {
        int result = monday != null ? monday.hashCode() : 0;
        result = 31 * result + (tuesday != null ? tuesday.hashCode() : 0);
        result = 31 * result + (wednesday != null ? wednesday.hashCode() : 0);
        result = 31 * result + (thursday != null ? thursday.hashCode() : 0);
        result = 31 * result + (friday != null ? friday.hashCode() : 0);
        result = 31 * result + (saturday != null ? saturday.hashCode() : 0);
        result = 31 * result + (sunday != null ? sunday.hashCode() : 0);
        return result;
    }
}
