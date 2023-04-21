import java.util.Objects;

public abstract class PersonaPlantel
{
    private String nombre;
    private String apellido;
    private String localidad;

    public PersonaPlantel ()
    {

    }
    public PersonaPlantel(PersonaPlantel personaPlantel)
    {
        this.nombre = personaPlantel.nombre;
        this.apellido = personaPlantel.apellido;
        this.localidad = personaPlantel.localidad;
    }
    public PersonaPlantel (String nombre, String apellido, String localidad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.localidad = localidad;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getLocalidad()
    {
        return localidad;
    }

    public void setLocalidad(String localidad)
    {
        this.localidad = localidad;
    }

    @Override
    public String toString()
    {
        return "PersonaPlantel{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaPlantel that = (PersonaPlantel) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido) && Objects.equals(localidad, that.localidad);
    }

    public abstract void concentrar();
    public abstract void viajar();
}
