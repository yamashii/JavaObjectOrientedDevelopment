package hoge;

public class Hoge {

  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    Hoge hoge = new Hoge();
    int calcResult = hoge.calcNum(a, b);
    hoge.changeRef(a);
    System.out.println(a);
  }

  private void changeRef(int a) {
    a = 20;
    
  }

  private int calcNum(int a, int b) {
    a = a + b;
    return a;

  }
}
