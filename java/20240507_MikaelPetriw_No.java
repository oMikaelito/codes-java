class No {
    Solicitacao solicitacao;
    No proximo;

    public No(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
        this.proximo = null;
    }
}