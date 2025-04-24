import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        // Crear 1 objeto con constructor vacio Pizza
//        Pizza pizza1 = new Pizza();
//        pizza1.setTamano("Grande");
//        pizza1.setTipo("Un Ingrediente");
//        pizza1.setIngredienteExtra(false);
//        pizza1.setPreciobase(5.99);
//        pizza1.mostraPizza();
//        //precio
//        pizza1.setPrecioFinal(pizza1.calcularPrecio(pizza1.getIngredienteExtra()));
//        pizza1.mostraPizza();
//
//        // Crear 1 objeto con constructor con parametros Pizza
//        Pizza pizza2 = new Pizza("Personal", "Especialidad", true, 5.99, 0.0);
//        pizza2.mostraPizza();
//        pizza2.setPrecioFinal(pizza2.calcularPrecio(pizza2.getIngredienteExtra()));
//        pizza2.mostraPizza();
//
//        //crear pizza3
//        Pizza pizza3 = new Pizza("Personal", "Especialidad", false, 0.0, 0.0);
//        pizza3.mostraPizza();
//        pizza3.setPreciobase(pizza3.calcularPreciobase(pizza3.getTamano(), pizza3.getTipo()));
//        pizza3.mostraPizza();
//        pizza3.setPrecioFinal(pizza3.calcularPrecio(pizza3.getIngredienteExtra()));
//        pizza3.mostraPizza();
//
//
//        // Crear 1 objeto con constructor vacio Pedido
//        Pedido pedido1 = new Pedido();
//        pedido1.generarNumeroPedido();
//        pedido1.setFecha(LocalDate.now());
//        pedido1.setEstado(Estado.Entregado);
//        pedido1.setCantidad(50);
//        pedido1.setPizza(pizza1);
//        pedido1.setTotal(pedido1.calcularTotal(pedido1.getCantidad(), pedido1.getPizza()));
//        pedido1.mostrarPedido();
//
//
//        // Crear 1 objeto con constructor con parametros Pedido
//        Pedido pedido2 = new Pedido(0, LocalDate.now(), Estado.Pendiente, 50, 0.0, pizza2);
//        pedido2.mostrarPedido();
//        pedido2.generarNumeroPedido();
//        pedido2.setEstado(Estado.Entregado);
//        pedido2.setTotal(pedido2.calcularTotal(pedido2.getCantidad(), pedido2.getPizza()));
//        pedido2.mostrarPedido();
//
//        //imprimir solo el numero de orden de pedido1
//        System.out.println("Numero de orden de pedido1: " + pedido1.getNumeroPedido());

        //crear obejeto pizza parametrizado
        System.out.print("Ingrese el tamaño de la pizza (Personal, Grande, Gigante): ");
        String tamano = sn.nextLine();
        System.out.print("Ingrese el tipo de pizza (Un Ingrediente, Especialidad): ");
        String tipo = sn.nextLine();
        System.out.print("¿Desea agregar un ingrediente extra? (1:si, 2:no): ");
        int ingrediente = Integer.parseInt(sn.nextLine());
        boolean ingredienteExtra;
        if(ingrediente == 1) {
            ingredienteExtra = true;
        } else {
            ingredienteExtra = false;
        }

        //objeto para pizza
        Pizza pizza4 = new Pizza(tamano, tipo, ingredienteExtra, 0.0, 0.0);
        pizza4.setPreciobase(pizza4.calcularPreciobase(pizza4.getTamano(), pizza4.getTipo()));
        pizza4.setPrecioFinal(pizza4.calcularPrecio(pizza4.getIngredienteExtra()));
        pizza4.mostraPizza();

        //crear objeto pedido parametrizado para pedido
        Pedido pedido3 = new Pedido(0, LocalDate.now(), Estado.Pendiente, 5,  0.0, pizza4);
        pedido3.generarNumeroPedido();
        pedido3.setTotal(pedido3.calcularTotal(pedido3.getCantidad(), pedido3.getPizza()));
        pedido3.mostrarPedido();
    }
}