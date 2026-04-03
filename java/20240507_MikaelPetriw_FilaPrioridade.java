class FilaPrioridade {
    private No inicio;
    private No fim;
    private int tamanho;

    public FilaPrioridade() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    public void adicionar(Solicitacao solicitacao) {
        No novoNo = new No(solicitacao);
        if (estaVazia() || solicitacao.prioridade.equals("alta")) {
            novoNo.proximo = inicio;
            inicio = novoNo;
        } else {
            No atual = inicio;
            No anterior = null;
            while (atual != null && atual.solicitacao.prioridade.equals("baixa")) {
                anterior = atual;
                atual = atual.proximo;
            }
            if (anterior != null) {
                anterior.proximo = novoNo;
            } else {
                inicio = novoNo;
            }
            novoNo.proximo = atual;
        }
        if (fim == null) {
            fim = novoNo;
        }
        tamanho++;
    }
    public Solicitacao remover() {
        if (estaVazia()) {
            System.out.println("A fila está vazia.");
            return null;
        }
        Solicitacao solicitacaoRemovida = inicio.solicitacao;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        tamanho--;
        return solicitacaoRemovida;
    }
    public int tamanho() {
        return tamanho;
    }
    public boolean estaVazia() {
        return tamanho == 0;
    }
}
