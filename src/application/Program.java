package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuentes;
import entities.Empresa;
import entities.PessoaFis;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		List<Contribuentes> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #"+ i +" data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anual_income = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double saude = sc.nextDouble();
				list.add(new PessoaFis(name, anual_income, saude));
			}
			
			else {
				System.out.print("Number of employees: ");
				int numerofun = sc.nextInt();
				list.add(new Empresa(name, anual_income, numerofun));
			}
			
		}
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for(Contribuentes c: list) {
			
			double con = c.taxa();
			System.out.println(c.getName()+ ": $ "+ String.format("%.2f",con));
			sum += con;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));
		
		sc.close();
	}

}
