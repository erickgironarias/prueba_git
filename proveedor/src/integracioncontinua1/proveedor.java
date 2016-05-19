
package integracioncontinua1;


public class proveedor {
    
    int Id_prove;
    String  Nombre_prov;
    String cedula_prov;

    public proveedor(int Id_prove, String Nombre_prov, String cedula_prov) {
        this.Id_prove = Id_prove;
        this.Nombre_prov = Nombre_prov;
        this.cedula_prov = cedula_prov;
    }

    public int getId_prove() {
        return Id_prove;
    }

    public void setId_prove(int Id_prove) {
        this.Id_prove = Id_prove;
    }

    public String getNombre_prov() {
        return Nombre_prov;
    }

    public void setNombre_prov(String Nombre_prov) {
        this.Nombre_prov = Nombre_prov;
    }

    public String getCedula_prov() {
        return cedula_prov;
    }

    public void setCedula_prov(String cedula_prov) {
        this.cedula_prov = cedula_prov;
    }
    
    
}
