#include <iostream>
#include <string>

class Reserva {
public:
    Reserva(std::string nombre_del_pasajero, std::string numero_de_vuelo, std::string fecha)
        : nombre_del_pasajero(nombre_del_pasajero), numero_de_vuelo(numero_de_vuelo), fecha(fecha) {}

    std::string mostrarDetalle() {
        return "Reserva para " + nombre_del_pasajero + "\nNúmero de vuelo: " + numero_de_vuelo + "\nFecha: " + fecha;
    }

protected:
    std::string nombre_del_pasajero;
    std::string numero_de_vuelo;
    std::string fecha;
};

class ReservaEconomica : public Reserva {
public:
    ReservaEconomica(std::string nombre_del_pasajero, std::string numero_de_vuelo, std::string fecha, std::string asiento)
        : Reserva(nombre_del_pasajero, numero_de_vuelo, fecha), asiento(asiento) {}

    std::string mostrarDetalle() {
        std::string padre = Reserva::mostrarDetalle();
        return padre + "\nClase: Económica\nAsiento: " + asiento;
    }

private:
    std::string asiento;
};

class ReservaBusiness : public Reserva {
public:
    ReservaBusiness(std::string nombre_del_pasajero, std::string numero_de_vuelo, std::string fecha, std::string asiento, std::string vip)
        : Reserva(nombre_del_pasajero, numero_de_vuelo, fecha), asiento(asiento), vip(vip) {}

    std::string mostrarDetalle() {
        std::string padre = Reserva::mostrarDetalle();
        return padre + "\nClase: Business\nAsiento: " + asiento + "\nAcceso a sala VIP: " + vip;
    }

private:
    std::string asiento;
    std::string vip;
};

class ReservaPrimeraClase : public Reserva {
public:
    ReservaPrimeraClase(std::string nombre_del_pasajero, std::string numero_de_vuelo, std::string fecha, std::string asiento, std::string primeraclase)
        : Reserva(nombre_del_pasajero, numero_de_vuelo, fecha), asiento(asiento), primeraclase(primeraclase) {}

    std::string mostrarDetalle() {
        std::string padre = Reserva::mostrarDetalle();
        return padre + "\nClase: Primera Clase\nAsiento: " + asiento + "\nServicio de Champagne: " + primeraclase;
    }

private:
    std::string asiento;
    std::string primeraclase;
};

int main() {
    ReservaEconomica reservaEconomica("Juan Pérez", "AA123", "2023-09-20", "Economica 23A");
    ReservaBusiness reservaBusiness("María García", "BA456", "2023-09-20", "vip 5B", "Sí");
    ReservaPrimeraClase reservaPrimeraClase("Pedro Rodríguez", "CX789", "2023-09-20", "Primera Clase 1A", "Sí");

    std::cout << "Detalle de la reserva económica:" << std::endl;
    std::cout << reservaEconomica.mostrarDetalle() << std::endl;

    std::cout << "\nDetalle de la reserva de business:" << std::endl;
    std::cout << reservaBusiness.mostrarDetalle() << std::endl;

    std::cout << "\nDetalle de la reserva de primera clase:" << std::endl;
    std::cout << reservaPrimeraClase.mostrarDetalle() << std::endl;

    return 0;
}
