package packge;


public class ListaSequencial {

	private int[] array;
	//qtd = E a quantidade de elementos presentes no array.
	private int qtd;

	public ListaSequencial(int tam) {
		// O construtor recebe o tamanho do array como parametro
		array = new int[tam];
	}
	//Metodo que adiciona um elemento no inicio da lista.
	public void adicionarinicio(int num) throws Exception{
		/*/Verifico se a lista(array) está cheia se estiver lanço uma exceção
		 * com uma mensagen informando que a lista está cheia.
		 */
		if(isCheia())
			throw new Exception("Lista esta cheia ! ");
		/*/ Se não estiver cheia percorro o array da direita para esquerda
		 * fazendo com que o indice daquela posição receba o elemento do indice anterior.
		 */
		for(int i = qtd; i>0;i--) {
			array[i] = array[i-1];
		}
		/*/ O indice zero do array recebe o novo elemento, e atualizo a quantidade de elementos
		 * presentes no array. 
		 */
		array[0] = num;
		qtd++;
	}
	//Metodo que adiciona um elemento no final da lista
	public void adicionarFinal(int num)throws Exception {
		/*/Verifico se a lista(array) está cheia se estiver lanço uma exceção
		 * com uma mensagen informando que a lista está cheia.
		 */
		if(isCheia())
			throw new Exception("Lista esta cheia ! ");
		/*/ Se não estiver cheia, faço o array no indice igual a quantidade
		 * receber o novo elemento, e por fim atualizo a quantidade de elementos
		 * presentes no array.
		 */
		array[qtd++] = num;
	}
	//Metodo que adiciona um elemento em um indice especifico
	public void adicionarNoIndice(int indice, int num)throws Exception {
		/*/Verifico se o indice é valido e se a lista está cheia.
		 */
		if(indice < 0 || indice >= qtd)
			throw new Exception("Indice invalido !");
		if(isCheia())
			throw new Exception("Lista esta cheia ! ");
		/*/ Se estiver ok, percorro o array da direita para esquerda
		 * até o indice desejado fazendo com que o indice daquela posição
		 * receba o elemento do indice anterior. .
		 */
		for(int i = qtd; i> indice;i--) {
			array[i] = array[i-1];
		}
		/*/ O array no indice passado como parametro recebe o novo elemento
		 * e atualizo a quantidade de elementos presentes no array. 
		 */
		array[indice] = num;
		qtd++;
	}
	//Metodo que remove um elemneto do inicio da lista
	public int removerInicio()throws Exception{
		/*/ Verifico se a lista está vazia se estiver lançõ uma exceção
		 * informando que a lista está vazia e não é possivel remover o elmento.
		 */
		if(isVazia())
			throw new Exception("A lista esta vazia nao e possivel remover o elemento !");
		//Se não estiver vazia guardo o elemento do inicio em uma variavel.
		int lixo = array[0];
		/*/ Se a lista não estiver vazia percorro o array da esquerda para direita
		 * fazendo com que o array no indice zero receba o elemento do indice um, e assim
		 * sucessivamente para os respectivos indices.
		 */
		for(int i = 0;i<qtd;i++) {
			array[i] = array[i+1];
		}
		/*/Por fim retorno o elemento removido e atualizo a variavel da quantidade
		 * com um decremento.
		 * 
		 */
		qtd--;
		return lixo;
	}
	//Metodo que remove um elemento do final da lista
	public int removerFinal() throws Exception{
		/*/ Verifico se a lista está vazia se estiver lançõ uma exceção
		 * informando que a lista está vazia e não é possivel remover o elmento.
		 */
		if(isVazia())
			throw new Exception("A lista esta vazia nao e possivel remover o elemento !");
		//Se não estiver vazia guardo o elemento do final em uma variavel.
		int lixo = array[qtd-1];
		/*/Por fim retorno o elemento removido e atualizo a variavel da quantidade
		 * com um decremento.
		 */
		qtd--;
		return lixo;
	}
	//Metodo que remove um elemento de um indice especifico
	public int removerDoIndice(int indice)throws Exception{
		/*/Verifico se o indice é valido e se a lista está vazia.
		 */
		if(indice < 0 || indice >= qtd)
			throw new Exception("Indice invalido !");
		if(isVazia())
			throw new Exception("Lista está vazia !");
		/*/Se o indice for valido e a lista não estiver vazia guardo o
		 * o elemento do indice em uma variavel, e percorro o array da esquerda para direita
		 * a partir do indice passado fazendo com oque o array no indice receba o seu proximo.
		 */
		int lixo = array[indice];

		for(int i = indice;i<qtd;i++) {
			array[i] = array[i+1];
		}
		/*/Por fim retorno o elemento removido e atualizo a variavel da quantidade
		 * com um decremento.
		 */
		qtd--;
		return lixo;
	}
	//Metodo que retorna o elemento do inicio da lista
	public int inicio() throws Exception{
		/*/ Verifico se a lista está vazia se sim lanço uma exceção
		 * se não retorno o elemnto do inicio da lista.
		 */
		if(isVazia())
			throw new Exception("Lista esta vazia !");
		return array[0];
	}
	//Metodo que retorna o elemento do fim da lista
	public int fim() throws Exception{
		/*/ Verifico se a lista está vazia se sim lanço uma exceção
		 * se não retorno o elemnto do fim da lista.
		 */
		if(isVazia())
			throw new Exception("Lista esta vazia !");
		return array[qtd-1];
	}
	//Metodo que retorna o elemento no indice
	public int elementoNoIndice(int indice)throws Exception{
		/*/ Verifico se o indice e valido se nao lanço uma exceção
		 * se sim retorno o elemnto do indice.
		 */
		if(indice < 0 || indice >= qtd)
			throw new Exception("Indice invalido !");

		return array[indice];
	}
	//Metodo que retorna o tamanho da lista que é a quantidade de elementos.
	public int tamanho() {
		return qtd;
	}
	//Metodo que retonar se a lista está vazia ou não
	public boolean isVazia() {		
		return qtd  == 0;
	}
	//Metodo que retorna se a lista está cheia ou não
	public boolean isCheia() {
		return qtd == array.length;
	}
	//Metodo que imprimi a lista no console
	public void imprimir() {
		System.out.print("Inicio -> ");
		for(int i = 0;i<qtd;i++) {
			System.out.print(array[i]+" -> ");
		}
		System.out.println("Fim");
	}
}
