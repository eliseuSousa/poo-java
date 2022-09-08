package questao2;

public class Principal {
  public static void main(String[] args) {
    Data d1 = new Data(27, 8, 2001);
    Data d2 = d1.clone();
    System.out.println(d1.toString());
    System.out.println(d1.comparar(d2));
    ;
  }
}
