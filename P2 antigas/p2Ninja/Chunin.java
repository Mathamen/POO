package p2Ninja;

public class Chunin extends Ninja implements Treinamento {
	public void treinar() {
		System.out.println("Chunin "+ this.getNome() + " iniciando treinamento avan�ado");
	}
	
	
	
	
	
	public Chunin(String cpfN, String nomeN, int idadeN) {
		super(cpfN,nomeN,idadeN);
	}
	public Chunin(String cpfN) {
		super(cpfN);
	}
}
