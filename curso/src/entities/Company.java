package entities;

public class Company extends Taxpayer {

	private Integer numberEmployee;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double annualIncome, Integer numberEmployee) {
		super(name, annualIncome);
		this.numberEmployee = numberEmployee;
	}

	@Override
	public double tax() {
		if(numberEmployee > 10) {
			return annualIncome * 0.14;
		}
		else {
			return annualIncome * 0.16;
		}
	}
	
}
