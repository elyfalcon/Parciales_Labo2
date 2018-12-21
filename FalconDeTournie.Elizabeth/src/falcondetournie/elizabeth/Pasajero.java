/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falcondetournie.elizabeth;

/**
 *
 * @author capacita_mecon
 */
public class Pasajero {
    
    private String _apellido;
    private String _nombre;
    private String _dni;
    private Boolean _esPlus;
    

    public Pasajero() {
    }
    public Pasajero(String apellido, String nombre)
    {
        this();
        this._apellido=apellido;
        this._nombre=nombre;
    }
    
    
    public Pasajero(String apellido, String nombre, String _dni, Boolean _esPlus) {
        
        this(apellido,nombre);
        this._dni = _dni;
        this._esPlus = _esPlus;
    }

    public Boolean getEsPlus() {
        return _esPlus;
    }
    
    
    public Boolean CompararPasajeros(Pasajero pasajero1)
    {
        boolean retorno=false;
        
        if(pasajero1._dni.equalsIgnoreCase(Pasajero.this._dni))
        {
            retorno=true;
        }
        return retorno;
    }

    public String getInfo() {
        StringBuilder show=new StringBuilder();
        show.append("Apellido: ").append(this._apellido);
        show.append("\nNombre: ").append(this._nombre);
        show.append("\nDni: ").append(this._dni);
        show.append("\nEs Plus: ").append(this._esPlus);
        return show.toString();
    }
    public static void MostrarPasajero(Pasajero pasajero1)
    {
        System.out.println( pasajero1.getInfo());
    }
    
    
    
    
    
}
