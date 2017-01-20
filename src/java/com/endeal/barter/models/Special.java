package java.com.endeal.barter.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by james on 12/20/2016.
 */

public class Special {
    private String id;
    private String name;
    private List<Cycle> cycles;

    public Special() {
        this(null, null, new ArrayList<Cycle>());
    }

    public Special(String id, String name, List<Cycle> cycles) {
        this.id = id;
        this.name = name;
        this.cycles = cycles;
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

    public List<Cycle> getCycles() {
        return cycles;
    }

    public void setCycles(List<Cycle> cycles) {
        this.cycles = cycles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Special special = (Special) o;

        if (id != null ? !id.equals(special.id) : special.id != null) return false;
        if (name != null ? !name.equals(special.name) : special.name != null) return false;
        return cycles != null ? cycles.equals(special.cycles) : special.cycles == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (cycles != null ? cycles.hashCode() : 0);
        return result;
    }
}
