public class SistemaProductos {

    public static class Productos {
        private String nombre;
        private double precio;
        private String categoria;

        public Productos(String nombre, double precio, String categoria) {
            this.nombre = nombre;
            this.precio = precio;
            this.categoria = categoria;
        }

        public String mostrarDetalle() {
            return "Nombre: " + nombre + "\nPrecio: " + precio + "\nCategoría: " + categoria;
        }
    }

    public static class Electronico extends Productos {
        private String marca;
        private String modelo;

        public Electronico(String nombre, double precio, String categoria, String marca, String modelo) {
            super(nombre, precio, categoria);
            this.marca = marca;
            this.modelo = modelo;
        }

        public String mostrarDetalle() {
            String padre = super.mostrarDetalle();
            return padre + "\nMarca: " + marca + "\nModelo: " + modelo;
        }
    }

    public static class Alimenticio extends Productos {
        private String fechaVencimiento;

        public Alimenticio(String nombre, double precio, String categoria, String fechaVencimiento) {
            super(nombre, precio, categoria);
            this.fechaVencimiento = fechaVencimiento;
        }


        public String mostrarDetalle() {
            String padre = super.mostrarDetalle();
            return padre + "\nFecha de Vencimiento: " + fechaVencimiento;
        }
    }

    public static class Vestimenta extends Productos {
        private String talla;
        private String color;

        public Vestimenta(String nombre, double precio, String categoria, String talla, String color) {
            super(nombre, precio, categoria);
            this.talla = talla;
            this.color = color;
        }


        public String mostrarDetalle() {
            String padre = super.mostrarDetalle();
            return padre + "\nTalla: " + talla + "\nColor: " + color;
        }
    }

    public static void main(String[] args) {
        Electronico electronico = new Electronico("Laptop", 1000, "Electrónico", "Dell", "XPS 15");
        Alimenticio alimenticio = new Alimenticio("Leche", 2.5, "Alimenticio", "2023-10-15");
        Vestimenta vestimenta = new Vestimenta("Camiseta", 15, "Vestimenta", "M", "Azul");

        System.out.println("Detalles del producto electrónico:");
        System.out.println(electronico.mostrarDetalle());

        System.out.println("\nDetalles del producto alimenticio:");
        System.out.println(alimenticio.mostrarDetalle());

        System.out.println("\nDetalles del producto de vestimenta:");
        System.out.println(vestimenta.mostrarDetalle());
    }
}
