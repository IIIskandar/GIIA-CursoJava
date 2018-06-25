
package libreta;

/**
 *
 * @author C-Lug
 */
public class RegistroLibreta {
    
    public String nombre;
    public String direccion;
    public String numero;
    public String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public RegistroLibreta(){
        setNombre("");
        setDireccion("");
        setNumero("");
        setEmail("");
    }
    
    public RegistroLibreta(String nombre, String direccion, String numero, String email){
        setNombre(nombre);
        setDireccion(direccion);
        setNumero(numero);
        setEmail(email);
    }
}
