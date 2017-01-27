package com.endeal.barter.models;

/**
 * Created by james on 12/20/2016.
 */

public class Contact {
    private String phone;
    private String email;
    private String facebook;
    private String googlePlus;
    private String twitter;
    private String instagram;
    private String snapchat;

    public Contact() {
        this(null, null, null, null, null, null, null);
    }

    public Contact(String phone, String email, String facebook, String googlePlus, String twitter, String instagram, String snapchat) {
        this.phone = phone;
        this.email = email;
        this.facebook = facebook;
        this.googlePlus = googlePlus;
        this.twitter = twitter;
        this.instagram = instagram;
        this.snapchat = snapchat;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getGooglePlus() {
        return googlePlus;
    }

    public void setGooglePlus(String googlePlus) {
        this.googlePlus = googlePlus;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getSnapchat() {
        return snapchat;
    }

    public void setSnapchat(String snapchat) {
        this.snapchat = snapchat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (phone != null ? !phone.equals(contact.phone) : contact.phone != null) return false;
        if (email != null ? !email.equals(contact.email) : contact.email != null) return false;
        if (facebook != null ? !facebook.equals(contact.facebook) : contact.facebook != null)
            return false;
        if (googlePlus != null ? !googlePlus.equals(contact.googlePlus) : contact.googlePlus != null)
            return false;
        if (twitter != null ? !twitter.equals(contact.twitter) : contact.twitter != null)
            return false;
        if (instagram != null ? !instagram.equals(contact.instagram) : contact.instagram != null)
            return false;
        return snapchat != null ? snapchat.equals(contact.snapchat) : contact.snapchat == null;

    }

    @Override
    public int hashCode() {
        int result = phone != null ? phone.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (facebook != null ? facebook.hashCode() : 0);
        result = 31 * result + (googlePlus != null ? googlePlus.hashCode() : 0);
        result = 31 * result + (twitter != null ? twitter.hashCode() : 0);
        result = 31 * result + (instagram != null ? instagram.hashCode() : 0);
        result = 31 * result + (snapchat != null ? snapchat.hashCode() : 0);
        return result;
    }
}
