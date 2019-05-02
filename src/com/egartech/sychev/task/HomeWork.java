/**
 * 
 */
package com.egartech.sychev.task;

/**
 * The Class HomeWork.
 *
 * @author Sychev Evgenii
 */
public class HomeWork {

	/**
	 * Unicode int.
	 */

	public static void unicodeInt() {
		char a = 'D';
		char c = 'R';
		char p = 'f';
		System.out.println("1. Числовые представления " + "символов Unicode: ‘D’, ‘R’, ‘f’.\r\n ");
		System.out.println("D в числовом значении  = " + (int) a + "\nR в числовом значении = " + (int) c
				+ " \nf в числовом значении  = " + (int) p + "\n");
	}

	/**
	 * Type conversion.
	 */

	public static void typeConversion() {
		int a = 150;
		short b = 32710;
		char c = 'v';
		float d = 31.34f;
//		float ost = d - (int) d;
		double w = d - Math.floor(d);
		long e = 9999;
		double f = 31.45;
		double p = f - Math.floor(f);
		System.out.println("2. Написать программу, в которой будут созданы переменные указанных типов "
				+ "и осуществлены соответствующие преобразования:\r\n" + "int в byte\r\n" + "short в byte\r\n"
				+ "char в int\r\n" + "float в long\r\n" + "long в int\r\n" + "double в int\r\n"
				+ "Результат преобразований \n");
		System.out.println("int a = 150 -> byte a = " + (byte) a + "\n short b = 32710 -> byte b = " + (byte) b
				+ " \n char c = 'v' -> int = " + (int) c + " \n float d = 31.34 -> long  = " + (long) d
				+ " \n long e = 9999 -> int e = " + (int) e + " \n double f = 31.45 -> int f = " + (int) f);
		System.out.printf(
				"В результате преобразовании float d = 31.34 -> long была потеряна дробная часть  d = " + "%.2f\n", w);
		System.out.printf(
				"В результате преобразовании double f = 31.45 -> int была потеряна дробная часть  f = " + "%.2f\n", p);
	}

	/**
	 * Auto box.
	 */
	public static void autoBox() {
		int a = 150;
		Integer a1 = a;
		boolean b = true;
		Boolean b1 = b;
		char c = 'v';
		Character c1 = c;
		Float d1 = 34.45f;
		float d = d1;
		Long e1 = 2345l;
		long e = e1;
		System.out.println("3. Написать программу, в которой осуществить упаковку\r\n" + "int в Integer\r\n"
				+ "boolean в Boolean\r\n" + "char в Character\r\n" + "А также распаковку\r\n" + "Float в float\r\n"
				+ "Long в long\r\n" + "Результат преобразований \n");
		System.out.println("int a = 150 ->  Integer a1 = " + a1 + "\n boolean b = true-> Boolean b1 = " + b1
				+ " \n char c = 'v' -> Character c1 = " + c1 + " \n Float d1 =34.45 -> float d  = " + d
				+ " \n Long e1 = 2345l -> long e = " + e);
	}

	/**
	 * Prog string.
	 */
	public static void progString() {
		StringBuilder stringbuilder1 = new StringBuilder("Core Java Volume I Fundamentals");
		StringBuilder stringbuilder2 = new StringBuilder("Core Java Volume II Advanced Topics");
		StringBuilder stringbuilder3 = new StringBuilder(stringbuilder2);
		StringBuilder rev2str = stringbuilder3.reverse();
		String str1 = stringbuilder1.substring(0, 9);
		String str2 = stringbuilder1.substring(5, 9);
		String str3 = stringbuilder2.substring(0, 18);
		String str4 = stringbuilder2.substring(5);
		System.out.println("4.При помощи методов классов String или StringBuilder произвести:\r\n"
				+ "создание двух различных строк,\r\n" + "осуществить реверс второй строки,\r\n"
				+ "получить две подстроки из каждой из начальных строк;\r\n" + " Результат");
		System.out.println("First string = " + stringbuilder1 + "\n Second string  = " + stringbuilder2
				+ " \n Reverce second string = " + rev2str + " \n The first substring in the first line = " + str1
				+ " \n The second substring from the first line = " + str2
				+ " \n The first substring of the second line = " + str3
				+ " \n The second substring of the second line = " + str4);

	}

}
