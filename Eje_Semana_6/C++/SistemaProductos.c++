#include <iostream>
#include <string>

class Productos {
public:
    Productos(std::string nombre, double precio, std::string categoria)
        : nombre(nombre), precio(precio), categoria(categoria) {}

    std::string mostrarDetalle() {
        return "Nombre: " + nombre + "\nPrecio: $" + std::to_string(precio) + "\nCategoría: " + categoria;
    }

protected:
    std::string nombre;
    double precio;
    std::string categoria;
};

class Electronico : public Productos {
public:
    Electronico(std::string nombre, double precio, std::string categoria, std::string marca, std::string modelo)
        : Productos(nombre, precio, categoria), marca(marca), modelo(modelo) {}

    std::string mostrarDetalle() {
        std::string padre = Productos::mostrarDetalle();
        return padre + "\nMarca: " + marca + "\nModelo: " + modelo;
    }

private:
    std::string marca;
    std::string modelo;
};

class Alimenticio : public Productos {
public:
    Alimenticio(std::string nombre, double precio, std::string categoria, std::string fechaVencimiento)
        : Productos(nombre, precio, categoria), fechaVencimiento(fechaVencimiento) {}

    std::string mostrarDetalle() {
        std::string padre = Productos::mostrarDetalle();
        return padre + "\nFecha de Vencimiento: " + fechaVencimiento;
    }

private:
    std::string fechaVencimiento;
};

class Vestimenta : public Productos {
public:
    Vestimenta(std::string nombre, double precio, std::string categoria, std::string talla, std::string color)
        : Productos(nombre, precio, categoria), talla(talla), color(color) {}

    std::string mostrarDetalle() {
        std::string padre = Productos::mostrarDetalle();
        return padre + "\nTalla: " + talla + "\nColor: " + color;
    }

private:
    std::string talla;
    std::string color;
};

int main() {
    Electronico electronico("Laptop", 1000, "Electrónico", "Dell", "XPS 15");
    Alimenticio alimenticio("Leche", 2.5, "Alimenticio", "2023-10-15");
    Vestimenta vestimenta("Camiseta", 15, "Vestimenta", "M", "Azul");

    std::cout << "Detalles del producto electrónico:" << std::endl;
    std::cout << electronico.mostrarDetalle() << std::endl;

    std::cout << "\nDetalles del producto alimenticio:" << std::endl;
    std::cout << alimenticio.mostrarDetalle() << std::endl;

    std::cout << "\nDetalles del producto de vestimenta:" << std::endl;
    std::cout << vestimenta.mostrarDetalle() << std::endl;

    return 0;
}
