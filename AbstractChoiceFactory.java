package Lern;

abstract public class AbstractChoiceFactory implements ChoiceFactory{
	private String name;

	public AbstractChoiceFactory(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

