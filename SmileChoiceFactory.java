package Lern;

public class SmileChoiceFactory extends AbstractChoiceFactory{

	public SmileChoiceFactory() {
		super("Сортировка по смайлику");
		
	}

	@Override
	public Choice create() {
		return new Smile();
	}

}
