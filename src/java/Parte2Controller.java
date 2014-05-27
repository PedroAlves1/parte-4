
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro
 */
@SessionScoped
@ManagedBean (name="Parte2Controller")
public class Parte2Controller {
    private Integer numero;
    private List<Integer> lista = new ArrayList<Integer>();
    private Integer media;
    //--
    
    public String inserir(){
        lista.add(numero);
        numero=null;
        return "";
    }
    public String calculaMedia(){
        media=0;
        for (int i = 0; i < lista.size(); i++) {
            media += lista.get(i);
            
        }
        media /= lista.size();
        return "";
    }
    
    public String limpar(){
                 media=null;
                 numero=null;
                 lista.clear();
                 return "";
        }

    
    
    // -- 
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
        public Integer getMedia() {
        return media;
    }


}
