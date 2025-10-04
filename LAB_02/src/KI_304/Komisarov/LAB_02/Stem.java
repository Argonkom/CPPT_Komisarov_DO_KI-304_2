package KI_304.Komisarov.LAB_02;

/**
 * Клас Stem описує стебло рослини.
 */
public class Stem {
    private double height; // висота в см
    private double thickness; // товщина в мм

    public Stem(double height, double thickness) {
        this.height = height;
        this.thickness = thickness;
    }

    public double getHeight() { return height; }
    public double getThickness() { return thickness; }

    public void grow(double cm) {
        height += cm;
    }

    public void thicken(double mm) {
        thickness += mm;
    }

    @Override
    public String toString() {
        return "Стебло: висота " + height + " см, товщина " + thickness + " мм";
    }
}
