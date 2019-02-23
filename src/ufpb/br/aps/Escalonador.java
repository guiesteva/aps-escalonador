package ufpb.br.aps;


public class Escalonador {

	
	private int quantum;

	public void setQuantum(int quantum) {
		this.quantum = quantum;
		
	}

	public void addProcesso(String processo, int inicio, int duracao) {
			
	}

	public TabelaExecucao rodar() {
		
		return new TabelaExecucao();
	}

	

}
