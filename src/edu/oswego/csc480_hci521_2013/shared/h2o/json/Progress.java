package edu.oswego.csc480_hci521_2013.shared.h2o.json;

/**
 *
 */
public class Progress extends H2OResponse {

    private String destination_key;

    public String getDestinationKey() {
        return destination_key;
    }

    @Override
    public String toString() {
        return "Progress{" + "destination_key=" + destination_key + super.toString() + '}';
    }
}
