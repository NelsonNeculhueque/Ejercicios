class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def sonido(self):
        pass

class Perro(Animal):
    def sonido(self):
        return f"{self.nombre} dice: ¡Guau! ¡Guau! Dejen de jugar Lol"

class Gato(Animal):
    def sonido(self):
        return f"{self.nombre} dice: ¡Miau! ¡Miau! Desintala el Lol"

class Pajaro(Animal):
    def sonido(self):
        return f"{self.nombre} canta: ¡Pío! ¡Pío! Lol es un mal vicio"


perro = Perro("Max", 3)
gato = Gato("Whiskers", 2)
pajaro = Pajaro("Tweety", 1)

print(perro.sonido())
print(gato.sonido())
print(pajaro.sonido())