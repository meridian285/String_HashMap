import java.util.ArrayList;

public class App5 {
    public static void main(String[] args) {
        ArrayList<String> kittenNames = new ArrayList<>();
        kittenNames.add("Пушок");
        kittenNames.add("Ушастик");
        kittenNames.add("Рыжик");
        kittenNames.add(1,"Снежок");
        // добавь кличку Черныш на третье место в списке
        kittenNames.add(2,"Черныш ");
        // выведи на экран последнюю кличку в списке
        System.out.println(kittenNames.get(kittenNames.size()));
    }
}
