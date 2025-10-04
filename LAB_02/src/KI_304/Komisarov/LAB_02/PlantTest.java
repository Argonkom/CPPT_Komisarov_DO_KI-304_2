package KI_304.Komisarov.LAB_02;


/**
 * Клас для тестування Plant.
 */
public class PlantTest {
    public static void main(String[] args) {
        try (Plant plant = new Plant("Троянда")) {
            plant.printInfo();
            plant.growStem(15);
            plant.growRoot(7);
            plant.growLeaves(5);
            plant.changeLeafColor("жовтий");
            plant.printInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
