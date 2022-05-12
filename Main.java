import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Mascota[] arrayMascotas = new Mascota[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrayMascotas.length; i++) {
            System.out.println("Ingrese el nombre de la mascota: ");
            String nombre = sc.next();

            boolean error = false;

            int cantidadDePatas = 0;

            do {
                try {
                    System.out.println("Ingrese la cantidad de patas de la mascota: ");
                    cantidadDePatas = validarPatas(sc.nextInt());

                    error = false;
                } catch (PatasException e) {
                    System.out.println(e.getMessage());
                    error = true;
                }
            } while (error == true);

            arrayMascotas[i] = new Mascota(nombre, cantidadDePatas);
        }
    }

    public static int validarPatas(int cantidadDePatas) throws PatasException {
        if (cantidadDePatas != 2 && cantidadDePatas != 4) {
            throw new PatasException();
        }

        return cantidadDePatas;
    }
}