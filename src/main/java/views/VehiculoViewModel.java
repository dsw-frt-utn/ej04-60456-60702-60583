package views;

import domain.*;

public class VehiculoViewModel {
    private String patente;
    private Marca marca;
    private String tipo;
    private String sucursal;
    private double capacidadCarga;
    private double kmPorLitro;
    private int anio;
    private double litrosExtra;
    private double kmARecorrer;
    
    public VehiculoViewModel(Vehiculo vehiculo){
        if(vehiculo == null)return;
        patente = vehiculo.getPatente();
        this.marca = vehiculo.getMarca();
        tipo = vehiculo.getTipo().name();
        sucursal = vehiculo.getCodigoSucursal();
        capacidadCarga = vehiculo.getCapacidadCarga();
        anio = vehiculo.getAnio();
        kmPorLitro = vehiculo instanceof VehiculoCombustible ? ((VehiculoCombustible)vehiculo).getKilometrosPorLitro() : 0;
        litrosExtra = vehiculo instanceof VehiculoCombustible ? ((VehiculoCombustible)vehiculo).getLitrosExtra() : 0;
        kmARecorrer = 100;
    }

    public String getPatente() {
        return patente;
    }

    public Marca getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public double getKmPorLitro() {
        return kmPorLitro;
    }

    public int getAnio() {
        return anio;
    }

    public double getLitrosExtra() {
        return litrosExtra;
    }

    public double getKmARecorrer() {
        return kmARecorrer;
    }

    public String getSucursal() {
        return sucursal;
    }
}
