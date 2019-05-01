/**
 * 
 */
package com.egartech.sychev.task;

import java.util.Scanner;

/**
 * The Class Main.
 *
 * @author Sychev Evgenii
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int key = 0;
		String s = "";

		while (!"5".equals(s)) {
			System.out.println(" Домашняя работа. ");
			System.out.println("1.Вывести в консоль числовые представления, " + "символов Unicode: ‘D’, ‘R’, ‘f’.\r\n "
					+ "Для вывода нажмите 1");
			System.out.println("2.Создать переменные указанных типов "
					+ "и осуществлить соответствующие преобразования:\r\n" + "int в byte\r\n" + "short в byte\r\n"
					+ "char в int\r\n" + "float в long\r\n" + "long в int\r\n" + "double в int\r\n"
					+ "Для вывода результатов преобразования нажмите 2");
			System.out.println("3. Осуществить упаковку int в Integer,  boolean в Boolean, char в Character,"
					+ " а также распаковку Float в float, Long в long.\r\n" + "Для выводов результатов нажмите 3");
			System.out.println("4.При помощи методов классов String или StringBuilder произвести:\r\n"
					+ "создание двух различных строк,\r\n" + "осуществить реверс второй строки,\r\n"
					+ "получить две подстроки из каждой из начальных строк;\r\n"
					+ " Для выводов результатов нажмите 4");
			System.out.println("5. Для выхода из приложения введите 5");
			System.out.println(" Введите номер меню:");
			s = scan.next();
			try {
				key = Integer.parseInt(s);
			} catch (NumberFormatException e) {
				System.out.println("Неверный ввод");
			}

			switch (key) {
			case 1:
				HomeWork.UnicodeInt();
				break;
			case 2:
				HomeWork.TypeConversion();
				break;
			case 3:
				HomeWork.AutoBox();
				break;
			case 4:
				HomeWork.ProgString();
				break;

			}

		}
		System.out.println("Спасибо за внимание!");

	}

}