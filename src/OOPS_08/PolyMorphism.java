package OOPS_08;

public class PolyMorphism {
    public static class Dog{
        void speak(){
            System.out.println("Barking");
        }
    }
    public static class Cat{
            void speak(){
                System.out.println("Meow Meow");
            }
    }
    public static class Lion{
        void speak(){
            System.out.println("GRRRRR");
        }
    }
    public static class Pikachu{
       void speak(){
           System.out.println("Pika Pika");
       }
    }
    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Human h = new Human();
        Pikachu p = new Pikachu();
        Dog d = new Dog();
        Cat c = new Cat();
        h.speak();
        p.speak();
        d.speak();
        c.speak();
    }
}
