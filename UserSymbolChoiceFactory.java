package Lern;

import java.util.Scanner;

public class UserSymbolChoiceFactory extends AbstractChoiceFactory {

	private Scanner scanner;

	public UserSymbolChoiceFactory(Scanner scanner) {
		super("Сортировка по определенному символу");
		this.scanner = scanner;
	}

	@Override
	public Choice create() {
		UserSymbolChoice choice = new UserSymbolChoice();
		System.out.print("Введите символ: ");
		choice.setSymbol(scanner.next().toString());
		return choice;
	}
}