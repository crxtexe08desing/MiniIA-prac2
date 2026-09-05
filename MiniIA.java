import java.util.Scanner;

public class MiniIA {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("         MINI-IA EN JAVA        ");
        System.out.println("================================");

        System.out.println("Sistema iniciado correctamente.");
        int  continuar ;
        String nombre;
        int edad;
        int horasEstudio;
        double asistencia;
        double notaPromedio;
        int tareasCompletadas;
        int riesgo = 0;
        int horasSueno; 
        int nivel;
        int comportamiento;

        Scanner sc = new Scanner(System.in);

    do {  
            
        System.out.println("---------------------------------------------");
        System.out.println("          REGISTRO DEL ESTUDIANTE            ");
        System.out.println("---------------------------------------------");

        System.out.println("Ingresa tu nombre:");
        nombre = sc.nextLine();

        System.out.println("Ingresa tu edad:");
        edad = sc.nextInt();

        System.out.println("\n--- Datos del estudiante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        System.out.println("Horas de estudio por semana: ");
        horasEstudio = sc.nextInt();

        System.out.println("Porcentaje de asistencia: ");
        asistencia = sc.nextDouble();

        System.out.println("Nota promedio: ");
        notaPromedio = sc.nextDouble();
        while (notaPromedio < 0 || notaPromedio > 100) {
 
        System.out.println("Nota Promedio inválida.");
 
        System.out.print("Ingresa nuevamente la notaPromedio: ");
        notaPromedio = sc.nextDouble();
        }

        System.out.println("Tareas completadas: ");
        tareasCompletadas = sc.nextInt();

        System.out.println("Ingresa tus horas de sueño promedio por noche: ");
        horasSueno = sc.nextInt();

        System.out.println("---------------------------------------------");
        System.out.println("          ANALIZANDO DATOS                   ");
        System.out.println("---------------------------------------------");

        System.out.println("Selecciona tu nivel:  ") ;
        System.out.println("1. Principiante:  "); 
        System.out.println("2. Intermedio:  "); 
        System.out.println("3. Avanzado:  ");
        nivel = sc.nextInt();

        System.out.println("¿Cómo quieres que se comporte la Mini-IA?");
        System.out.println("1. Formal:  "); 
        System.out.println("2. Motivadora:  "); 
        System.out.println("3. Divertida:  ");
        comportamiento = sc.nextInt();  

        System.out.println("Datos registrados correctamente.");
 
        switch (nivel) {
 
            case 1:
                System.out.println("Nivel: PRINCIPIANTE");
                break;
            case 2:
                System.out.println("Nivel: INTERMEDIO");
                break;
            case 3:
                System.out.println("Nivel: AVANZADO");
                break;
            default:
                System.out.println("Opción inválida");
        }

        switch (comportamiento) {
            case 1:
                System.out.println("Comportamiento: FORMAL");
                break;
            case 2:
                System.out.println("Comportamiento: MOTIVADORA");
                break;
            case 3:
                System.out.println("Comportamiento: DIVERTIDA");
                break;
            default:
                System.out.println("Opción inválida");
        }

        for (int progreso = 10; progreso <= 100; progreso += 10) {
 
            System.out.println("Analizando... " + progreso + "%");
        }
 
        for (int progreso = 10; progreso <= 100; progreso += 10) {
            System.out.println("[" + "##".repeat(progreso / 10) + " ".repeat(10 - progreso / 10) + "] " + progreso + "%");
        }

        System.out.println("Análisis completado.");
 
        System.out.println("---------------------------------------------");
        System.out.println("                RESULTADO                    ");
        System.out.println("---------------------------------------------");
        System.out.println("Estudiante: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Horas de estudio por semana: " + horasEstudio);
        System.out.println("Asistencia: " + asistencia);
        System.out.println("Nota promedio: " + notaPromedio);
        System.out.println("Tareas completadas: " + tareasCompletadas);
        System.out.println("Horas de sueño: " + horasSueno);

        if (horasEstudio < 5) {
            riesgo = riesgo + 2;
        } 
        if (asistencia < 70) {
            riesgo = riesgo + 3;
        } 
        if (notaPromedio < 60) {
            riesgo = riesgo + 3;
        }
        if (tareasCompletadas < 5) {
            riesgo = riesgo + 2;
        }
        if (horasSueno < 6) {
            riesgo = riesgo + 1;
        }

        System.out.println("Risk Score: " + riesgo);

        if (riesgo <= 2) { 
            System.out.println("Predicción: RIESGO BAJO");
        } else if (riesgo <= 5) {
            System.out.println("Predicción: RIESGO MEDIO");
        } else {
            System.out.println("Predicción: RIESGO ALTO");
        }

        System.out.println("============================================="); 
        System.out.println();
        System.out.println("¿Quieres analizar otro estudiante?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        continuar = sc.nextInt();
 
        } while (continuar == 1);

        sc.close();
    }
}