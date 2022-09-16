import java.util.ArrayList;
import java.util.List;

public class App9 {
    public static void main(String[] args) {
        // создай список кличек котят
        List<String> kittenNamesList = new ArrayList<>();
        kittenNamesList.add("Пушок");
        kittenNamesList.add("Снежок");
        kittenNamesList.add("Черныш");
        kittenNamesList.add("Ушастик");
        // выведи список на экран
        System.out.println(kittenNamesList);

        // создай массив из списка
        String[] kittenNamesArray = kittenNamesList.toArray(new String[0]);
        // выведи массив на экран через цикл for each
        for (String kittenName: kittenNamesArray) {
            System.out.print(kittenName + ", ");
        }
    }
}
