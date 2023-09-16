public class Rectangulo {

    private double longitud;
    private double ancho;

    public Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public double calcularArea() {
        double area = longitud * ancho;
        return area; 
    }

    public double calcularPerimetro() {
        double perimetro = 2 * (longitud + ancho);
        return perimetro; 
    }

    public void cambiarLongitud(double nuevaLongitud) {
        this.longitud = nuevaLongitud;
    }

    public void cambiarAncho(double nuevoAncho) {
        this.ancho = nuevoAncho;
    }

    public static void main(String[] args) {
        Rectangulo miRect = new Rectangulo(5.0, 3.0);

        double area = miRect.calcularArea();
        double perimetro = miRect.calcularPerimetro();

        System.out.println("Área del rectángulo: " + area);
        System.out.println("Perímetro del rectángulo: " + perimetro);

        miRect.cambiarLongitud(7.0);
        miRect.cambiarAncho(4.0);

        area = miRect.calcularArea();
        perimetro = miRect.calcularPerimetro();

        System.out.println("Área del rectángulo con nuevos valores: " + area);
        System.out.println("Perímetro del rectángulo con nuevos valores: " + perimetro);
    }
}
