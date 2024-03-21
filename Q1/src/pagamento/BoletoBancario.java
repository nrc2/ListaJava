package pagamento;

import java.util.Scanner;

import pagamento.FormaDePagamento;

class Credenciais2 {
  private Integer codigo;

  public Credenciais2(Integer codigo) {
    this.codigo = codigo;
  }

  public Integer getCodigo() {
    return codigo;
  }

}

public class BoletoBancario implements FormaDePagamento {

  private Credenciais2[] clientes = new Credenciais2[] {
      new Credenciais2(1234),
      new Credenciais2(4567)
  };

  // @Override
  public boolean autenticar() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o login do PayPal:");
    String codigo = scanner.nextLine();

    for (Credenciais2 cliente : clientes) {
      if (cliente.getCodigo().equals(codigo)) {
        return true;
      }
    }
    return false;
  }

  // @Override
  public void processarPagamento(double valor) throws PagamentoNaoAutorizadoException {
    boolean aut = autenticar();
    if (aut) {
      System.out.println("Pagamento com boleto processado com sucesso");
    } else {
      throw new PagamentoNaoAutorizadoException("Pagamento não autorizado.");
    }
  }
}