package com.qsoft;

public class Calculator {

	public static int add(String str) {
		if (str == null) {
			return 0;
		}
		if (str.isEmpty()) {
			return 0;
		}
		if (str.contains("//")) {
			str = str.replace("//", "");
			str = str.replace("\n", "");
			String[] strTemp = str.split(";");
			return sum(strTemp);
		} else {
			str = str.replace("\n", "");
			String[] strTemp = str.split(",");
			return sum(strTemp);
		}
	}

	public static int sum(String[] str) {
		int sum = 0;
		int strTempSize = str.length;
		for (int i = 0; i < strTempSize; i++) {
			String str1 = str[i];
			if (str1.isEmpty()) {
				continue;
			}
			if (Integer.parseInt(str1) < 0) {
				throw new RuntimeException("negatives not allowed");
			}
			sum += Integer.parseInt(str1);
		}
		return sum;
	}
}
