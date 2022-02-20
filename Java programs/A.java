// A.java
package a;
public class A {
    protected int a;
}

// B.java 
package b;   
import a.A;
public class B extends A {
}

// C.java
package c; 
import b.B;
public class C extends B  { 
    void testIt(){
        a++;
        System.out.println( this.a );
    }
    public static void main( String [] args ) {
        C c = new C();
        c.testIt();
    }
}