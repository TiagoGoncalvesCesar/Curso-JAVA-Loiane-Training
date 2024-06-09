package conta_bancaria;

public class ContaEspecial extends ContaBancaria {
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		 String s = "ContaEspecial: ";
	        s += " limite de: " + limite;
	        s += "; " + super.toString(); 
	        s += "" ;
	        return s; 
	}
	public boolean sacar(double valor){

        double saldoComLimite = this.getSaldo() + limite;

        if ((saldoComLimite-valor) >=0){
            this.setSaldo(this.getSaldo()-valor);

            //super.sacar(valor);
            return true;
        }

        return false;
    }
	
}
