package repositoriogit;

import java.util.Scanner;

/**
 *
 * @author jyhsk
 */
public class RepositorioGit {

	Scanner entrada = new Scanner(System.in);
	String mensaje;

	public void Mensajer() {
		mensaje = entrada.nextLine();
		System.out.println("El mensaje es: " + mensaje);
	}

	public static void main(String[] args) {
		System.out.println("Hola Mundo");

		RepositorioGit ejemplo = new RepositorioGit();
		ejemplo.Mensajer();
	}

}
