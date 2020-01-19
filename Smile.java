package Lern;

public class Smile implements Choice {

	@Override
	public boolean compare(String a) {
		String template = ":)";
		String template1 = ";)";
		return a.contains(template)||a.contains(template1);

	}
}
