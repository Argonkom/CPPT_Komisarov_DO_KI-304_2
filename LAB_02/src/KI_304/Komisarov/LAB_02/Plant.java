package KI_304.Komisarov.LAB_02;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Клас Plant описує рослину та її складові.
 */
public class Plant implements AutoCloseable {
    private String name;
    private Root root;
    private Stem stem;
    private Leaf leaf;

    private FileWriter logWriter;

    // Конструктор 1
    public Plant(String name, Root root, Stem stem, Leaf leaf) throws IOException {
        this.name = name;
        this.root = root;
        this.stem = stem;
        this.leaf = leaf;
        this.logWriter = new FileWriter("plant_log.txt", true);
        log("Створено рослину: " + name);
    }

    // Конструктор 2 (за замовчуванням)
    public Plant(String name) throws IOException {
        this(name, new Root(5, true), new Stem(10, 2), new Leaf(3, "зелений"));
    }

    // Методи
    public String getName() { return name; }
    public Root getRoot() { return root; }
    public Stem getStem() { return stem; }
    public Leaf getLeaf() { return leaf; }

    public void growStem(double cm) throws IOException {
        stem.grow(cm);
        log("Стебло виросло на " + cm + " см");
    }

    public void growRoot(double cm) throws IOException {
        root.grow(cm);
        log("Корінь виріс на " + cm + " см");
    }

    public void growLeaves(int count) throws IOException {
        leaf.grow(count);
        log("З’явилося " + count + " нових листків");
    }

    public void changeLeafColor(String color) throws IOException {
        leaf.changeColor(color);
        log("Змінено колір листя на " + color);
    }

    public void printInfo() throws IOException {
        String info = "Рослина: " + name + "\n" + root + "\n" + stem + "\n" + leaf;
        System.out.println(info);
        log("Виведено інформацію про рослину");
    }

    private void log(String action) throws IOException {
        logWriter.write(LocalDateTime.now() + " - " + action + "\n");
        logWriter.flush();
    }

    @Override
    public void close() throws IOException {
        if (logWriter != null) {
            log("Закриття лог-файлу");
            logWriter.close();
        }
    }
}
