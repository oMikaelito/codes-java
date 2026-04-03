public class Teste {
    public static void main(String[] args) {
        FilaPrioridade fila = new FilaPrioridade();

        fila.adicionar(new Solicitacao(1, "baixa"));
        fila.adicionar(new Solicitacao(2, "alta"));
        fila.adicionar(new Solicitacao(3, "media"));
        fila.adicionar(new Solicitacao(4, "alta"));
        fila.adicionar(new Solicitacao(5, "baixa"));

        while (!fila.estaVazia()) {
            Solicitacao proximaSolicitacao = fila.remover();
            System.out.println("Solicitaçao #" + proximaSolicitacao.id + " removida com prioridade " + proximaSolicitacao.prioridade);
        }
    }
}