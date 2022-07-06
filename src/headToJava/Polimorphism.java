package headToJava;

class A {
    int ivar = 7;
    void m1() {
        System.out.println("A's m1, ");
    }
    void m2() {
        System.out.println("A's m2, ");
    }
    void m3() {
        System.out.println("A's m3, ");
    }
    static void s1(){
        System.out.println("A's s1,  ");
    }
}

class B extends A {
    void m1() {
        System.out.println("B's m1, ");
    }
    static void s1(){
        System.out.println("B's s1,  ");
    }
}

class C extends  B {
    void m3() {
        System.out.println("C's m3, " + (ivar + 6));
    }
    static void s1(){
        System.out.println("C's s1,  ");
    }
}

public class Polimorphism {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
//        b.m1();
//        c.m2();
//        a.m3();
//        c.m1();
//        c.m2();
//        c.m3();
//        a.m1();
//        b.m2();
//        c.m3();
//        a2.m1();
//        a2.m2();
//        a2.m3();
        // Наступні 4 рядки це приклад поліморфізму, коли для методу callm1(A a) передаються перемінні a, b, c, a2
        callm1(a);
        callm1(b);
        callm1(c);
        callm1(a2);
        // Статичні перевіряють те що зліва від перемінної (тип А, B, C)
        // Обєктні перевіряють по назві обєкта
//        a2.s1();
//        a.s1();
//        c.s1();
//        B.s1();
//        A.s1();
    }
    static  void callm1(A a) {
        a.m1();
    }
}


