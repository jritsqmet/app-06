
import java.util.Scanner;
import javax.swing.JOptionPane;

// CREA UN PROGRAMA QUE QUE PIDA LA EDAD Y EL SALARIO DE UNA PERSONA
// EL PROGRAMA DEBE PRESENTAR UN  MENÚ EL CUAL CONTIENE:
//  1. SI ES MÉDICO
//  2. SI ES PROGRAMADOR
//  3. SI ES ABOGADO
// SI ES MÉDICO EL SALARIO SE INCREMENTA EN $200 USD
// SI ES PROGRAMADOR AL SALARIO SE SE INCREMENTA EL 15% DEL SALARIO
// SI ES ABOGADO SE INCREMENTA $50 SIEMPRE Y CUANDO SEA MAYOR DE 60 AÑOS
public class main {

    public static void main(String[] args) {

        int edad;
        double salario;
        int opcion;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la edad: ");
        edad = entrada.nextInt();

        System.out.println("Ingresa el salario: ");
        salario = entrada.nextDouble();

        System.out.println("##############################");
        System.out.println("1. Es médico");
        System.out.println("2. Es programador");
        System.out.println("3. Es abogado \n");
        System.out.println("Ingresa una opción: ");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                salario = salario + 200;
                break;

            case 2:

            case 3:

            case 4:
                System.out.println("DOMENICA");
                System.out.println("Daniel Aguilar");
                System.out.println("PROFESOR");
                break;

        }
        JOptionPane.showConfirmDialog(null, "El salario es" + salario );

    }
}
