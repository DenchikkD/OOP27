package lessons9;

/**
 * Created by Denni on 15.08.2016.
 */
public class Task1 {
    public static void main(String[] args) {
        A b = new B(20);
        A a = new A(20);
        System.out.println(b.getA());
        b.g();
        System.out.println("test " + a);

    }


}

class A {

    private int a;
    int b;

    public A(int a) {
        this.a = a;
    }

    final public int getA() {
        return a;
    }

    private void f() {
        System.out.println("f()");
    }

    public void g() {
//        f();
        System.out.println("g()");
    }


}

class B extends A {

    public B(int a) {
        super(a);
    }

    public void foo() {

    }

    public void g() {
        System.out.println("g(int)");

    }

    @Override
    public String toString() {
        return "Helo";
    }

}