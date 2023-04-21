import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Plantel
{
    private ArrayList<Jugador> jugadores;
    private ArrayList<soporteTecnico> soportesTecnicos;
    private Entrenador entrenadorcito;

    public Plantel()
    {
        this.jugadores = new ArrayList<Jugador>();
        this.soportesTecnicos = new ArrayList<soporteTecnico>();
    }
    public Plantel (Entrenador entrenadorcito)
    {
        this.jugadores = new ArrayList<Jugador>();
        this.soportesTecnicos = new ArrayList<soporteTecnico>();
        this.entrenadorcito = entrenadorcito;
    }

    public ArrayList<Jugador> getJugadores()
    {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores)
    {
        this.jugadores = jugadores;
    }

    public ArrayList<soporteTecnico> getSoportesTecnicos()
    {
        return soportesTecnicos;
    }

    public void setSoportesTecnicos(ArrayList<soporteTecnico> soportesTecnicos)
    {
        this.soportesTecnicos = soportesTecnicos;
    }

    public Entrenador getEntrenadorcito()
    {
        return entrenadorcito;
    }

    public void setEntrenadorcito(Entrenador entrenadorcito)
    {
        this.entrenadorcito = entrenadorcito;
    }
    public void agregarPersonasAlPlantel (Scanner scan)
    {
        char controlJugadores = 's';
        char controlSoporteTecnico = 's';

        this.entrenadorcito.setAñosExperiencia(3);
        this.entrenadorcito.setApellido("Gonzalez");
        this.entrenadorcito.setLocalidad("Berazategui");
        this.entrenadorcito.setNombre("Jorge");

        Jugador jugadorcito = null;
        soporteTecnico soporte = null;

        while(controlJugadores == 's')
        {
            System.out.println("Ingrese un jugador...");
            System.out.println("Ingrese el nombre. ");
            String nombre = scan.nextLine();
            System.out.println("Ingrese el apellido. ");
            String apellido = scan.nextLine();
            System.out.println("Ingrese la localidad. ");
            String localidad = scan.nextLine();
            System.out.println("Ingrese su posicion. ");
            String posicion = scan.nextLine();
            System.out.println("Ingrese su nickname. ");
            String nickname = scan.nextLine();
            System.out.println("Ingrese su cantidad de victorias. ");
            int cantVictorias = scan.nextInt();

            jugadorcito = new Jugador(nombre,apellido,localidad,posicion,nickname,cantVictorias);
            this.jugadores.add(jugadorcito);

            System.out.println("Desea agregar mas jugadores? s/n. ");
            controlJugadores = scan.next().charAt(0);
        }

        while(controlSoporteTecnico == 's')
        {
            System.out.println("Ingrese un soporte tecnico...");

            System.out.println("Ingrese el nombre. ");
            String nombre = scan.nextLine();
            System.out.println("Ingrese el apellido. ");
            String apellido = scan.nextLine();
            System.out.println("Ingrese la localidad. ");
            String localidad = scan.nextLine();
            System.out.println("Ingrese el area especializada de el soporte tecnico. ");
            String areaEspecializada = scan.nextLine();
            ////xd
            soporte = new soporteTecnico(nombre,apellido,localidad,areaEspecializada);
            this.soportesTecnicos.add(soporte);

            System.out.println("Desea agregar mas jugadores? s/n. ");
            controlSoporteTecnico = scan.next().charAt(0);
        }
    }

}
