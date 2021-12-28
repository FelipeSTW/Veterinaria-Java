
package controlador;

import db.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Mascota;


public class ControladorMascota 
{
    //METODO PARA ALMACENAR MASCOTAS
    public boolean agregarMascota (Mascota mascota)
    {
        //USAR try PARA VER ERRORES EN LA EJECUCION
        //RETURN TRUE --> ALMACENO CORRECTAMENTE
        //RETURN FALSE --> ERROR AL ALMACENAR
        try
        {
           Conexion conexion = new Conexion();
           Connection conn = conexion.getConnection("medipet");
           
           Statement stmt = conn.createStatement();
           
           String consulta = "INSERT INTO MASCOTA VALUES ("
                   +"NULL, "
                   +"'"+mascota.getNombreMascota()+"', "
                   +""+mascota.getEdad()+", "
                   +"'"+mascota.getTipoMascota()+"', "
                   +""+mascota.isAtenPrevias()+", "
                   +""+mascota.getCantAtenPrevias()+", "
                   +""+mascota.isCheckDuenho()+", "
                   +"'"+mascota.getNombreDuenho()+"', "
                   +"'"+mascota.getDescripcion()
                   + "');";
           
           
           // System.out.println("CONSULTA: "+consulta);
            
            stmt.executeUpdate(consulta);
           
            System.out.println("MASCOTA GUARDADA");
            
            return true;
        }
        catch(Exception e)
        {
            System.out.println("ERROT: "+e.getMessage());
            e.printStackTrace();;//--> MUESTRA DONDE ESTA EL ERROR
            return false;
        }
        
    }
    
    //METODO PARA LISTAR
    
    public ArrayList<Mascota> ListarMascotas()
    {
        ArrayList<Mascota> listaMascotas = new ArrayList<>();
        
        try
        {
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConnection("medipet");
            
            Statement stmt = conn.createStatement();
            
            String consulta = "SELECT id_mascota, nombre_mascota, edad, tipo_mascota, check_duenho   FROM MASCOTA;";
            
            
            ResultSet rs = stmt.executeQuery(consulta);
            
            while(rs.next())
            {
                
                
                Mascota mascota = new Mascota();
                
                mascota.setIdMascota(rs.getInt("id_mascota"));
                mascota.setNombreMascota(rs.getString("nombre_mascota"));
                mascota.setEdad(rs.getInt("edad"));
                mascota.setTipoMascota(rs.getString("tipo_mascota"));
                mascota.setCheckDuenho(rs.getBoolean("check_duenho"));
                
                listaMascotas.add(mascota);
                
                
            }
               
            return listaMascotas;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
    
    public ArrayList<Mascota> mascotaBuscarNombre(String nombre)
    {
        ArrayList<Mascota> listaMascota = new ArrayList<>();
        
        try
        {
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConnection("medipet");
            
            Statement stmt = conn.createStatement();
            
            String consulta = "";
            
            if(nombre.equals(""))
            {
                consulta = "SELECT * FROM MASCOTA;";
            }
            else
            {
                consulta = "SELECT * FROM MASCOTA WHERE nombre_mascota LIKE '%" + nombre + "%';";
            }
                                    
            //stmt.executeUpdate --> SOLO PARA INSERT, UPDATE Y DELETE
            //stmt.executeQuery --> SOLO PARA SELECT
            ResultSet rs = stmt.executeQuery(consulta);
            
            while(rs.next())
            {
                Mascota mascota = new Mascota();
                
                mascota.setIdMascota(rs.getInt("id_mascota"));
                mascota.setNombreMascota(rs.getString("nombre_mascota"));
                mascota.setEdad(rs.getInt("edad"));
                mascota.setTipoMascota(rs.getString("tipo_mascota"));
                mascota.setCheckDuenho(rs.getBoolean("check_duenho"));
                
                listaMascota.add(mascota);
            }
            
            return listaMascota;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }            
    }
    
    
    public ArrayList<Mascota> mascotaBuscarTipo(String tipo)
    {
        ArrayList<Mascota> listaMascota = new ArrayList<>();
        
        try
        {
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConnection("medipet");
            
            Statement stmt = conn.createStatement();
            
            String consulta = "";
            
            if(tipo.equals(""))
            {
                consulta = "SELECT * FROM MASCOTA;";
            }
            else
            {
                consulta = "SELECT * FROM MASCOTA WHERE tipo_mascota LIKE '%" + tipo + "%';";
            }
                                    
            //stmt.executeUpdate --> SOLO PARA INSERT, UPDATE Y DELETE
            //stmt.executeQuery --> SOLO PARA SELECT
            ResultSet rs = stmt.executeQuery(consulta);
            
            while(rs.next())
            {
                Mascota mascota = new Mascota();
                
                mascota.setIdMascota(rs.getInt("id_mascota"));
                mascota.setNombreMascota(rs.getString("nombre_mascota"));
                mascota.setEdad(rs.getInt("edad"));
                mascota.setTipoMascota(rs.getString("tipo_mascota"));
                mascota.setCheckDuenho(rs.getBoolean("check_duenho"));
                
                listaMascota.add(mascota);
            }
            
            return listaMascota;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }            
    }
    
    public void mascotaEliminar(int id)
    {
        try
        {
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConnection("medipet");
            Statement stmt = conn.createStatement();
            
            String consulta = "DELETE FROM mascota WHERE id_mascota = '" + id + "';";
            
            stmt.executeUpdate(consulta);
            
            
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            
        }
    }
    
    
    
    public boolean modificarMascota(Mascota mascota, String id)
    {
        //USAR try PARA VER ERRORES EN LA EJECUCION
        //RETURN TRUE --> ALMACENO CORRECTAMENTE
        //RETURN FALSE --> ERROR AL ALMACENAR
        try
        {
           Conexion conexion = new Conexion();
           Connection conn = conexion.getConnection("medipet");
           
           Statement stmt = conn.createStatement();
           
           String consulta = "UPDATE MASCOTA "
                   + "SET nombre_mascota = '" + mascota.getNombreMascota() + "', "
                   + "edad = " + mascota.getEdad() + ", "
                   + "tipo_mascota = '" + mascota.getTipoMascota() + "', "
                   + "check_aten_previas = " + mascota.isAtenPrevias() + ", "
                   + "cant_aten_previas = " + mascota.getCantAtenPrevias() + ", "
                   + "check_duenho = " + mascota.isCheckDuenho() + ", "
                   + "nombre_duenho = '" + mascota.getNombreDuenho() + "', "
                   + "descripcion = '" + mascota.getDescripcion() + "' "
                   + "WHERE id_mascota = " + id + " ;";
           
           
           // System.out.println("CONSULTA: "+consulta);
            
            stmt.executeUpdate(consulta);
           
            System.out.println("MASCOTA MASCOTA MODIFICADA");
            
            return true;
        }
        catch(Exception e)
        {
            System.out.println("ERROT: "+e.getMessage());
            e.printStackTrace();;//--> MUESTRA DONDE ESTA EL ERROR
            return false;
        }
        
    }

    
}
