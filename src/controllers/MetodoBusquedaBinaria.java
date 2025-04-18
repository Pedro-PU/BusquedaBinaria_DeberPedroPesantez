package controllers;
import models.Persona;
import views.ShowConsole;

public class MetodoBusquedaBinaria {
    private Persona[] people;
    private ShowConsole pantalla;

    public MetodoBusquedaBinaria(Persona[] personas){
        this.people = personas;
    }

    public MetodoBusquedaBinaria(Persona[] personas, ShowConsole pantalla){
        this.people = personas;
        this.pantalla = pantalla;
    }

    public void sortByEdad(Persona[] people){
        for (int i=0; i< people.length-1; i++){
            for(int j = 0; j < people.length - 1 -i; j++){
                if(people[j].getEdad() > people[j+1].getEdad()){
                    //Intercambiar
                    Persona temp = people[j];
                    people[j] = people[j+1];
                    people[j+1]=temp;
                }
            }
        }
        System.out.println("Personas ordenadas por edad:");
        for (int i = 0; i < people.length; i++) {
            System.out.print(people[i].getEdad());
            if (i < people.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();
    }

    public int findPersonByEdad(int edad){
        int bajo = 0;
        int alto = people.length - 1;
    
        while (bajo <= alto) {
            int medio = (bajo + alto) / 2;
    
            // Mostrar sublista actual
            for (int i = bajo; i <= alto; i++) {
                System.out.print(people[i].getEdad());
                if (i < alto) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
    
            int valorCentro = people[medio].getEdad();
            System.out.print("bajo=" + bajo);
            System.out.print(" alto=" + alto);
            System.out.print(" centro=" + medio);
            System.out.print(" valorCentro=" + valorCentro + " --> ");
    
            if (edad == valorCentro) {
                System.out.println("ENCONTRADO");
                return medio;
            }
            if (edad > valorCentro) {
                System.out.println("DERECHA");
                bajo = medio + 1;
            } else {
                System.out.println("IZQUIERDA");
                alto = medio - 1;
            }
        }
    
        return -1;
    }
    

    public String showPersonByAge(){
        int edadBuscada = pantalla.getBusqEdad();
        int indexPerson = findPersonByEdad(edadBuscada);
        if(indexPerson == -1){
            return "No se encontró la persona con esa edad";
        }else{
            return "La persona con la edad "+edadBuscada+" es: " + people[indexPerson].getNombre();
        }
    }
}
