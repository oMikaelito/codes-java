import java.util.ArrayList;

public class ListaSimples {
    public static void main(String[] args) {
        // Criando a lista simples
        ArrayList<String> lista = new ArrayList<>();
        
        // Adicionando itens à lista
        lista.add("Arroz");
        lista.add("Feijão");
        lista.add("Sabão em pó");
        lista.add("Papel higiênico");
        lista.add("Óleo");
        
        // Imprimindo a lista
        System.out.println("Lista original:");
        imprimirLista(lista);
        
        // Incluindo o item "Ovos" ao final da lista
        lista.add("Ovos");
        
        // Imprimindo a lista após a inclusão de "Ovos"
        System.out.println("\nLista com 'Ovos' incluído:");
        imprimirLista(lista);
    }
    
    // Método para imprimir a lista
    public static void imprimirLista(ArrayList<String> lista) {
        for (String item : lista) {
            System.out.println(item);
        }
    }
}