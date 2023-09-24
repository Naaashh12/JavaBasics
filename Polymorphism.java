public class Polymorphism {
    //compile time 
    public static void main(String[] args) {
        //Calculator calc = new Calculator();
        //System.out.println(calc.sum(2,4));
        //System.out.println(calc.sum((float)5.2,(float)19.7));
        //System.out.println(calc.sum(4,7,2));
        Deer d = new Deer();
        d.eat();
    }
}
class Animal {
    void eat() {
        System.out.println("Eats anything");
    }
}
class Deer extends Animal {
    //method overriding
    void eat() {
        System.out.println("Eats grass");
    }
}

/*class Calculator {

    int sum(int a, int b) {
        return a+b;
    }

    float sum(float a, float b) {
        return a+b;
    }
    //Method overloading
    int sum(int a , int b, int c) {
        return a+b+c;
    }
}*/