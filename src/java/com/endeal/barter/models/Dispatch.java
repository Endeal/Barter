package java.com.endeal.barter.models;

/**
 * Created by james on 12/20/2016.
 */

public class Dispatch {
    private Method method;
    private Price fee;
    private Price minimum;
    private double range;

    public enum Method {
        SERVICE, PICKUP, DELIVERY, SELF_SERVE
    }
}
