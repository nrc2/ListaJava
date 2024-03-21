package pagamento;

import pagamento.FormaDePagamento;
import pagamento.PagamentoNaoAutorizadoException;
import java.util.Scanner;

class Credenciais {
  private String login;
  private String senha;

  public Credenciais(String login, String senha) {
    this.login = login;
    this.senha = senha;
  }

  public String getUsuario() {
    return login;
  }

  public String getSenha() {
    return senha;
  }
}

public class PayPal implements FormaDePagamento {

  Scanner scanner = new Scanner(System.in);

  private Credenciais[] clientes = new Credenciais[] {
      new Credenciais("thygas", "123"),
      new Credenciais("julia", "456")
  };

  // @Override
  public boolean autenticar() {

    System.out.println("Digite o login do PayPal:");
    String loginPayPal = scanner.nextLine();
    System.out.println("Digite a senha do PayPal:");
    String senhaPayPal = scanner.nextLine();

    for (Credenciais cliente : clientes) {
      if (cliente.getUsuario().equals(loginPayPal) && cliente.getSenha().equals(senhaPayPal)) {

        return true;
      }
    }
    return false;
  }

  // @Override
  public void processarPagamento(double valor) throws PagamentoNaoAutorizadoException {
    boolean aut = autenticar();
    if (aut) {
      System.out.println("Processando pagamento com PayPal no valor de " + valor + " processado com sucesso");
    } else {
      throw new PagamentoNaoAutorizadoException("Pagamento não autorizado.");
    }

  }
}
