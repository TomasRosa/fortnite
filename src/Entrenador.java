
public class Entrenador extends PersonaPlantel implements participaPartida
{
    private int añosExperiencia;

    public Entrenador()
    {
        super();
    }
    public Entrenador (int añosExperiencia, String nombre, String apellido, String localidad)
    {
        super(nombre,apellido,localidad);
        this.añosExperiencia = añosExperiencia;
    }
    public Entrenador (Entrenador entrenador)
    {
        super();
        this.añosExperiencia = entrenador.añosExperiencia;
    }

    public int getAñosExperiencia()
    {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia)
    {
        this.añosExperiencia = añosExperiencia;
    }

    private void indicaciones ()
    {
        System.out.println("PRENDAN EL MONITOR PERROSSSSSSSSSSSSSS");
    }

    @Override
    public void participaPartida()
    {
        System.out.println("Entrenador participando de la partida...");
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "añosExperiencia=" + añosExperiencia +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entrenador that = (Entrenador) o;
        return añosExperiencia == that.añosExperiencia;
    }

    @Override
    public void concentrar()
    {

    }

    @Override
    public void viajar()
    {

    }

}
