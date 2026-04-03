public class Arvore {
	private Elemento ele;
	private Arvore dir;
	private Arvore esq;

	public Arvore(){
		this.ele = null;
		this.dir = null;
		this.esq = null;
	}
	public Arvore(Elemento elem){
		this.ele = elem;
		this.dir = null;
		this.esq = null;
	}
	public boolean isEmpty(){
		return(this.ele == null);
	}
	public void inserir(Elemento novo){
		if (isEmpty()) {
			this.ele = novo;
		}
		else {
			 Arvore novaArvore = new Arvore(novo);
			 if (novo.getValor()<this.ele.getValor()){
			 	if(this.esq == null){
			 		this.esq = novaArvore;
			 	}
			 	else {
			 		 this.esq.inserir(novo);
			 	}
			}
			else if (novo.getValor()>this.ele.getValor()){
				if(this.dir == null){
					this.dir = novaArvore;
				}
				else{
					this.dir.inserir(novo);
				}
			}
		}
	}
	public boolean busca(int valor){
		if(isEmpty()){
			return false;
		}
		if (this.ele.getValor() == valor){
			return true;
		}
		else {
			if(valor < this.ele.getValor()){
				if(this.esq == null){
					return false;
				}
				else{
					return this.esq.busca(valor);
				}
			}
			else if(valor>this.ele.getValor()){
				if(this.dir == null){
					return false;
				}
				else{
					return this.dir.busca(valor);
				}
			}
			return false;
		}
	}
	public void imprimirPreOrdem(){
		if(!isEmpty()){
			System.out.print(this.ele.getValor() + " ");
			if (this.esq != null){
				this.esq.imprimirPreOrdem();
			}
			if (this.dir != null){
				this.dir.imprimirPreOrdem();
			}
		}
	}
	public void imprimirInOrdem(){
		if(!isEmpty()){
			if (this.esq != null){
				this.esq.imprimirInOrdem();
			}
			System.out.print(this.ele.getValor() + " ");
			if (this.dir != null){
				this.dir.imprimirInOrdem();
			}
		}
	}
	public void imprimirPosOrdem(){
		if(!isEmpty()){
			if (this.esq != null){
				this.esq.imprimirPosOrdem();
			}
			if (this.dir != null){
				this.dir.imprimirPosOrdem();
			}
			System.out.print(this.ele.getValor() + " ");
		}
	}
	public void imprimirInOrdemInvertida(){
		if(!isEmpty()){
			if (this.dir != null){
				this.dir.imprimirInOrdemInvertida();
			}
			System.out.print(this.ele.getValor() + " ");
			if (this.esq != null){
				this.esq.imprimirInOrdemInvertida();
			}
		}
	}
	public Arvore remover(Elemento elem){
		if (this.ele.getValor() == elem.getValor()){
			if(this.dir == null && this.esq == null){
				return null;
			}
			else { //somente filhos na esquerda
				if (this.esq != null && this.dir == null){
					return this.esq;
				}
				else if (this.dir != null && this.esq == null){ //somente filhos na direita
					return this.dir;
				}
				else{
					//filhos em ambos lados
					//mover elem ao msm nivel
					//1o maior entre os menores
					Arvore aux = this.esq;
					while(aux.dir != null) {
						aux = aux.dir;
					}
					this.ele = aux.getElemento();
					aux.setElemento(elem);
					this.esq = esq.remover(elem);
				}
			}
		}
		else if (elem.getValor() <this.ele.getValor()){
			//responsabilidade para a sub-arvore da esquerda
			this.esq = this.esq.remover(elem);
		}
		else if (elem.getValor() >this.ele.getValor()){
			//responsabilidade para a sub-arvore da direita
			this.dir = this.dir.remover(elem);
		}
		return this;
	}
	public void setElemento(Elemento elem){
		this.ele = ele;
	}
	public void setDireita(Arvore dir){
		this.dir = dir;
	}
	public void setEsquerda(Arvore esq){
		this.esq = esq;
	}
	public Elemento getElemento(){
		return this.ele;
	}
	public Arvore getDireira(){
		return this.dir;
	}
	public Arvore getEsquerda(){
		return this.esq;
	}
}