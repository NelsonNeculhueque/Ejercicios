class Empleado:
    def __init__(self, nombre, edad, salario):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

    def rol(self):
        return f"Soy un empleado de la empresa."

class Gerente(Empleado):
    def __init__(self, nombre, edad, salario, departamento):
        super().__init__(nombre, edad, salario)
        self.departamento = departamento

    def rol(self):
        return f"Soy un gerente del departamento {self.departamento}. Mi salario es ${self.salario}."

class Ingeniero(Empleado):
    def __init__(self, nombre, edad, salario, especialidad):
        super().__init__(nombre, edad, salario)
        self.especialidad = especialidad

    def rol(self):
        return f"Soy un ingeniero especializado en {self.especialidad}. Mi salario es ${self.salario}."

class Asistente(Empleado):
    def __init__(self, nombre, edad, salario, supervisor):
        super().__init__(nombre, edad, salario)
        self.supervisor = supervisor

    def rol(self):
        return f"Soy un asistente de {self.supervisor}. Mi salario es ${self.salario}."

# Ejemplo de uso
gerente = Gerente("Juan", 40, 80000, "Ventas")
ingeniero = Ingeniero("María", 28, 60000, "Ingeniería de Software")
asistente = Asistente("Pedro", 22, 35000, "Gerente de Proyectos")

print("Descripción del rol del gerente:")
print(gerente.rol())

print("\nDescripción del rol del ingeniero:")
print(ingeniero.rol())

print("\nDescripción del rol del asistente:")
print(asistente.rol())