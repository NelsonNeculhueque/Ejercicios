class Reserva:
    def __init__(self, nombre_del_pasajero, numero_de_vuelo, fecha):
        self.nombre_del_pasajero = nombre_del_pasajero
        self.numero_de_vuelo = numero_de_vuelo
        self.fecha = fecha

    def mostrar_detalle(self):
        return f"Reserva para {self.nombre_del_pasajero}\nNúmero de vuelo: {self.numero_de_vuelo}\nFecha: {self.fecha}"

class ReservaEconomica(Reserva):
    def __init__(self, nombre_del_pasajero, numero_de_vuelo, fecha, asiento):
        super().__init__(nombre_del_pasajero, numero_de_vuelo, fecha)
        self.asiento = asiento

    def mostrar_detalle(self):
        padre = super().mostrar_detalle()
        return f"{padre}\nClase: Económica\nAsiento: {self.asiento}"

class ReservaBusiness(Reserva):
    def __init__(self, nombre_del_pasajero, numero_de_vuelo, fecha, asiento, vip):
        super().__init__(nombre_del_pasajero, numero_de_vuelo, fecha)
        self.asiento = asiento
        self.vip = vip

    def mostrar_detalle(self):
        padre = super().mostrar_detalle()
        return f"{padre}\nClase: Business\nAsiento: {self.asiento}\nAcceso a sala VIP: {self.vip}"

class ReservaPrimeraClase(Reserva):
    def __init__(self, nombre_del_pasajero, numero_de_vuelo, fecha, asiento, primeraclase):
        super().__init__(nombre_del_pasajero, numero_de_vuelo, fecha)
        self.asiento = asiento
        self.primeraclase = primeraclase

    def mostrar_detalle(self):
        padre = super().mostrar_detalle()
        return f"{padre}\nClase: Primera Clase\nAsiento: {self.asiento}\nServicio de Champagne: {self.primeraclase}"

reserva_economica = ReservaEconomica("Juan Pérez", "AA123", "2023-09-20", "Economica 23A")
reserva_business = ReservaBusiness("María García", "BA456", "2023-09-20", "vip 5B", "Sí")
reserva_primera_clase = ReservaPrimeraClase("Pedro Rodríguez", "CX789", "2023-09-20", "Primera Clase 1A", "Sí")

print("Detalle de la reserva económica:")
print(reserva_economica.mostrar_detalle())

print("\nDetalle de la reserva de business:")
print(reserva_business.mostrar_detalle())

print("\nDetalle de la reserva de primera clase:")
print(reserva_primera_clase.mostrar_detalle())
