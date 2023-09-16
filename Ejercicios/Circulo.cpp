#include <iostream>
#include <cmath>
using namespace std;

class Circulo {
private:
    double radio;

public:
    Circulo(double radio) {
        this->radio = radio;
    }

    void CalcularArea() {
        double area = M_PI * pow(radio, 2);
        cout << "Area: " << area << endl;
    }

    void CalcularPerimetro() {
        double perimetro = 2 * M_PI * radio;
        cout << "Perimetro: " << perimetro << endl;
    }

    void CambiarRadio(double nueva_radio) {
        this->radio = nueva_radio;
    }
};

int main() {
    Circulo miCir(7.0);

    miCir.CalcularArea();
    miCir.CalcularPerimetro();

    miCir.CambiarRadio(5.0);

    miCir.CalcularArea();
    miCir.CalcularPerimetro();

    return 0;
}
