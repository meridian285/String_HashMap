import java.util.ArrayList;
import java.util.List;

public class App6 {
    public static void main(String[] args) {
        // создай список kittensInTheKitchen
        List<String> kittensInTheKitchen = new ArrayList<>();
        // проверь, есть ли котята на кухне
        if (kittensInTheKitchen.size() == 0) {
            System.out.println("На кухне нет котят");
        } else {
            // если на кухне есть котята, посчитай их
            System.out.println("Котят на кухне: " + kittensInTheKitchen.size());
        }
        // добавь в список каждого котёнка
        kittensInTheKitchen.add("Пушок");
        kittensInTheKitchen.add("Снежок");
        kittensInTheKitchen.add("Черныш");
        kittensInTheKitchen.add("Ушастик");
        kittensInTheKitchen.add("Рыжик");
        // проверь, есть ли котята на кухне
        if (kittensInTheKitchen.size() == 0) {
            System.out.println("На кухне нет котят");
        } else {
            // если на кухне есть котята, посчитай их
            System.out.println("Котят на кухне: " + kittensInTheKitchen.size());
        }
        // удали Пушка из списка по индексу
        kittensInTheKitchen.remove(0);
        // удали Снежка из списка по имени
        kittensInTheKitchen.remove("Снежок");
        // проверь, пропал ли Снежок из списка
        if (kittensInTheKitchen.contains("Снежок") == true) {
            System.out.println("Снежок ещё на кухне");
        } else {
            System.out.println("Снежок уже ушёл");
        }
        // удали Черныша из списка по имени
        kittensInTheKitchen.remove("Черныш");
        // проверь, пропал ли Черныш из списка
        if (kittensInTheKitchen.contains("Черныш")) {
            System.out.println("Черныш ещё на кухне");
        } else {
            System.out.println("Черныш уже ушёл");
        }
        // удали оставшихся котят из списка
        kittensInTheKitchen.clear();
        // проверь, сколько теперь котят на кухне
        if (kittensInTheKitchen.size() == 0) {
            System.out.println("На кухне нет котят");
        } else {
            // если на кухне остались котята, посчитай их
            System.out.println("Котят на кухне: " + kittensInTheKitchen.size());
        }
    }
}
