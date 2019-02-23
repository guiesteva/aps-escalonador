package ufpb.br.aps;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EscalonadorTest {
    
	private Escalonador escalonador;
	
	private void novoEscalonador() {
	    escalonador = new Escalonador();
		
	}
	
	@Test
	public void cenario() {
		novoEscalonador();
		escalonador.setQuantum(3);
		
		escalonador.addProcesso("p1", 0, 3);
		escalonador.addProcesso("p2", 5, 3);
		
		TabelaExecucao tabela = escalonador.rodar();
		
		assertEquals(StatusProcesso.EXECUTANDO, tabela.getStatus("p1", 0));
		assertEquals(StatusProcesso.NAOEXISTENTE, tabela.getStatus("p2", 5));
		
		String resultado = "P1 RWRWRF\n"
		                 + "P2 IIIIIRWRF";		
	}
	
	
	

}
