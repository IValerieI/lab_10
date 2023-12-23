package lab_10;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Добавьте нового сотрудника");
		System.out.println("1 - Декан \n2 - Сотрудник вуза \n3 - Научный сотрудник \n4 - Лектор");
		int num = scanner.nextInt();

		Employee newEmployee = null;
		switch (num) {
			case 1:
				newEmployee = new Dean();
			case 2:
				newEmployee = new ResearchAssociate();
			case 3:
				newEmployee = new Lecturer();
		}
		System.out.println("Введите имя нового сотрудника");
		String name = scanner.next();
		newEmployee.setName(name);
		System.out.println("Введите email нового сотрудника");
		String email = scanner.next();
		newEmployee.setEmail(email);

		System.out.println("Информация о новом сотруднике");
		System.out.println(newEmployee.getName());
		System.out.println(newEmployee.getEmail());
			
	}

}




