package OOPS_08;

public class UserDefinedDataType {
    public static class Student{ // Khud ka data type bana liya hai
        String name;
        int rno;
        double cgpa;
        void print(){
            System.out.println(name+" "+rno+" "+cgpa);
        }
    }
    public static void main(String[] args) {
       Student s1 = new Student(); // declaration    OR   Object s1
        s1.name = "Saurabh";
        s1.rno = 12345; // sc.nextInt();
        s1.cgpa = 8.5;


        Student s2 = new Student(); // declaration    OR   Object s2
        s2.name = "Prakash";
        s2.rno = 576345;
        s2.cgpa = 8.95;

        Student s3 = new Student(); // declaration    OR   Object s3
        s3.name = "Ansh";
        s3.rno = 87345;
        s3.cgpa = 9.5;

        System.out.println(s1.name + " " + s1.rno + " " + s1.cgpa);
        s1.cgpa = 9.2;  //Changing the cgpa
        System.out.println(s1.name + " " + s1.rno + " " + s1.cgpa);


//        System.out.println(s2.name + " " + s2.rno + " " + s2.cgpa);
//        System.out.println(s3.name + " " + s3.rno + " " + s3.cgpa);

        s1.print();
        s2.print();
        s3.print();
    }
}
