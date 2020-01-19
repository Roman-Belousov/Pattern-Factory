package Lern;

public class UserAmtSymbolChoice implements Choice {
	private int amt;

	public void setAmount(int amt) {
		this.amt = amt;
	}

	@Override
	public boolean compare(String a) {
		int count = 0;

		if (index(a) > amt)
			count++;

		return count > 0;
	}

	public int index(String a) {
		int b = a.length();
		return b;
	}
}
