package OOPS_08;

class Students{ // Encapsulation
    String name; //null
    private int rno; // 0
    double cgpa; // 0.0
    void print(){
        System.out.println(name+" "+rno+" "+cgpa);
    }
//    public void p(){
//        void print();
//    }
    int getRno(){ //getter
        return rno;
    }
    void setRno(int x){ //setter
        rno=x;
    }
}
public class PrivateKeyword {

    public static void main(String[] args) {
         Students s1 = new Students();
       // System.out.println(s1.rno);   rno has private access in OOPS_08.Students
        s1.print();

        s1.cgpa = 8.9;
        s1.name = "Jack";
        // s1.print();

       // s1.rno = 45; giving error
        s1.setRno(45);
        System.out.println(s1.getRno());

    }
}
