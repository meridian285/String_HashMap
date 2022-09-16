import java.util.ArrayList;
import java.util.Comparator;

public class App10 {
    // напиши свой компаратор:
    private static Comparator<Child> CHILD_COMPARATOR = new Comparator<Child>() {
        @Override
        public int compare(Child o1, Child o2) {
            return o1.height - o2.height;
        }
    };


    public static void main(String[] args) {
        Child petya = new Child("Петя", 120);
        Child vasya = new Child("Вася", 130);
        Child ilia = new Child("Илья", 110);

        ArrayList<Child> children = new ArrayList<>();
        children.add(petya);
        children.add(vasya);
        children.add(ilia);

        // вызови метод сортировки у списка детей и передай в него компаратор
        children.sort(CHILD_COMPARATOR);

        System.out.println(children);
    }
}
