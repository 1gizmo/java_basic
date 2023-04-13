package day13;

public class nameType {

    private final String name;
    private final Dish.Type type;

    public nameType(Dish dish) {
        this.name = dish.getName();
        this.type = dish.getType();
    }

    public nameType(String name, Dish.Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Dish.Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "nameType{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
