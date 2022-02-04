package tp7eje09;

public class Tp7eje09 {

    public static void main(String[] args) {
        Matematica matematica = new Matematica();
        double valor1 = Math.random() * 11;
        double valor2 = Math.random() * 11;

        matematica.setNumReal1(valor1);
        matematica.setNumReal2(valor2);

        System.out.printf("Valor 1: %.2f \n", matematica.getNumReal1());
        System.out.printf("Valor 2: %.2f \n", matematica.getNumReal2());

        System.out.printf("El valor mayor es: %.2f \n", matematica.devolverMayor());

        System.out.printf("La potencia entre los valores es: %.2f \n", matematica.calcularPotencia());

        System.out.printf("La raiz cuadrada del menor valor es: %.2f \n", matematica.calcularRaiz());
        
        
    }

}
