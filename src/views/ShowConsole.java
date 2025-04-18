package views;
import java.util.Scanner;
import models.Persona;
public class ShowConsole {
    Scanner lector = new Scanner(System.in);
    public Persona[] valorPersona(){
        System.out.print("Cuantas personas quieres ingresar: ");
        int numPersonas = lector.nextInt();
        System.out.println("-".repeat(45));
        Persona[] personas = new Persona[numPersonas];
        for(int i = 0; i < numPersonas; i++){
            System.out.print("Ingrese el nombre de la persona " + (i+1) + ": ");
            String nombre = lector.next();
            System.out.print("Ingrese la edad de la persona " + (i+1) + ": ");
            int edad = lector.nextInt();
            personas[i] = new Persona(edad,nombre);
            System.out.println("-".repeat(45));
        }
        /*
        Persona[] personas = new Persona[9];
        personas[0] = new Persona(4,"Pablo");
        personas[1] = new Persona(5,"Maria");
        personas[2] = new Persona(18,"Juan");
        personas[3] = new Persona(60,"David");
        personas[4] = new Persona(25,"Mateo");
        personas[5] = new Persona(12,"Diego");
        personas[6] = new Persona(8,"Ana");
        personas[7] = new Persona(9,"Alicia");
        personas[8] = new Persona(40,"Jaime");*/
        return personas;
    }

    public int getBusqEdad(){
        System.out.print("Ingrese la edad a buscar: ");
        int edad = lector.nextInt();
        return edad;
    }

}

