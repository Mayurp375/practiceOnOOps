package basicPractice;

public class oopsCocept extends Demo {
    void demo() {
        System.out.println("by super call in method and override ");
        super.demo();

    }

    void demo2() {
        System.out.println("abstract class achived");
    }

}

abstract class Demo {
    void demo() {
        System.out.println("non abstract class");
    }

    abstract void demo2();
}

class call {
    public static void main(String[] args) {

        oopsCocept consept = new oopsCocept();
        consept.demo();
        consept.demo2();
    }
}
