class Productos:
    def __init__(self, nombre, precio, categoria):
        self.nombre = nombre
        self.precio = precio
        self.categoria = categoria

    def mostrar_detalle(self):
        return f"Nombre: {self.nombre}\nPrecio: {self.precio}\nCategoría: {self.categoria}"

class Electronico(Productos):
    def __init__(self, nombre, precio, categoria, marca, modelo):
        super().__init__(nombre, precio, categoria)
        self.marca = marca
        self.modelo = modelo

    def mostrar_detalle(self):
        padre = super().mostrar_detalle()
        return f"{padre}\nMarca: {self.marca}\nModelo: {self.modelo}"

class Alimenticio(Productos):
    def __init__(self, nombre, precio, categoria, fecha_vencimiento):
        super().__init__(nombre, precio, categoria)
        self.fecha_vencimiento = fecha_vencimiento

    def mostrar_detalle(self):
        padre = super().mostrar_detalle()
        return f"{padre}\nFecha de Vencimiento: {self.fecha_vencimiento}"

class Vestimenta(Productos):
    def __init__(self, nombre, precio, categoria, talla, color):
        super().__init__(nombre, precio, categoria)
        self.talla = talla
        self.color = color

    def mostrar_detalle(self):
        padre = super().mostrar_detalle()
        return f"{padre}\nTalla: {self.talla}\nColor: {self.color}"


electronico = Electronico("Laptop", 1000, "Electrónico", "Dell", "XPS 15")
alimenticio = Alimenticio("Leche", 2.5, "Alimenticio", "2023-10-15")
vestimenta = Vestimenta("Camiseta", 15, "Vestimenta", "M", "Azul")


print("Detalles del producto electrónico:")
print(electronico.mostrar_detalle())

print("\nDetalles del producto alimenticio:")
print(alimenticio.mostrar_detalle())

print("\nDetalles del producto de vestimenta:")
print(vestimenta.mostrar_detalle())
