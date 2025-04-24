public class Pizza {

    private String tamano;
    private String tipo;
    private boolean ingredienteExtra;
    private double preciobase;
    private double preciofinal;

    //contructor vacio
    public Pizza() {}

    //constructor con parametros
    public Pizza(String tamano, String tipo, boolean ingredienteExtra, double preciobase, double preciofinal) {
        this.tamano = tamano;
        this.tipo = tipo;
        this.ingredienteExtra = ingredienteExtra;
        this.preciobase = preciobase;
        this.preciofinal = preciofinal;
    }

    //getter y setters

    public String getTamano() {
        return tamano;
    }
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getIngredienteExtra() {
        return ingredienteExtra;
    }
    public void setIngredienteExtra(boolean ingredienteExtra) {
        this.ingredienteExtra = ingredienteExtra;
    }

    public double getPreciobase() {
        return preciobase;
    }
    public void setPreciobase(double precio) {
        this.preciobase = precio;
    }

    public double getPrecioFinal() {
        return preciofinal;
    }
    public void setPrecioFinal(double precio) {
        this.preciofinal = precio;
    }

    //mostraPizza
    public void mostraPizza() {
        System.out.println("Tamaño: " + tamano + ", Tipo: " + tipo + ", precio: " + preciobase +
                ", Ingrediente Extra: " + ingredienteExtra + ", Precio Final: " + preciofinal);
    }


    //calcular Precio
    public double calcularPrecio(boolean ingredienteExtra) {

        if (ingredienteExtra) {
            preciofinal = preciobase + 1.99;
        } else {
            preciofinal = preciobase;
        }

        return preciofinal;
    }

    public double calcularPreciobase(String tamano, String tipo) {

        switch (tamano){
            case "Personal":
                preciobase = 5.00;
                break;
            case "Grande":
                preciobase = 10.00;
                break;
            case "Gigante":
                preciobase = 15.00;
                break;
            default:
                System.out.println("Tamaño no válido");
        }

        if(tipo == "Especialidad") {
            preciobase += 1.99;
        } else {
            preciobase += 0.00;
        }

        return preciobase;
    }

}
