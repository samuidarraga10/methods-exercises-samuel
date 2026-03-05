public class Libro {

    private String titulo;
    private String autor;
    private int paginas;

    // Constructor vacío
    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Anónimo";
        this.paginas = 0;
    }

    // Constructor con título y autor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = 0;
    }

    // Constructor completo
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarDetalles() {
        System.out.println("Libro: " + titulo +
                " | Autor: " + autor +
                " | Páginas: " + paginas);
    }
}

public class CuentaBancaria {

    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;

        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    // Getter titular
    public String getTitular() {
        return titular;
    }

    // Setter titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // SOLO getter saldo
    public double getSaldo() {
        return saldo;
    }

    // Depositar
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("La cantidad debe ser mayor que 0");
        }
    }

    // Retirar
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida");
        }
    }
}

public class Estudiante {

    private String nombre;
    private int edad;
    private double promedio;

    // Constructor vacío
    public Estudiante() {
        this.nombre = "";
        this.edad = 0;
        this.promedio = 0.0;
    }

    // Constructor completo
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        setEdad(edad); // usamos el setter para validar
        this.promedio = promedio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            this.edad = 0;
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // Método haAprobado
    public boolean haAprobado() {
        return promedio >= 3.0;
    }

    // Mostrar info
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);

        if (haAprobado()) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }
}
