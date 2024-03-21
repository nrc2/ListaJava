package pagamento;

public class PagamentoNaoAutorizadoException extends Exception {
    public PagamentoNaoAutorizadoException(String mensagem) {
        super(mensagem);
    }
}