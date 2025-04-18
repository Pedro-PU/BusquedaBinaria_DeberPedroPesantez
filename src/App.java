import controllers.MetodoBusquedaBinaria;
import models.Persona;
import views.ShowConsole;
public class App {
    public static void main(String[] args) throws Exception {
        ShowConsole pantalla = new ShowConsole();
        Persona[] personas = pantalla.valorPersona();
        MetodoBusquedaBinaria Mb = new MetodoBusquedaBinaria(personas, pantalla);
        Mb.sortByEdad(personas);
        System.out.println(Mb.showPersonByAge());
    }
}
