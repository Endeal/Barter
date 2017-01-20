package java.com.endeal.barter.models;

/**
 * Created by james on 12/20/2016.
 */

public class Rewards {
    private int universal;
    private int facebook;
    private int googlePlus;
    private int twitter;
    private int instagram;
    private int snapchat;

    public Rewards() {
        this(0, 0, 0, 0, 0, 0);
    }

    public Rewards(int universal, int facebook, int googlePlus, int twitter, int instagram, int snapchat) {
        this.universal = universal;
        this.facebook = facebook;
        this.googlePlus = googlePlus;
        this.twitter = twitter;
        this.instagram = instagram;
        this.snapchat = snapchat;
    }

    public int getUniversal() {
        return universal;
    }

    public void setUniversal(int universal) {
        this.universal = universal;
    }

    public int getFacebook() {
        return facebook;
    }

    public void setFacebook(int facebook) {
        this.facebook = facebook;
    }

    public int getGooglePlus() {
        return googlePlus;
    }

    public void setGooglePlus(int googlePlus) {
        this.googlePlus = googlePlus;
    }

    public int getTwitter() {
        return twitter;
    }

    public void setTwitter(int twitter) {
        this.twitter = twitter;
    }

    public int getInstagram() {
        return instagram;
    }

    public void setInstagram(int instagram) {
        this.instagram = instagram;
    }

    public int getSnapchat() {
        return snapchat;
    }

    public void setSnapchat(int snapchat) {
        this.snapchat = snapchat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rewards rewards = (Rewards) o;

        if (universal != rewards.universal) return false;
        if (facebook != rewards.facebook) return false;
        if (googlePlus != rewards.googlePlus) return false;
        if (twitter != rewards.twitter) return false;
        if (instagram != rewards.instagram) return false;
        return snapchat == rewards.snapchat;

    }

    @Override
    public int hashCode() {
        int result = universal;
        result = 31 * result + facebook;
        result = 31 * result + googlePlus;
        result = 31 * result + twitter;
        result = 31 * result + instagram;
        result = 31 * result + snapchat;
        return result;
    }
}
