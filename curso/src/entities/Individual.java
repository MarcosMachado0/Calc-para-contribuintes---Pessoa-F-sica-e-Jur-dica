package entities;

public class Individual extends Taxpayer {

	private Double healthexpense; 
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double annualIncome,Double healthexpense) {
		super(name, annualIncome);
		this.healthexpense = healthexpense;
	}
	
	public Double getHealthexpense() {
		return healthexpense;
	}

	public void setHealthexpense(Double healthexpense) {
		this.healthexpense = healthexpense;
	}

	@Override
	public double tax() {
		if(annualIncome <= 20000.0) {
			return (annualIncome * 0.15) - (healthexpense * 0.50);
		}
		else {
			return (annualIncome * 0.25) - (healthexpense * 0.50);
		}
	}

	
}
