import java.util.Arrays;

public class App4 {
    public static void main(String[] args) {
        Test test = new Test();
        test.printHarvest();
    }
static class Test {
        public void printHarvest() {
            String[] items = {"Картошка, мешки, 8", "Яблоки, ящики, 11.5", "Клубника, кг, 5.75"};
            for (String item : items) {
                String[] split = item.split(",");

                System.out.printf("%-10s%-7s%-4s%n", split[0],split[1],split[2]);
            }
        }
    }
}