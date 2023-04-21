import java.util.Objects;

public class soporteTecnico extends PersonaPlantel {
    private String areaEspecializada;

    public soporteTecnico()
    {
        super();
    }

    public soporteTecnico(String nombre, String apellido, String localidad, String areaEspecializada)
    {
        super(nombre, apellido, localidad);
        this.areaEspecializada = areaEspecializada;
    }

    public soporteTecnico (soporteTecnico soporte)
    {
        this.areaEspecializada = soporte.areaEspecializada;
    }

    @Override
    public void concentrar()
    {
        System.out.println("Concentrando soporte tecnico. ");
    }

    @Override
    public void viajar()
    {
        System.out.println("Viajando soporte tecnico. ");
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        soporteTecnico that = (soporteTecnico) o;
        return Objects.equals(areaEspecializada, that.areaEspecializada);
    }

}
