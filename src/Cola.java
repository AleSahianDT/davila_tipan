import java.util.LinkedList;
import java.util.Queue;

public class Cola {

    private Queue<PersonaSahianDavila> personas;

    public Cola() {
        personas = new LinkedList<PersonaSahianDavila>();
    }

    public void encolar(String cedula, String nombre, int edad, String genero) {
        personas.add(new PersonaSahianDavila(cedula, nombre, edad, genero));
    }

    public void desencolar() {
        personas.poll();
    }

    public String listarPorEdad() {
        String mensaje = "";
        for (PersonaSahianDavila c : personas) {
            if (c.getCedula().equals(c.cedula))
                mensaje += c.toString();
            }
        return mensaje;
    }
}
