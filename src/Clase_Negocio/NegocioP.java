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
            JOptionPane.showMessageDialog(null, "La Cantidad no puede ser menor a 0");
            JDPantalla.jTexistencia.requestFocus();
        }
    }
    public static void clasif(){
        int PrecioV;
        PrecioV=Integer.parseInt(JDPantalla.jTventa.getText());
        if(PrecioV>=0 && PrecioV<=100){
            JDPantalla.jTclasif.setText("Clase D");
        }else if(PrecioV>=101 && PrecioV<=300){
            JDPantalla.jTclasif.setText("Clase C1");
        }else if(PrecioV>=301 && PrecioV<=700){
            JDPantalla.jTclasif.setText("Clase B1");
        }else if(PrecioV>=701){
            JDPantalla.jTclasif.setText("Clase A1");
    }}
    
}
