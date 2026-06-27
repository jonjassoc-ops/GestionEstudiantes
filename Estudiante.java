/**
 * Clase que representa a un Estudiante dentro del sistema de gestión.
 * Aplica los conceptos de: atributos, constructor, métodos y encapsulamiento.
 */
public class Estudiante {

    // ── Atributos ──────────────────────────────────────────────────────────────
    private final String nombre;   // Nombre completo del estudiante (inmutable)
    private final int    edad;     // Edad del estudiante (inmutable)
    private       String carrera;  // Carrera actual (puede cambiar)
    private       double promedio; // Promedio académico (0.0 – 10.0)

    // ── Constructor ────────────────────────────────────────────────────────────
    /**
     * Crea un nuevo Estudiante con todos sus datos iniciales.
     *
     * @param nombre   Nombre completo
     * @param edad     Edad en años
     * @param carrera  Carrera que cursa
     * @param promedio Promedio inicial (0.0 – 10.0)
     */
    public Estudiante(String nombre, int edad, String carrera, double promedio) {
        this.nombre   = nombre;
        this.edad     = edad;
        this.carrera  = carrera;
        this.promedio = promedio;
    }

    // ── Getters ────────────────────────────────────────────────────────────────
    public String getNombre()   { return nombre;   }
    public int    getEdad()     { return edad;     }
    public String getCarrera()  { return carrera;  }
    public double getPromedio() { return promedio; }

    // ── Métodos de negocio ─────────────────────────────────────────────────────
    /**
     * Muestra en consola la información completa del estudiante.
     */
    public void mostrarInformacion() {
        System.out.println("┌─────────────────────────────┐");
        System.out.println("│     DATOS DEL ESTUDIANTE    │");
        System.out.println("├─────────────────────────────┤");
        System.out.printf( "│ Nombre  : %-19s│%n", nombre);
        System.out.printf( "│ Edad    : %-19d│%n", edad);
        System.out.printf( "│ Carrera : %-19s│%n", carrera);
        System.out.printf( "│ Promedio: %-19.1f│%n", promedio);
        System.out.println("└─────────────────────────────┘");
    }

    /**
     * Cambia la carrera del estudiante.
     *
     * @param nuevaCarrera Nueva carrera a asignar
     */
    public void cambiarCarrera(String nuevaCarrera) {
        System.out.printf("Carrera actualizada: %s → %s%n", this.carrera, nuevaCarrera);
        this.carrera = nuevaCarrera;
    }

    /**
     * Actualiza el promedio del estudiante validando el rango permitido.
     *
     * @param nuevoPromedio Valor entre 0.0 y 10.0
     */
    public void actualizarPromedio(double nuevoPromedio) {
        if (nuevoPromedio < 0.0 || nuevoPromedio > 10.0) {
            System.out.println("Error: el promedio debe estar entre 0.0 y 10.0");
            return;
        }
        this.promedio = nuevoPromedio;
        System.out.printf("Promedio de %s actualizado a: %.1f%n", nombre, promedio);
    }

    /**
     * Indica si el estudiante está aprobado (promedio >= 6.0).
     *
     * @return true si aprobado, false si reprobado
     */
    public boolean estaAprobado() {
        return promedio >= 6.0;
    }
}