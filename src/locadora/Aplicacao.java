package locadora;

import locadora.Fita.Tipo;

public class Aplicacao {

	public static void main(String[] args) {

		Fita fita = new Fita("Titanic", Tipo.lancamento);
		Aluguel aluguel = new Aluguel(fita, 4);
		Cliente cliente = new Cliente("Lincoln");
		
		cliente.adicionaAluguel(aluguel);
		System.out.println(cliente.extrato());
	}

}
