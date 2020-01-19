package Lern;

import java.util.Scanner;



public class Main {
	public static void output(String a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%s \n ", a[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AbstractChoiceFactory choiceFactories[] = {  new SmileChoiceFactory(),
				                                     new UserSymbolChoiceFactory(scanner),
				                                     new UserAmtSymbolChoiceFactory(scanner)};
		System.out.println("Исходный массив:");
		String[] a = Generator.generate();
		while (true) {
			System.out.println("Выберите способ сортировки:");
			for (int i = 0; i < choiceFactories.length; i++) {
				System.out.printf("%d) %s\n", i + 1, choiceFactories[i].getName());
			}
			System.out.printf("%d) Выход\n", choiceFactories.length + 1);
			System.out.print("Сделайте выбор: ");
			int index = scanner.nextInt() - 1;
			if (index == choiceFactories.length) {
				
				break;

			}
			
			Choice choice = choiceFactories[index].create();
			System.out.println("Отсортированный массив:");
			Filtr.filtr(a, choice);
			
		
		}
		System.out.println("До свидания");
		scanner.close();
			
			

			}

		

	}


