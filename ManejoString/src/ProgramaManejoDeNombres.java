import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static void main(String[] args) {

        System.out.println("Ingrese el primer nombre: ");
        Scanner n1 = new Scanner(System.in);
        String name1 = n1.nextLine();

        System.out.println("Ingrese el segundo nombre: ");
        Scanner n2 = new Scanner(System.in);
        String name2 = n2.nextLine();


        System.out.println("Ingrese el tercer nombre: ");
        Scanner n3 = new Scanner(System.in);
        String name3 = n3.nextLine();


        System.out.println("El primer nombre es: " + name1);
        int cantName1 = name1.length();
        System.out.println("El primer nombre es: " + name1 + " y contiene " + cantName1 + " caracteres");

        // nombre 1
        char[] caracter = name1.toCharArray();
        caracter[1] = Character.toUpperCase(caracter[1]);

        // nombre 2
        char[] caracter2 = name2.toCharArray();
        caracter2[1] = Character.toUpperCase(caracter2[1]);

        // nombre 3
        char[] caracter3 = name1.toCharArray();
        caracter3[1] = Character.toUpperCase(caracter3[1]);

        System.out.println(caracter[1] + "." + caracter[caracter.length-2] + caracter[caracter.length-1 ] + "_"
                            + caracter2[1] + "." + caracter2[caracter2.length-2] + caracter2[caracter2.length-1] + "_"
                            + caracter3[1] + "." + caracter3[caracter3.length-2] + caracter3[caracter3.length-1]);



    }
}
