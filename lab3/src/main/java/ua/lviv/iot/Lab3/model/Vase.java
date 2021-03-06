package ua.lviv.iot.Lab3.model;

public class Vase extends Product {
    private int volumeInMl;

    public Vase() {
        this(null, 0, 0, 0);
    }

    public Vase(final String color,
                final int heightInSm, final double priceInUAH,
                final int volumeOfVaseInMl) {
        super(color, heightInSm, priceInUAH);
        this.volumeInMl = volumeOfVaseInMl;
    }

    public final String getHeaders() {
        return super.getHeaders() + "," + " volumeInMl";
    }

    public final String toCSV() {
        return super.toCSV() + "," + " volumeInMl = " + getVolumeInMl();
    }

    public final int getVolumeInMl() {
        return volumeInMl;
    }

    public final void setVolumeInMl(final int volumeOfVaseInMl) {
        this.volumeInMl = volumeOfVaseInMl;
    }
}
