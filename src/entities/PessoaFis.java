package entities;

public class PessoaFis extends Contribuentes {

	
	private Double GastoSaude;
	
	public PessoaFis() {
		super();
	}

	public PessoaFis(String name, Double anual_income, Double gastoSaude) {
		super(name, anual_income);
		GastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return GastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		GastoSaude = gastoSaude;
	}

	@Override
	public double taxa() {	
		
		if(getAnual_income() < 20000.0) {
			return getAnual_income() * 0.15 - getGastoSaude()* 0.50;
		}
		else {
			return getAnual_income() * 0.25 - getGastoSaude()* 0.50;
		}
		
		}
	}
	

