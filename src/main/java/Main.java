import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("vamos calcular o imc");
    System.out.println("");
    System.out.println("digite sua altura");
    double altura = sc.nextDouble();
    System.out.println("");
    System.out.println("digite seu peso");
    double peso = sc.nextDouble();
    System.out.println("");
    double imc = peso/(altura*altura);
    System.out.printf("o seu imc é : %.2f",imc);





    sc.close();
  }

}