package java.com.endeal.barter.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by james on 12/20/2016.
 */

public class Franchise {
    private String id;
    private String name;
    private List<String> owners;

    public Franchise() {
        this(null, null, new ArrayList<String>());
    }

    public Franchise(String id, String name, List<String> owners) {
        this.id = id;
        this.name = name;
        this.owners = owners;
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

    public List<String> getOwners() {
        return owners;
    }

    public void setOwners(List<String> owners) {
        this.owners = owners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Franchise franchise = (Franchise) o;

        if (id != null ? !id.equals(franchise.id) : franchise.id != null) return false;
        if (name != null ? !name.equals(franchise.name) : franchise.name != null) return false;
        return owners != null ? owners.equals(franchise.owners) : franchise.owners == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (owners != null ? owners.hashCode() : 0);
        return result;
    }
}
