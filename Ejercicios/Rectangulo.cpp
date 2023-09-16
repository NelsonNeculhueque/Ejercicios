#include <iostream>
using namespace std;

class Rectangulo {
private:
    double longitud;
    double ancho;

public:
    Rectangulo(double longitud, double ancho) {
        this->longitud = longitud;
        this->ancho = ancho;
    }

    double calcularArea() {
        double area = longitud * ancho;
        return area;
    }

    double calcularPerimetro() {
        double perimetro = 2 * (longitud + ancho);
        return perimetro;
    }

    void cambiarLongitud(double nuevaLongitud) {
        this->longitud = nuevaLongitud;
    }

    void cambiarAncho(double nuevoAncho) {
        this->ancho = nuevoAncho;
    }
};

int main() {
    Rectangulo miRect(5.0, 3.0);

    double area = miRect.calcularArea();
    double perimetro = miRect.calcularPerimetro();

    cout << "Area del rectangulo: " << area << endl;
    cout << "Perimetro del rectangulo: " << perimetro << endl;

    miRect.cambiarLongitud(7.0);
    miRect.cambiarAncho(4.0);

    area = miRect.calcularArea();
    perimetro = miRect.calcularPerimetro();

    cout << "Area del rectangulo con nuevos valores: " << area << endl;
    cout << "Perimetro del rectangulo con nuevos valores: " << perimetro << endl;

    return 0;
}
