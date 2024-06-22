import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       /* double promedio;
        String condicionFinal;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el promedio general del alumno ");
        promedio = entrada.nextDouble();
        condicionFinal = promedio >=6 ? "Aprovado" : "Reprovado";
        System.out.println("la condicion final del alumno es:" + condicionFinal);
*/

        // vectores
        //Declaracion

     /*   int vecto[] = new int[4];

        //Adignacion por teclado
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < vecto.length; i++) {
            System.out.println("Ingrese el valor del indice" + i);
            vecto[i] = in.nextInt();
        }

        //Recorrido
        for (int i = 0; i < vecto.length; i++) {
            System.out.println("Estoy en el indice:" + i);
            System.out.println("Tengo que guardar un:" + vecto[i]);
            System.out.println("-------------------------");
        }*/

    //Matriz
/*
        //declaracion
        int matriz[][] = new int[3][3];

        //asginacion manual
       /* matriz[0][0] = 5;
        matriz[0][1] = 13;
        matriz[0][2] = 15;
        matriz[1][0] = 7;
        matriz[1][1] = 9;
        matriz[1][2] = 10;
        matriz[2][0] = 8;
        matriz[2][1] = 12;
        matriz[2][2] = 24;

        //asignacion por el usuario
        Scanner entrada = new Scanner(System.in);
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el valor de la posicion f:" + f + "c" + c);
                matriz[f][c] = entrada.nextInt();
            }
        }

        //recorrido
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
            System.out.println(" el valor de la posicion f:" + f + "c" + c);
            System.out.println("Es de:" + matriz[f][c]);
            }
        }*/


        //poo

        alumno alumno1 = new alumno();
        alumno alumno2 = new alumno(5, "luisiana", "de paula");

        System.out.println("El id del alumno 2 es: " + alumno2.getId());  // el get sirve para mostrar datos
        System.out.println("El nombre es: " + alumno2.getNombre());
        System.out.println("El apellido es: " + alumno2.getApellido());

        alumno1.setId(8);
        alumno1.setNombre("hola");
        alumno1.setApellido("adios");

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("El id del alumno 1 es: " + alumno1.getId());
        System.out.println("El nombre es: " + alumno1.getNombre());
        System.out.println("El apellido es: " + alumno1.getApellido());

        // cambio de valor
        alumno2.setId(35);

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("El id del alumno 2 es: " + alumno2.getId());  // el get sirve para mostrar datos
        System.out.println("El nombre es: " + alumno2.getNombre());
        System.out.println("El apellido es: " + alumno2.getApellido());


    }
}