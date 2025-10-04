package KI_304.Komisarov.LAB_02;

/**
 * Клас Root описує корінь рослини.
 */
public class Root {
    private double length; // довжина кореня в см
    private boolean healthy;

    public Root(double length, boolean healthy) {
        this.length = length;
        this.healthy = healthy;
    }

    public double getLength() { return length; }
    public boolean isHealthy() { return healthy; }

    public void grow(double cm) {
        length += cm;
    }

    @Override
    public String toString() {
        return "Корінь: довжина " + length + " см, стан " + (healthy ? "здоровий" : "хворий");
    }
}

