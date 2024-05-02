public class PersonaSahianDavila {
    public String cedula;
    public String nombre;
    public int edad;
    public String genero;

    public PersonaSahianDavila() {
        cedula = "1725490674";
        nombre = "Sahian";
        edad = 19;
        genero = "Femenino";
    }

    public PersonaSahianDavila(String cedula, String nombre, int edad, String genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

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
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "-----Sahian Davila-----" +
                "Cedula='" + cedula +
                "Nombre='" + nombre +
                "Edad=" + edad +
                "Genero='" + genero;
    }
}
