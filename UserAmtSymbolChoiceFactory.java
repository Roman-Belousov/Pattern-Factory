package Lern;

import java.util.Scanner;

public class UserAmtSymbolChoiceFactory extends AbstractChoiceFactory{

	private Scanner scanner;

	public UserAmtSymbolChoiceFactory(Scanner scanner) {
		super("Сортировка по количеству символов в строке");
		this.scanner = scanner;
	}

	@Override
	public Choice create() {
		UserAmtSymbolChoice choice = new UserAmtSymbolChoice();
		System.out.print("Введите количество символов: ");
		choice.setAmount(scanner.nextInt());
		return choice;
		
	}
		
	

}
