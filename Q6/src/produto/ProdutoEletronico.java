package produto;

public abstract class ProdutoEletronico {
        protected String modelo;
        protected Integer anoLancamento;
        protected Double preco;
        protected String sistemaOperacional;
        protected Integer quantidadeDisponivel;

        public ProdutoEletronico(String modelo, Integer anoLancamento, Double preco, String sistemaOperacional, Integer quantidadeDisponivel){
            this.modelo = modelo;
            this.anoLancamento = anoLancamento;
            this.preco = preco;
            this.sistemaOperacional = sistemaOperacional;
            this.quantidadeDisponivel = quantidadeDisponivel;

        }

        public abstract void exibirInformacoes();
}