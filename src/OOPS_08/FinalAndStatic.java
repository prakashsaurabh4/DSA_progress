package OOPS_08;

class Cricketer{
    private String country = "India";
    int runs;
    String name;
    double average;
    void print(){
        System.out.println(runs+" "+name+" "+average);
    }
    static void greet(){
        System.out.println("I only believe in Jassi bhai");
    }
}

public class FinalAndStatic {
    public static void main(String[] args) {

       //Cricketer c1 = new Cricketer();
//        // c1.country = "England";
        Cricketer c2 = new Cricketer();
//        System.out.println(c1.country);
//      c1.country = "India";
//      System.out.println(c2.country);
        c2.greet();
        Cricketer.greet();

    }
}
