package tp7eje08;

import java.util.Locale;
import java.util.Scanner;

public class Tp7eje08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        String frase;

        Cadena cadena01 = new Cadena();

        cadena01.llenarCadena();
        
        System.out.println("");
        System.out.println("------------------");
        System.out.println("");

        cadena01.mostrarVocales();
        
        System.out.println("");
        System.out.println("------------------");
        System.out.println("");

        cadena01.invertirFrase();
        
        System.out.println("");
        System.out.println("------------------");
        System.out.println("");

        System.out.print("Ingrese una letra que desea contar en la frase: ");
        frase = entrada.nextLine();
        cadena01.vecesRepetido(frase);

        System.out.println("");
        System.out.println("------------------");
        System.out.println("");

        System.out.print("Ingrese una frase para comparar su longitud: ");
        frase = entrada.nextLine();
        cadena01.compararLongitud(frase);

        System.out.println("");
        System.out.println("------------------");
        System.out.println("");

        System.out.print("Ingrese una frase para unir a la original: ");
        frase = entrada.nextLine();
        cadena01.unirFrases(frase);

        System.out.println("");
        System.out.println("------------------");
        System.out.println("");

        System.out.print("Ingrese una letra para reemplazar las 'a': ");
        frase = entrada.nextLine();
        cadena01.reemplazar(frase);

        System.out.println("");
        System.out.println("------------------");
        System.out.println("");

        System.out.print("Ingrese una letra a buscar: ");
        frase = entrada.nextLine();
        if (cadena01.contiene(frase)) {
            System.out.println("La frase contiene la letra buscada");
        } else {
            System.out.println("La frase no contiene la letra buscada");
        }

    }
    
}