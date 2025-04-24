import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                // Crear objeto pizza parametrizado
                System.out.print("Ingrese el tamaño de la pizza (Personal, Grande, Gigante): ");
                String tamano = sn.nextLine();
                System.out.print("Ingrese el tipo de pizza (Un Ingrediente, Especialidad): ");
                String tipo = sn.nextLine();
                System.out.print("¿Desea agregar un ingrediente extra? (1:si, 2:no): ");
                int ingrediente = Integer.parseInt(sn.nextLine());
                boolean ingredienteExtra = (ingrediente == 1);

                // Objeto para pizza
                Pizza pizza4 = new Pizza(tamano, tipo, ingredienteExtra, 0.0, 0.0);
                pizza4.setPreciobase(pizza4.calcularPreciobase(pizza4.getTamano(), pizza4.getTipo()));
                pizza4.setPrecioFinal(pizza4.calcularPrecio(pizza4.getIngredienteExtra()));
                pizza4.mostraPizza();

                // Crear objeto pedido parametrizado para pedido
                Pedido pedido3 = new Pedido(0, LocalDate.now(), Estado.Pendiente, 5, 0.0, pizza4);
                pedido3.generarNumeroPedido();
                pedido3.setTotal(pedido3.calcularTotal(pedido3.getCantidad(), pedido3.getPizza()));
                pedido3.mostrarPedido();

                // Preguntar al usuario si desea continuar
                System.out.print("¿Desea crear otra pizza y pedido? (1:si, 2:no): ");
                int respuesta = Integer.parseInt(sn.nextLine());
                if (respuesta != 1) {
                    continuar = false; // Salir del bucle
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada no válida. Por favor, ingrese un número.");
            } catch (Exception e) {
                System.out.println("Se produjo un error: " + e.getMessage());
            }
        }

        sn.close();
    }
}

