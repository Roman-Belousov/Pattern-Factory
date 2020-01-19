package Lern;

public class UserSymbolChoice implements Choice {
	private CharSequence symbol;

	public void setSymbol(CharSequence c) {
		this.symbol = c;
	}

	@Override
	public boolean compare(String a) {

		return a.contains(symbol);
	}

	
	}


