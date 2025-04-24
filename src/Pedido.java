import java.time.LocalDate;

public class Pedido {

    private int numeroPedido;
    private LocalDate fecha;
    private Estado estado;
    private int cantidad;
    private double total;
    private Pizza pizza;

    //constructor vacio
    public Pedido() {

    }

    //constructor con parametros
    public Pedido(int numeroPedido, LocalDate fecha, Estado estado, int cantidad, double total, Pizza pizza) {
        this.numeroPedido = numeroPedido;
        this.fecha = fecha;
        this.estado = estado;
        this.cantidad = cantidad;
        this.total = total;
        this.pizza = pizza;
    }

    // getter y setter
    public int getNumeroPedido() {
        return numeroPedido;
    }
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    public Pizza getPizza() {
        return pizza;
    }
    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    //metodo para crear numero aleatorio
    public void generarNumeroPedido() {
        numeroPedido = (int)(Math.random() * 100);
    }

    //imprimir pedido
    public void mostrarPedido() {
        System.out.println("Numero de pedido: " + numeroPedido + ", Fecha: " + fecha +
                ", Estado: " + estado + ", Cantidad: " + cantidad + ", Total: " + total +
                ", Pizza: " + pizza);
    }

    //calcular total
    public double calcularTotal(int cantidad, Pizza pizza) {
        total = cantidad * pizza.getPrecioFinal();
        return total;
    }
}