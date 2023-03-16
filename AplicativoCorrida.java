import java.util.Scanner;
import java.util.function.Supplier;
public class AplicativoCorrida extends pessoa {

  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    
    System.out.println("deseja fazer uma corrida, sim ou nao?");
    String x = sc.nextLine();
    if(x.equalsIgnoreCase(x="nao")){
      System.out.println("corrida cancelada!");
    }
    else{

    System.out.println("Informe o nome do passageiro: ");
    String nom = sc.nextLine();
    
    System.out.println("Informe o Numero: ");
    int tel = sc.nextInt();
    
    System.out.println("Informe o saldo da da corrida: ");
    double Sald = sc.nextDouble();
    
    System.out.println("Informe a nota: ");
    int Not = sc.nextInt();    
    
  Passageiro p1 = new Passageiro(nom, tel, Sald, Not);
   
  System.out.println("defina o raio do circulo");  


 }
 
}
}


  

 


