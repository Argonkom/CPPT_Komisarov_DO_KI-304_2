package KI_304.Komisarov.LAB_02;

/**
 * Клас Leaf описує листя рослини.
 */
public class Leaf {
    private int count; // кількість листків
    private String color;

    public Leaf(int count, String color) {
        this.count = count;
        this.color = color;
    }

    public int getCount() { return count; }
    public String getColor() { return color; }

    public void grow(int number) {
        count += number;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }

    @Override
    public String toString() {
        return "Листя: " + count + " шт., колір " + color;
    }
}
