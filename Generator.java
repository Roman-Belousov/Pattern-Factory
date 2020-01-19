package Lern;

import java.util.Random;

public class Generator {

	static String str1[] = { "Gm", "ABC", "Money$", "Smile:)", "Next-=>", "jp", "Rap$" };
	static String str2[] = { "hot", "kops", "def", "nomteter", "www", "Saw", "Big;)" };

	public static String fromArr(String arr[]) {
		Random random = new Random();
		return arr[random.nextInt(arr.length)];

	}

	public static String[] generate() {
		String str[] = new String[5];
		for (int i = 0; i < str.length; i++) {
			str[i] = fromArr(str1) + " " + fromArr(str2);
			System.out.println(str[i]);
		}
		return str;

	}
}
