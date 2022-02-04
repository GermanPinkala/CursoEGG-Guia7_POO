
package tp7eje06;


public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;

    }

    public void servirTaza(int tamTaza) {

        if (tamTaza < cantidadActual) {

            cantidadActual = cantidadActual - tamTaza;

        } else {

            System.out.printf("No alcanzó a llenar la taza, se virtió solo %d mililitros", cantidadActual);

            cantidadActual = 0;

        }

    }

    public void vaciarCafetera() {

        cantidadActual = 0;

    }

    public void agregarCafe(int cafe) {

        int restante = capacidadMaxima - cantidadActual;
        
        if (cafe < restante) {
            
            cantidadActual = cantidadActual + cafe;
            
        }else{
        
            cantidadActual = capacidadMaxima;
            
            cafe = cafe - restante;
            
            System.out.printf("La cafetera excede la capacidad máxima, sobraron %d mililitros", cafe);
        }

    }

}
