package com.endeal.barter.models;

import java.util.List;

public class Vendor {
    private String id;
    private String name;
    private String picture;
    private Place place;
    private Contact contact;
    private long favorites;
    private Hours hours;
    private boolean open;

    private double taxRate;
    private Rewards rewards;
    private List<Special> specials;
    private List<Dispatch> dispatches;

    private String merchant;
    private List<String> owners;
    private List<String> employees;
    private Franchise franchise;

    public Vendor() {}

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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public long getFavorites() {
        return favorites;
    }

    public void setFavorites(long favorites) {
        this.favorites = favorites;
    }

    public Hours getHours() {
        return hours;
    }

    public void setHours(Hours hours) {
        this.hours = hours;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public Rewards getRewards() {
        return rewards;
    }

    public void setRewards(Rewards rewards) {
        this.rewards = rewards;
    }

    public List<Special> getSpecials() {
        return specials;
    }

    public void setSpecials(List<Special> specials) {
        this.specials = specials;
    }

    public List<Dispatch> getDispatches() {
        return dispatches;
    }

    public void setDispatches(List<Dispatch> dispatches) {
        this.dispatches = dispatches;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public List<String> getOwners() {
        return owners;
    }

    public void setOwners(List<String> owners) {
        this.owners = owners;
    }

    public List<String> getEmployees() {
        return employees;
    }

    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }

    public Franchise getFranchise() {
        return franchise;
    }

    public void setFranchise(Franchise franchise) {
        this.franchise = franchise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vendor vendor = (Vendor) o;

        if (favorites != vendor.favorites) return false;
        if (open != vendor.open) return false;
        if (Double.compare(vendor.taxRate, taxRate) != 0) return false;
        if (id != null ? !id.equals(vendor.id) : vendor.id != null) return false;
        if (name != null ? !name.equals(vendor.name) : vendor.name != null) return false;
        if (picture != null ? !picture.equals(vendor.picture) : vendor.picture != null)
            return false;
        if (place != null ? !place.equals(vendor.place) : vendor.place != null) return false;
        if (contact != null ? !contact.equals(vendor.contact) : vendor.contact != null)
            return false;
        if (hours != null ? !hours.equals(vendor.hours) : vendor.hours != null) return false;
        if (rewards != null ? !rewards.equals(vendor.rewards) : vendor.rewards != null)
            return false;
        if (specials != null ? !specials.equals(vendor.specials) : vendor.specials != null)
            return false;
        if (dispatches != null ? !dispatches.equals(vendor.dispatches) : vendor.dispatches != null)
            return false;
        if (merchant != null ? !merchant.equals(vendor.merchant) : vendor.merchant != null)
            return false;
        if (owners != null ? !owners.equals(vendor.owners) : vendor.owners != null) return false;
        if (employees != null ? !employees.equals(vendor.employees) : vendor.employees != null)
            return false;
        return franchise != null ? franchise.equals(vendor.franchise) : vendor.franchise == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (picture != null ? picture.hashCode() : 0);
        result = 31 * result + (place != null ? place.hashCode() : 0);
        result = 31 * result + (contact != null ? contact.hashCode() : 0);
        result = 31 * result + (int) (favorites ^ (favorites >>> 32));
        result = 31 * result + (hours != null ? hours.hashCode() : 0);
        result = 31 * result + (open ? 1 : 0);
        temp = Double.doubleToLongBits(taxRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (rewards != null ? rewards.hashCode() : 0);
        result = 31 * result + (specials != null ? specials.hashCode() : 0);
        result = 31 * result + (dispatches != null ? dispatches.hashCode() : 0);
        result = 31 * result + (merchant != null ? merchant.hashCode() : 0);
        result = 31 * result + (owners != null ? owners.hashCode() : 0);
        result = 31 * result + (employees != null ? employees.hashCode() : 0);
        result = 31 * result + (franchise != null ? franchise.hashCode() : 0);
        return result;
    }
}
