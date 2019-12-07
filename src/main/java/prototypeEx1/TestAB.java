package main.java.prototypeEx1;

public class TestAB {
    public static void main(String[] args) {
        A a = new A();
        a.setAa("12");
        a.setBb("ss");
        B b =new B();
        B  BB=b.startClone(a);
        System.out.println(BB.getAaa().toString()                                                       );
    }
}
