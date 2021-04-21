public class B extends A {

    int b = 40;

    void display() {
        System.out.println("this is B having value : " + b);
    }

    public static void main(String[] args) {

        //B obj = new A(); //child can't call parent
        A obj = new B();
        obj.display();
    }
}
