    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_Negocio;
import Pantalla.JDPantalla;
import javax.swing.JOptionPane;


/**
 *
 * @author elbet
 */
public class NegocioP {

    private int codigo;
    private int Existencia;
    private String Nombre;
    private int PrecioV;
    private int PrecioC;
    private String Preveedor;
    private String clasificacion;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getExistencia() {
        return Existencia;
    }

    public void setExistencia(int Existencia) {
        this.Existencia = Existencia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPrecioV() {
        return PrecioV;
    }

    public void setPrecioV(int PrecioV) {
        this.PrecioV = PrecioV;
    }

    public int getPrecioC() {
        return PrecioC;
    }

    public void setPrecioC(int PrecioC) {
        this.PrecioC = PrecioC;
    }

    public String getPreveedor() {
        return Preveedor;
    }

    public void setPreveedor(String Preveedor) {
        this.Preveedor = Preveedor;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    public static void venta(){
    int PrecioC, cos, cos2;
    PrecioC=Integer.parseInt(JDPantalla.jTcosto.getText());
    
        cos=(int) (PrecioC*0.15);
        cos2=cos+PrecioC;
        JDPantalla.jTventa.setText(cos2+"");
    }
    public static void exist(){
        int existencia;
        existencia =Integer.parseInt(JDPantalla.jTexistencia.getText());
        if(existencia>0){
        }else{
        }
    }
    
}
