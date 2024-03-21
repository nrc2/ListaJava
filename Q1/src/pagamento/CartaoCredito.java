package pagamento;

import java.util.Scanner;

import pagamento.FormaDePagamento;
import pagamento.PagamentoNaoAutorizadoException;

class Credenciais1 {
  private String login;
  private String senha;

  public Credenciais1(String login, String senha) {
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

public class CartaoCredito implements FormaDePagamento {

  Scanner scanner = new Scanner(System.in);

  private Credenciais1[] clientes = new Credenciais1[] {
      new Credenciais1("thygas", "123"),
      new Credenciais1("julia", "456")
  };

  // @Override
  public boolean autenticar() {
    System.out.println("Digite o login do PayPal:");
    String loginCartao = scanner.nextLine();
    System.out.println("Digite a senha do PayPal:");
    String senhaCartao = scanner.nextLine();

    for (Credenciais1 cliente : clientes) {
      if (cliente.getUsuario().equals(loginCartao) && cliente.getSenha().equals(senhaCartao)) {

        return true;
      }
    }
    return false;
  }

  // @Override
  public void processarPagamento(double valor) throws PagamentoNaoAutorizadoException {
    boolean aut = autenticar();
    if (aut) {
      System.out.println("Pagamento com cartão de crédito no valor de " + valor + " processado com sucesso");
    } else {
      throw new PagamentoNaoAutorizadoException("Pagamento não autorizado.");
    }

  }
}