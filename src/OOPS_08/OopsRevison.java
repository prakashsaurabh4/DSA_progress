package OOPS_08;

public class OopsRevison {
    private static class Pokemon {
        int power;
        String type;
        String name;

//        Pokemon(String t,int p){
//            power=p;
//            type=t;
//        }

        Pokemon(String type ,int power) {
            this.power = power;
            this.type = type;
        }
        void print() {
            System.out.println(this.power + " " + this.type + " " + this.name);
        }

    }

    public static void main(String[] args) {
//        Pokemon p1=new Pokemon();
//        p1.name = "Pikachu";p1.type = "Electric";p1.speed=100;
//        Pokemon p2=new Pokemon();
//        p2.name = "Charizard";p2.type = "Fire";p2.speed=100;
//        Pokemon p3 = p1; // p3 is shallow copy of p1(can control
//        p3.type = "Water";
//        System.out.println(p3.type);

        Pokemon pikachu = new Pokemon("Electric",70);
        pikachu.print();
        Pokemon jigglypuff = new Pokemon("Fairy",50);
        jigglypuff.print();

    }
}
