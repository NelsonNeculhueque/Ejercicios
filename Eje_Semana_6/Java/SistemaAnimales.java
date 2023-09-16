public class SistemaAnimales {

    static class Animal {
        public String nombre; 
        public int edad;

        public Animal(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String sonido() {
            return null; // Dejar este método abstracto en Animal
        }
    }

    static class Perro extends Animal {
        public Perro(String nombre, int edad) {
            super(nombre, edad);
        }

        public String sonido() {
            return nombre + " dice: ¡Guau! ¡Guau! Dejen de jugar Lol";
        }
    }

    static class Gato extends Animal {
        public Gato(String nombre, int edad) {
            super(nombre, edad);
        }

        public String sonido() {
            return nombre + " dice: ¡Miau! ¡Miau! Desinstala el Lol";
        }
    }

    static class Pajaro extends Animal {
        public Pajaro(String nombre, int edad) {
            super(nombre, edad);
        }

        public String sonido() {
            return nombre + " canta: ¡Pío! ¡Pío! Lol es un mal vicio";
        }
    }

    public static void main(String[] args) {
        Perro perro = new Perro("Max", 3);
        Gato gato = new Gato("Whiskers", 2);
        Pajaro pajaro = new Pajaro("Tweety", 1);

        System.out.println(perro.sonido());
        System.out.println(gato.sonido());
        System.out.println(pajaro.sonido());
    }
}
