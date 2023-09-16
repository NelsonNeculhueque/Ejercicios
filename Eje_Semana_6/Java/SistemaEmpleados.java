

public class SistemaEmpleados {

    public static class Empleado {
        public String nombre;
        public int edad;
        public double salario;

        public Empleado(String nombre, int edad, double salario) {
            this.nombre = nombre;
            this.edad = edad;
            this.salario = salario;
        }

        public String rol() {
            return "Soy un empleado de la empresa.";
        }
    }

    public static class Gerente extends Empleado {
        private String departamento;

        public Gerente(String nombre, int edad, double salario, String departamento) {
            super(nombre, edad, salario);
            this.departamento = departamento;
        }

        public String rol() {
            return "Soy un gerente del departamento " + departamento + ". Mi salario es $" + salario + ".";
        }
    }

    public static class Ingeniero extends Empleado {
        private String especialidad;

        public Ingeniero(String nombre, int edad, double salario, String especialidad) {
            super(nombre, edad, salario);
            this.especialidad = especialidad;
        }


        public String rol() {
            return "Soy un ingeniero especializado en " + especialidad + ". Mi salario es $" + salario + ".";
        }
    }

    public static class Asistente extends Empleado {
        private String supervisor;

        public Asistente(String nombre, int edad, double salario, String supervisor) {
            super(nombre, edad, salario);
            this.supervisor = supervisor;
        }


        public String rol() {
            return "Soy un asistente de " + supervisor + ". Mi salario es $" + salario + ".";
        }
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Juan", 40, 80000, "Ventas");
        Ingeniero ingeniero = new Ingeniero("María", 28, 60000, "Ingeniería de Software");
        Asistente asistente = new Asistente("Pedro", 22, 35000, "Gerente de Proyectos");

        System.out.println("Descripción del rol del gerente:");
        System.out.println(gerente.rol());

        System.out.println("\nDescripción del rol del ingeniero:");
        System.out.println(ingeniero.rol());

        System.out.println("\nDescripción del rol del asistente:");
        System.out.println(asistente.rol());
    }
}

