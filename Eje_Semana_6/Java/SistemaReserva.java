public class SistemaReserva {

    public static class Reserva {

        private String nombreDelPasajero;
        private String numeroDeVuelo;
        private String fecha;

        public Reserva(String nombreDelPasajero, String numeroDeVuelo, String fecha) {
            this.nombreDelPasajero = nombreDelPasajero;
            this.numeroDeVuelo = numeroDeVuelo;
            this.fecha = fecha;
        }

        public String mostrarDetalle() {
            return "Reserva para " + nombreDelPasajero + "\nNúmero de vuelo: " + numeroDeVuelo + "\nFecha: " + fecha;
        }
    }

    public static class ReservaEconomica extends Reserva {

        private String asiento;

        public ReservaEconomica(String nombreDelPasajero, String numeroDeVuelo, String fecha, String asiento) {
            super(nombreDelPasajero, numeroDeVuelo, fecha);
            this.asiento = asiento;
        }


        public String mostrarDetalle() {
            String padre = super.mostrarDetalle();
            return padre + "\nClase: Económica\nAsiento: " + asiento;
        }
    }

    public static class ReservaBusiness extends Reserva {

        private String asiento;
        private String vip;

        public ReservaBusiness(String nombreDelPasajero, String numeroDeVuelo, String fecha, String asiento, String vip) {
            super(nombreDelPasajero, numeroDeVuelo, fecha);
            this.asiento = asiento;
            this.vip = vip;
        }


        public String mostrarDetalle() {
            String padre = super.mostrarDetalle();
            return padre + "\nClase: Business\nAsiento: " + asiento + "\nAcceso a sala VIP: " + vip;
        }
    }

    public static class ReservaPrimeraClase extends Reserva {

        private String asiento;
        private String servicioChampagne;

        public ReservaPrimeraClase(String nombreDelPasajero, String numeroDeVuelo, String fecha, String asiento, String servicioChampagne) {
            super(nombreDelPasajero, numeroDeVuelo, fecha);
            this.asiento = asiento;
            this.servicioChampagne = servicioChampagne;
        }

        @Override
        public String mostrarDetalle() {
            String padre = super.mostrarDetalle();
            return padre + "\nClase: Primera Clase\nAsiento: " + asiento + "\nServicio de Champagne: " + servicioChampagne;
        }
    }

    public static void main(String[] args) {
        ReservaEconomica reservaEconomica = new ReservaEconomica("Juan Pérez", "AA123", "2023-09-20", "Economica 23A");
        ReservaBusiness reservaBusiness = new ReservaBusiness("María García", "BA456", "2023-09-20", "vip 5B", "Sí");
        ReservaPrimeraClase reservaPrimeraClase = new ReservaPrimeraClase("Pedro Rodríguez", "CX789", "2023-09-20", "Primera Clase 1A", "Sí");

        System.out.println("Detalle de la reserva económica:");
        System.out.println(reservaEconomica.mostrarDetalle());

        System.out.println("\nDetalle de la reserva de business:");
        System.out.println(reservaBusiness.mostrarDetalle());

        System.out.println("\nDetalle de la reserva de primera clase:");
        System.out.println(reservaPrimeraClase.mostrarDetalle());
    }
}
