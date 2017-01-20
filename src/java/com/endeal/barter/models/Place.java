package java.com.endeal.barter.models;

/**
 * Created by james on 12/20/2016.
 */

public class Place {
    private String address;
    private String details;
    private String city;
    private String state;
    private String zip;
    private double longitude;
    private double latitude;

    public Place() {
        this(null, null, null, null, null, 0, 0);
    }

    public Place(String address, String details, String city, String state, String zip, double longitude, double latitude) {
        this.address = address;
        this.details = details;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Place place = (Place) o;

        if (Double.compare(place.longitude, longitude) != 0) return false;
        if (Double.compare(place.latitude, latitude) != 0) return false;
        if (address != null ? !address.equals(place.address) : place.address != null) return false;
        if (details != null ? !details.equals(place.details) : place.details != null) return false;
        if (city != null ? !city.equals(place.city) : place.city != null) return false;
        if (state != null ? !state.equals(place.state) : place.state != null) return false;
        return zip != null ? zip.equals(place.zip) : place.zip == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = address != null ? address.hashCode() : 0;
        result = 31 * result + (details != null ? details.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (zip != null ? zip.hashCode() : 0);
        temp = Double.doubleToLongBits(longitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(latitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
