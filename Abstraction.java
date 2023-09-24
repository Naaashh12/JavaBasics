public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
    }
    
}
    abstract class Animal {
        String color;
        Animal() {
            color="Brown";
        }
        void eat() {
            System.out.println("Eats anything");
        }
        abstract void walk();
    }

    class Horse extends Animal {
        void walk() {
            System.out.println("walks on 4 legs");
        }
        
        void changeColor() {
            color="dark brown";
        }
    }