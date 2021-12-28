package modelo;

/**
 *
 * @author Kubo
 */
public class Mascota 
{
    private int idMascota;
    private String nombreMascota;
    private int edad;
    private String tipoMascota;
    private boolean atenPrevias;
    private int cantAtenPrevias;
    private boolean checkDuenho;
    private String nombreDuenho;
    private String descripcion;
    
    public Mascota() 
    {
        this.idMascota = 0;
        this.nombreMascota = "";
        this.edad = 0;
        this.tipoMascota = "";
        this.atenPrevias = false;
        this.cantAtenPrevias = 0;
        this.checkDuenho = false;
        this.nombreDuenho = "";
        this.descripcion = "";
    }

    public Mascota(int idMascota, String nombreMascota, int edad, 
            String tipoMascota, boolean atenPrevias, int cantAtenPrevias, 
            boolean checkDuenho, String nombreDuenho, String descripcion) 
    {
        this.idMascota = idMascota;
        this.nombreMascota = nombreMascota;
        this.edad = edad;
        this.tipoMascota = tipoMascota;
        this.atenPrevias = atenPrevias;
        this.cantAtenPrevias = cantAtenPrevias;
        this.checkDuenho = checkDuenho;
        this.nombreDuenho = nombreDuenho;
        this.descripcion = descripcion;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public boolean isAtenPrevias() {
        return atenPrevias;
    }

    public void setAtenPrevias(boolean atenPrevias) {
        this.atenPrevias = atenPrevias;
    }

    public int getCantAtenPrevias() {
        return cantAtenPrevias;
    }

    public void setCantAtenPrevias(int cantAtenPrevias) {
        this.cantAtenPrevias = cantAtenPrevias;
    }

    public boolean isCheckDuenho() {
        return checkDuenho;
    }

    public void setCheckDuenho(boolean checkDuenho) {
        this.checkDuenho = checkDuenho;
    }

    public String getNombreDuenho() {
        return nombreDuenho;
    }

    public void setNombreDuenho(String nombreDuenho) {
        this.nombreDuenho = nombreDuenho;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
    
}
