public class Child {
    String name;
    int height;

    public Child(String name, int height) {
        this.name = name;
        this.height = height;
    }

    /* чтобы получить строковое представление объекта класса Child в консоли,
нужно переопределить метод toString() класса Object */
    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
