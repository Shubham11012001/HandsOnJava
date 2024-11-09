package org.mishrashu.constructor;

class A {
  A() {
    this(10);
    System.out.println("No-arg constructor of class A");
  }

  A(int x) {
    System.out.println("Parameterized constructor of class A");
  }
}

class B extends A {
  B() {
    System.out.println("No-arg constructor of class B");
  }
}

public class TestConstructorChaining {
  public static void main(String[] args) {
    B obj = new B();
  }
}
