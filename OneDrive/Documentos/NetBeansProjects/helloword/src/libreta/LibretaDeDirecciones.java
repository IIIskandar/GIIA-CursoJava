/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreta;

import java.util.List;

/**
 *
 * @author C-Lug
 */
public class LibretaDeDirecciones {
    public List<RegistroLibreta> registros;
    public RegistroLibreta libreta;
    
    public void anadirEntrada(RegistroLibreta libreta){
        registros.add(libreta);
    }
    
    public void eliminarEntrada(RegistroLibreta libreta){
        registros.remove(libreta);
    }
    
    public void verLibretas(){
        System.out.println(libreta.nombre + " " );
    }
   
}
