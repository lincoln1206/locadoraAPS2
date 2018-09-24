package locadora;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private List<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionaAluguel(Aluguel aluguel) {
		fitasAlugadas.add(aluguel);
	}

	public String extrato() {
		final String fimDeLinha = System.getProperty("line.separator");
		double valorTotal = 0.0;
		int pontosDeAlugadorFrequente = 0;
		String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;

		for (Aluguel cadaAluguel : fitasAlugadas) {

			double valorCorrente = 0.0;
			valorCorrente = cadaAluguel.getFita().getCodigoDePreco().calculaValorCorrente(valorCorrente,
					cadaAluguel.getDiasAlugada());

			pontosDeAlugadorFrequente = cadaAluguel.pontosDeAlugadorFrequente(cadaAluguel.getFita().getCodigoDePreco(),
					cadaAluguel.getDiasAlugada());

			resultado += "\t" + cadaAluguel.getFita().getTitulo() + "\t" + valorCorrente + fimDeLinha;
			valorTotal += valorCorrente;
		} 
		
		resultado += "Valor total devido: " + valorTotal + fimDeLinha;
		resultado += "Voce acumulou " + pontosDeAlugadorFrequente + " pontos de alugador frequente";
		return resultado;
	}

}
