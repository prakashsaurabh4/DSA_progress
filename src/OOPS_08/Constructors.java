package OOPS_08;

public class Constructors {
    public static class Car{
        int seat;
        String name;
        double length;
//        Car(int seat,String name){ // Default Constructor
//          this.seat = seat;
//          this.name = name;
//        }
        Car(int x,String s,double d){ //Parametric Constructor
            seat=x;
            name=s;
            length=d;
        }
        void print(){
            System.out.println(name+" "+seat+" "+length);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(5,"Kia",3.99);
        //System.out.println(c1.seat);
        c1.print();
        Car c2 = new Car(6,"Range",4);
        c2.print();
    }
}
