
package Modelo;

//Modelo

//Cambio1

public class Televisor extends Electrodomestico {

    protected double pulgadas;
     tipoTelevisor tipo;
    
    public enum tipoTelevisor{PLASMA,LED,LCD,OLED,};

    public Televisor() {
        super();
    }

    @Override
    public void setPrecio(double precioBase) {
     this.precio=precioBase;
     //Cambio1
    }

    @Override
    public String imprimirProducto() {
        String res = super.imprimirProducto() + "tipo de TV: " + this.tipo + "con " + this.pulgadas + " pulgadas";
        return res;

    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public tipoTelevisor getTipo() {
        return tipo;
    }

    public void setTipo(tipoTelevisor tipo) {
        this.tipo = tipo;
    }

   

}
