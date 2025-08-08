package Day5;

class Apple {
    void showMessage() {
        System.out.println("Apple: Implicit constructor used");
    }
}

class Banana {
    String color;

    Banana(String c) {
        color = c;
        System.out.println("Banana: Explicit constructor called with color = " + color);
    }

    Banana(Banana b) {
        color = b.color;
        System.out.println("Banana: Copy constructor called");
    }

    void showColor() {
        System.out.println("Banana: The color is " + color);
    }
}

public class FruitColor {
    public static void main(String[] args) {
        Apple a = new Apple();
        a.showMessage();

        Banana b1 = new Banana("Yellow");
        b1.showColor();

        Banana b2 = new Banana(b1);
        b2.showColor();
    }
}
