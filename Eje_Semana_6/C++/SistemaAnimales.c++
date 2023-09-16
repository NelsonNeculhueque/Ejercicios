#include <iostream>
#include <string>

class Animal {
public:
    Animal(std::string nombre, int edad) : nombre(nombre), edad(edad) {}

    virtual std::string sonido() {
        return "";
    }

protected:
    std::string nombre;
    int edad;
};

class Perro : public Animal {
public:
    Perro(std::string nombre, int edad) : Animal(nombre, edad) {}

    std::string sonido() override {
        return nombre + " dice: ¡Guau! ¡Guau! Dejen de jugar Lol";
    }
};

class Gato : public Animal {
public:
    Gato(std::string nombre, int edad) : Animal(nombre, edad) {}

    std::string sonido() override {
        return nombre + " dice: ¡Miau! ¡Miau! Desinstala el Lol";
    }
};

class Pajaro : public Animal {
public:
    Pajaro(std::string nombre, int edad) : Animal(nombre, edad) {}

    std::string sonido() override {
        return nombre + " canta: ¡Pío! ¡Pío! Lol es un mal vicio";
    }
};

int main() {
    Perro perro("Max", 3);
    Gato gato("Whiskers", 2);
    Pajaro pajaro("Tweety", 1);

    std::cout << perro.sonido() << std::endl;
    std::cout << gato.sonido() << std::endl;
    std::cout << pajaro.sonido() << std::endl;

    return 0;
}
