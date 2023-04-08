// Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    System.out.println("Digite o número que deseja: ");
    Scanner teclado = new Scanner(System.in);
    double numeroInformado = teclado.nextDouble();
    teclado.close();
    System.out.println("O número informado é: " + numeroInformado);
  }
}