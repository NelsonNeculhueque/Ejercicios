public class Circulo {

    private double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }

    public void CalcularArea(){
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("Area:" + area );
    }

    public void CalcularPerimetro(){
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Perimetro:" + perimetro);
    }

    public void CambiarRadio(double nueva_radio){
        this.radio = nueva_radio;
    }

    public static void main(String[] args){
        Circulo miCir = new Circulo(7.0);

        miCir.CalcularArea();
        miCir.CalcularPerimetro();

        miCir.CambiarRadio(5.0); // Cambia el radio a 5.0

        // Vuelve a calcular el área y el perímetro con el nuevo radio
        miCir.CalcularArea();
        miCir.CalcularPerimetro();
    }
}
