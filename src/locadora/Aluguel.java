package locadora;

public class Aluguel extends MetodosAluguel {
    private Fita fita;
    private int diasAlugada;

    public Aluguel(Fita fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }

    public Fita getFita() {
        return fita;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }

	public void setDiasAlugada(int diasAlugada) {
		this.diasAlugada = diasAlugada;
	}
    
	public double valorCorrente(int diasAlugada) {
		double valorCorrente = 0.0;
		this.getFita().getCodigoDePreco().calculaValorCorrente(valorCorrente, diasAlugada);
		return valorCorrente;
	};
	
	public int pontosDeAlugadorFrequente(@SuppressWarnings("rawtypes") Enum tipo,int diasAlugada) {
		int pontosDeAlugadorFrequente = 1;
		if (tipo == Fita.Tipo.lancamento && diasAlugada > 1) {
			pontosDeAlugadorFrequente++;
		}
		return pontosDeAlugadorFrequente;
	};

}
