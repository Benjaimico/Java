package diagnostico;

import java.util.Arrays;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {

		String[][] matriz;
		matriz = new String[100][10];

		matriz[0][0] = "Usuario:";
		matriz[0][1] = "Raul Zepeda";
		matriz[0][2] = "01-01-90";
		matriz[0][3] = "17098098-0";

		matriz[1][0] = "Cliente:";
		matriz[1][1] = "Mar del sur 1010";
		matriz[1][2] = "90909090";
		matriz[1][3] = "150";

		matriz[2][0] = "Profesional:";
		matriz[2][1] = "10 años";
		matriz[2][2] = "Construccion";

		matriz[3][0] = "Administrativo:";
		matriz[3][1] = "Supervisor";
		matriz[3][2] = "Bronko Yotte";

		matriz[4][0] = "Usuario:";
		matriz[4][1] = "Francisca Lopez";
		matriz[4][2] = "09-09-87";
		matriz[4][3] = "13982794-8";

		matriz[5][0] = "Cliente:";
		matriz[5][1] = "Las acacias 123";
		matriz[5][2] = "89786957";
		matriz[5][3] = "240";

		matriz[6][0] = "Profesional:";
		matriz[6][1] = "25 años";
		matriz[6][2] = "Contabilidad";

		matriz[7][0] = "Administrativo:";
		matriz[7][1] = "Ines Tabilidad";
		matriz[7][2] = "CEO";

		matriz[8][0] = "Usuario:";
		matriz[8][1] = "Jonas Sanche";
		matriz[8][2] = "02-05-67";
		matriz[8][3] = "16879238-7";

		matriz[9][0] = "Cliente:";
		matriz[9][1] = "Av Matta 546";
		matriz[9][2] = "89786547";
		matriz[9][3] = "500";

		matriz[10][0] = "Profesional:";
		matriz[10][1] = "30 años";
		matriz[10][2] = "TV y Comunicaciones";

		matriz[11][0] = "Administrativo:";
		matriz[11][1] = "Juanin Harris";
		matriz[11][2] = "Camara";

		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i].length == 0) {
				continue; // Si la fila está vacía, omitir
			}

			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] != null) {
					System.out.println(matriz[i][j] + " ");
				}

			}

		}

	}
}
