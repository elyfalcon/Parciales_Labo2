/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falcondetournie.elizabeth;

import java.util.ArrayList;

/**
 *
 * @author capacita_mecon
 */
public class Vuelo {
    
    private String  _fecha;
    private String _empresa;
    private float _precio;
    private ArrayList<Pasajero> _listaDePasajeros;
    private int _cantMaxima;

    
     public Vuelo()
    {
        this._listaDePasajeros=new ArrayList<>();
        this._cantMaxima=5;
    }
        
    public Vuelo(String _fecha, float _precio) {
        this();
        this._fecha = _fecha;
        this._precio = _precio;
    }
    
    public Vuelo(String _fecha, String _empresa, float _precio) {
        this(_fecha,_precio);
        this._empresa = _empresa;
    }
  

    public int getCantMaxima() {
        return _cantMaxima;
    }
    
    public String getInfoVuelo(){
    StringBuilder show=new StringBuilder();
    show.append("Fecha: ").append(this._fecha);
    show.append("\nEmpresa: ").append(this._empresa);
    show.append("\nPrecio: ").append(this._precio);
    show.append("\nCantidad Maxima: ").append(this._cantMaxima);
        for (Pasajero item : _listaDePasajeros) {
            show.append(item.getInfo());
        }
     return show.toString();
    }
    public Boolean AgregarPasajero(Pasajero p) //ver si la hago boolean
    {
       
       boolean seagrego=false;
       if(this._listaDePasajeros.size()< this.getCantMaxima())
       {
           boolean existe=false;
           for (Pasajero pas : this._listaDePasajeros) {
            if(pas.CompararPasajeros(p))
            {
                existe=true;   
                break;
            }
           }
           if(!existe)
            {
                this._listaDePasajeros.add(p);
                seagrego=true;
            }
           
       
    }
         return seagrego;
    }
    
    
    public void MostrarVuelo()
    {
        System.out.println(this.getInfoVuelo());
    
    }
    public float DescuentoPlus()
    {
        float descuento=0;
        return descuento=(this._precio * (float) 0.20);
    }
    
    public static float ValorarVuelo(Vuelo v){ //150 -(150 * 1.20)
     float cantidad=0;
    
     
        for (Pasajero item : v._listaDePasajeros) {
          if(item.getEsPlus())
          {
            cantidad+= (v._precio-(v.DescuentoPlus()));
             
          }
          else
          {
           cantidad+=v._precio;
          
          }
        }
        return cantidad;
    }
    
    public static float CalcularGastoPasajero(ArrayList<Vuelo> _ListaDeVuelos,Pasajero p)
    {
     float abona=0;
     float desc=0;
     float paga;
     
        for (Vuelo lista : _ListaDeVuelos) {
            if(lista._listaDePasajeros.contains(p))
            {
             if(p.getEsPlus())
             {
              abona+= lista._precio-lista.DescuentoPlus();
             }
             else
             {
             abona+= lista._precio;
             }
            }
            
        }
    
        return abona;
    }
    
}
