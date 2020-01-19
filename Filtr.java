package Lern;



public class Filtr {
	public static void filtr(String a[],Choice c) {
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(c.compare(a[i])) {
				System.out.println(a[i]);
				count++;
			}
		}
		if(count == 0) {
			System.out.println("Ничего не найдено");
		} else {
			System.out.println("Итого " + count + " строк");
		}
	}
}	
				
