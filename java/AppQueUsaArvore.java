public class AppQueUsaArvore{
	public static void main(String[]args){
		Arvore arvore = new Arvore(new Elemento(10));
		arvore.inserir(new Elemento(5));
		arvore.inserir(new Elemento(1));
		arvore.inserir(new Elemento(8));
		arvore.inserir(new Elemento(15));
		arvore.inserir(new Elemento(12));
		arvore.inserir(new Elemento(18));

		System.out.println("busca(5)? " + (arvore.busca(5) ? "existe":"nao existe"));
		System.out.println("busca(12)? " + (arvore.busca(12) ? "existe":"nao existe"));
		System.out.println("busca(18)? " + (arvore.busca(18) ? "existe":"nao existe"));
		System.out.println("busca(34)? " + (arvore.busca(34) ? "existe":"nao existe"));
		System.out.println("busca(7)? " + (arvore.busca(7) ? "existe":"nao existe"));
		System.out.println("busca(18)? " + (arvore.busca(18) ? "existe":"nao existe"));

		System.out.println("Imprimir PreOrdem:");
		arvore.imprimirPreOrdem();
        System.out.println("\n");
		System.out.println("Imprimir InOrdem:");
		arvore.imprimirInOrdem();
		System.out.println("\n");
		System.out.println("Imprimir PosOrdem:");
		arvore.imprimirPosOrdem();
		System.out.println("\n");
		System.out.println("Imprimir InOrdemInvertida:");
		arvore.imprimirInOrdemInvertida();

		System.out.println("");
		System.out.println("----------------------------------------");
		System.out.println("");
		System.out.println("Removendo elemento");
		Elemento elem = new Elemento(0);

		Arvore arvoreRemocao = new Arvore(new Elemento(20));
		arvoreRemocao.inserir(new Elemento(10));
		arvoreRemocao.inserir(new Elemento(5));
		arvoreRemocao.inserir(new Elemento(2));
		arvoreRemocao.inserir(new Elemento(8));
		arvoreRemocao.inserir(new Elemento(15));
		arvoreRemocao.inserir(new Elemento(12));
		arvoreRemocao.inserir(new Elemento(18));
		arvoreRemocao.inserir(new Elemento(30));
		arvoreRemocao.inserir(new Elemento(25));
		arvoreRemocao.inserir(new Elemento(22));
		arvoreRemocao.inserir(new Elemento(28));
		arvoreRemocao.inserir(new Elemento(35));
		arvoreRemocao.inserir(new Elemento(32));
		arvoreRemocao.inserir(new Elemento(38));

		arvoreRemocao.imprimirInOrdem();
		System.out.println("");

		System.out.println("Removendo no folha 38");
		elem.setValor(38);
		arvoreRemocao = arvoreRemocao.remover(elem);

		System.out.println("Nova Arvore...:");
		arvoreRemocao.imprimirInOrdem();
		System.out.println("");

		System.out.println("Removendo no folha 35");
		elem.setValor(35);
		arvoreRemocao = arvoreRemocao.remover(elem);

		System.out.println("Nova Arvore...:");
		arvoreRemocao.imprimirInOrdem();
		System.out.println("");

		System.out.println("Removendo raiz 20");
		elem.setValor(20);
		arvoreRemocao = arvoreRemocao.remover(elem);
	}

}