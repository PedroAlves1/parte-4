
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
@ManagedBean (name="parte1Controller")
public class parte1Controller {
    private List<Integer> lista = new ArrayList<Integer>();
    private Integer numero;
    private Integer resultado;
    
    public String inserir(){
        lista.add(numero);
        numero=null;
        return "";
    }
    
    public String soma(){
        resultado=0;
            for (int i = 0; i < lista.size(); i++) {
            resultado += lista.get(i);
        }

        return "";
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getResultado() {
        return resultado;
    }
    
}
