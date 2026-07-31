package OOPS_08;

class ComplexNumber{
    int x;
    int y;
    ComplexNumber(int x,int y){
        this.x=x;
        this.y=y;
    }
    void print(){
        if(y>=0) System.out.println(x+" + "+y+"i");
        else System.out.println(x+" - "+(-y)+"i");
    }

    void add(ComplexNumber z2) {
//        this.x+=z2.x;
//        this.y+=z2.y;

        x += z2.x;
        y += z2.y;
    }

    public void multiply(ComplexNumber z1) {
    x = x*z1.x - y*z1.y;
    y = x*z1.y + y*z1.x;
    }


    public void divide(ComplexNumber z1) {
        float denominator = z1.x * z1.x + z1.y * z1.y;
        float newX = (x * z1.x + y * z1.y) / denominator;
        float newY = (y * z1.x - x * z1.y) / denominator;
        x = (int) newX;
        y = (int) newY;
    }
}

public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2,5);
        ComplexNumber z2 = new ComplexNumber(3,-4);
        z1.print();
        z2.print();
        z1.add(z2);
        z1.print();z2.print();

        z2.multiply(z1);
        z1.print();z2.print();

        z2.divide(z1);
        z1.print();z2.print();

    }
}
