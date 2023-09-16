#include <iostream>
#include <string>

class Empleado {
public:
    Empleado(std::string nombre, int edad, double salario)
        : nombre(nombre), edad(edad), salario(salario) {}

    std::string rol() {
        return "Soy un empleado de la empresa.";
    }

protected:
    std::string nombre;
    int edad;
    double salario;
};

class Gerente : public Empleado {
public:
    Gerente(std::string nombre, int edad, double salario, std::string departamento)
        : Empleado(nombre, edad, salario), departamento(departamento) {}

    std::string rol() {
        return "Soy un gerente del departamento " + departamento + ". Mi salario es $" + std::to_string(salario) + ".";
    }

private:
    std::string departamento;
};

class Ingeniero : public Empleado {
public:
    Ingeniero(std::string nombre, int edad, double salario, std::string especialidad)
        : Empleado(nombre, edad, salario), especialidad(especialidad) {}

    std::string rol() {
        return "Soy un ingeniero especializado en " + especialidad + ". Mi salario es $" + std::to_string(salario) + ".";
    }

private:
    std::string especialidad;
};

class Asistente : public Empleado {
public:
    Asistente(std::string nombre, int edad, double salario, std::string supervisor)
        : Empleado(nombre, edad, salario), supervisor(supervisor) {}

    std::string rol() {
        return "Soy un asistente de " + supervisor + ". Mi salario es $" + std::to_string(salario) + ".";
    }

private:
    std::string supervisor;
};

int main() {
    Gerente gerente("Juan", 40, 80000, "Ventas");
    Ingeniero ingeniero("María", 28, 60000, "Ingeniería de Software");
    Asistente asistente("Pedro", 22, 35000, "Gerente de Proyectos");

    std::cout << "Descripción del rol del gerente:" << std::endl;
    std::cout << gerente.rol() << std::endl;

    std::cout << "\nDescripción del rol del ingeniero:" << std::endl;
    std::cout << ingeniero.rol() << std::endl;

    std::cout << "\nDescripción del rol del asistente:" << std::endl;
    std::cout << asistente.rol() << std::endl;

    return 0;
}
