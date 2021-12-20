public class Automovel {
	private double potencia;

	public Automovel(double portas) { 
	      this.potencia = portas;
	   }
	
	public void SetPortas(double portas) {
		this.potencia = portas;
	}
	
	public double GetPortas() {
		return (this.potencia);
	}
	
	public void Retorno() {
		System.out.println(this.potencia);
	}
}
