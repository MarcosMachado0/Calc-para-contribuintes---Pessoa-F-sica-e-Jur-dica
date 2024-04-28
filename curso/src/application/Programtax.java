package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Taxpayer;

public class Programtax {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Taxpayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthexpense = sc.nextDouble();
				
				list.add(new Individual(name, annualIncome, healthexpense));
			}
			else {
				System.out.print("Number employees: ");
				int numberemp = sc.nextInt();
				
				list.add(new Company(name, annualIncome, numberemp));
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(Taxpayer taxp : list) {
			System.out.println(taxp.getName() + ": " +  String.format("%.2f", taxp.tax()));
		}
		
		double sum = 0.0;
		for(Taxpayer taxp : list) {
			sum += taxp.tax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: " + String.format("%.2f", sum));
		
		
		
		
		
	sc.close();
	}

}
