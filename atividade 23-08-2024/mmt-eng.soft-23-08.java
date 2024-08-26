import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double boleto1, boleto2, boleto3, boleto4, totalContas, salarioBruto, salarioLiquido, restante;
    
    Scanner ler = new Scanner(System.in);

    
    System.out.println("Digite o valor do 1º boleto:"); 
    boleto1 = ler.nextDouble();

    System.out.println("Digite o valor do 2º boleto:");
    boleto2 = ler.nextDouble();

    System.out.println("Digite o valor do 3º boleto:");
    boleto3 = ler.nextDouble();

    System.out.println("Digite o valor do 4º boleto:");
    boleto4 = ler.nextDouble();

   
    System.out.println("Digite o valor do seu salário bruto:");
    salarioBruto = ler.nextDouble();

   
    salarioLiquido = salarioBruto - (salarioBruto * 0.14);


    totalContas = boleto1 + boleto2 + boleto3 + boleto4;

  
    restante = salarioLiquido - totalContas;

   // resultados
    System.out.println("Salário líquido: R$ " + salarioLiquido);
    System.out.println("Total das contas: R$ " + totalContas);

    if (restante >= 0) {
      System.out.println("Você terá R$ " + restante + " sobrando depois de pagar as contas.");
    } else {
      System.out.println("Você ficará devendo R$ " + Math.abs(restante) + " depois de pagar as contas.");
    }
  }
}
