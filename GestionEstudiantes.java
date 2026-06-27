/**
 * Clase principal del sistema de Gestión de Estudiantes.
 *
 * Demuestra:
 *  - Instanciación de objetos a partir de la clase Estudiante
 *  - Llamada a métodos y constructores
 *  - Uso de arreglo de objetos
 */
public class GestionEstudiantes {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("   SISTEMA DE GESTIÓN DE ESTUDIANTES");
        System.out.println("===========================================\n");

        // ── 1. Instanciación de objetos ────────────────────────────────────────
        Estudiante e1 = new Estudiante("Ana Garcia",    20, "Ingenieria en Sistemas", 8.5);
        Estudiante e2 = new Estudiante("Luis Martinez", 22, "Contaduria Publica",     5.8);
        Estudiante e3 = new Estudiante("Maria Lopez",   19, "Diseno Grafico",         9.2);

        // ── 2. Mostrar información inicial ─────────────────────────────────────
        System.out.println("-- Informacion inicial de los estudiantes --\n");
        e1.mostrarInformacion();
        e2.mostrarInformacion();
        e3.mostrarInformacion();

        // ── 3. Uso de métodos ──────────────────────────────────────────────────
        System.out.println("\n-- Aplicando cambios --\n");

        // Cambio de carrera
        e2.cambiarCarrera("Administracion de Empresas");

        // Actualización de promedios
        e1.actualizarPromedio(9.0);
        e2.actualizarPromedio(7.5);

        // Promedio inválido (prueba de validación)
        e3.actualizarPromedio(11.0);

        // ── 4. Estado de aprobación ────────────────────────────────────────────
        System.out.println("\n-- Estado de aprobacion --\n");
        Estudiante[] estudiantes = { e1, e2, e3 };

        for (Estudiante est : estudiantes) {
            String estado = est.estaAprobado() ? "APROBADO" : "REPROBADO";
            System.out.printf("%-18s | Promedio: %.1f | %s%n",
                    est.getNombre(), est.getPromedio(), estado);
        }

        System.out.println("\n===========================================");
        System.out.println("          FIN DEL PROGRAMA");
        System.out.println("===========================================");
    }
}