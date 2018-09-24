package locadora;

public class Fita {
	public enum Tipo implements CalculaValorCorrente {

		normal {
			@Override
			public double calculaValorCorrente(double valorCorrente, int diasAlugada) {
				valorCorrente += 2;
				if (diasAlugada > 2) {
					valorCorrente += (diasAlugada - 2) * 1.5;
				}
				return valorCorrente;
			}
		},
		lancamento {
			@Override
			public double calculaValorCorrente(double valorCorrente, int diasAlugada) {
				return valorCorrente += (diasAlugada * 3);
			}
		},
		infantil {
			@Override
			public double calculaValorCorrente(double valorCorrente, int diasAlugada) {
				valorCorrente += 1.5;
				if (diasAlugada > 3) {
					valorCorrente += (diasAlugada - 3) * 1.5;
				}
				return valorCorrente;
			}
		}
	};

	private String titulo;
	private Tipo codigoDePreco;

	public Fita(String titulo, Tipo codigoDePreco) {
		this.titulo = titulo;
		this.codigoDePreco = codigoDePreco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Tipo getCodigoDePreco() {
		return codigoDePreco;
	}

	public void setCodigoDePreco(Tipo codigoDePreco) {
		this.codigoDePreco = codigoDePreco;
	}
}
