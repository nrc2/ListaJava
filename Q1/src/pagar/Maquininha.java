package pagar;

import java.util.Scanner;

import pagamento.*;

public class Maquininha {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escolha o método de pagamento (1: PayPal, 2: Cartão de Crédito, 3: Boleto Bancário): ");

    int metodoPagamento = scanner.nextInt();
    scanner.nextLine();

    switch (metodoPagamento) {
      case 1:
        PayPal cliente = new PayPal();
        System.out.println("Digite o valor do pagamento:");
        double valor = scanner.nextDouble();
        try {
          cliente.processarPagamento(valor);
        } catch (PagamentoNaoAutorizadoException e) {
          System.out.println(e.getMessage());
        }
        break;
      case 2:
        CartaoCredito cliente2 = new CartaoCredito();
        System.out.println("Digite o valor do pagamento:");
        double valor2 = scanner.nextDouble();
        try {
          cliente2.processarPagamento(valor2);
        } catch (PagamentoNaoAutorizadoException e) {
          System.out.println(e.getMessage());
        }
        break;
      case 3:
        BoletoBancario cliente3 = new BoletoBancario();
        try {
          cliente3.processarPagamento(1.0);
        } catch (PagamentoNaoAutorizadoException e) {
          System.out.println(e.getMessage());
        }

        break;
      default:
        System.out.println("Método de pagamento inválido.");
        System.exit(1);
    }

  }

}
