public class Carro {
	private int portas;

	public Carro(int portas) { 
	      this.portas = portas;
	   }
	
	public void SetPortas(int portas) {
		this.portas = portas;
	}
	
	public int GetPortas() {
		return (this.portas);
	}
	
	public void Retorno() {
		System.out.println(this.portas);
	}
}
