package entities;

public abstract class Contribuentes {

	private String name;
	private Double anual_income;
	
	public Contribuentes() {
		
	}
	
	public Contribuentes(String name, Double anual_income) {
		this.name = name;
		this.anual_income = anual_income;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnual_income() {
		return anual_income;
	}

	public void setAnual_income(Double anual_income) {
		this.anual_income = anual_income;
	}

	public abstract double taxa();
	
	
	
}
