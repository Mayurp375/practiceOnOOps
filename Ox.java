package basicPractice;

public class Ox extends property {
    void eat() {
        System.out.println("ox is eating");
    }

    void legs() {
        System.out.println("ox has 4 legs");
    }

}


 class man extends property {
     @Override
     void eat() {
         super.toPrint();
         System.out.println("man is eating");
     }

     @Override
     void legs() {
         System.out.println("man having 2 legs");
     }

     public static void main(String[] args) {
         Ox ox = new Ox();
         ox.eat();
         ox.legs();

         man man = new man();
         man.eat();
         man.legs();
     }
 }

abstract class property {
    abstract void eat();

    abstract void legs();

    void toPrint(){
        System.out.println("this is to print method");
    }
}
