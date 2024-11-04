package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Vista {
	Scanner sc = new Scanner(System.in);

	public int mostrarMenu() {
		System.out.println("--------Bienvenidos al menu principal--------\n"
						 + "[1] Cliente\n"
						 + "[2] Salir");
		return sc.nextInt();
	}

	public String pedirString(String mensaje) {
		System.out.println(mensaje);
		return sc.nextLine();
	}

	public int menuCliente() {
		System.out.println("--------Bienvenido al menu de cliente--------\n"
						 + "[1] Crear cliente\n"
						 + "[2] Elegir cliente\n"
						 + "[3] Salir");
		return sc.nextInt();
	}

	public int menuCajero() {
		System.out.println("--------Bienvenidos al menu de cajero--------\n"
						 + "[1] Depositar dinero\n"
						 + "[2] Retirar Dinero\n"
						 + "[3] Verificar tarjetas\n"
						 + "[4] Verificar pago interes mensual\n"
						 + "[5] Salir");
		return sc.nextInt();
	}

}
