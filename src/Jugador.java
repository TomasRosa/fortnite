import java.util.Objects;

public class Jugador extends PersonaPlantel implements  participaPartida
{
    private String posicion;
    private String nickname;
    private int cantVictorias;

    public Jugador ()
    {
        super();
    }

    public Jugador(PersonaPlantel personaPlantel, Jugador player)
    {
        super(personaPlantel);
        this.posicion = player.posicion;
        this.nickname = player.nickname;
        this.cantVictorias = player.cantVictorias;
    }

    public Jugador(String nombre, String apellido, String localidad, String posicion, String nickname, int cantVictorias)
    {
        super(nombre, apellido, localidad);
        this.posicion = posicion;
        this.nickname = nickname;
        this.cantVictorias = cantVictorias;
    }

    public String getPosicion()
    {
        return posicion;
    }

    public void setPosicion(String posicion)
    {
        this.posicion = posicion;
    }

    public String getNickname()
    {
        return nickname;
    }

    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    public int getCantVictorias()
    {
        return cantVictorias;
    }

    public void setCantVictorias(int cantVictorias)
    {
        this.cantVictorias = cantVictorias;
    }

    @Override
    public void concentrar()
    {
        System.out.println("Concentando jugadores...");
    }

    @Override
    public void viajar()
    {
        System.out.println("Viajando jugadores...");

    }

    @Override
    public void participaPartida()
    {
        System.out.println("Jugador participando de la partida...");
    }

    @Override
    public String toString()
    {
        return
                super.toString() + "Jugador{" +
                "posicion='" + posicion + '\'' +
                ", nickname='" + nickname + '\'' +
                ", cantVictorias=" + cantVictorias +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(nickname, jugador.nickname);
    }

}
