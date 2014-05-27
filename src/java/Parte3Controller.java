
import java.util.ArrayList;
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
@ManagedBean (name="Parte3Controller")
public class Parte3Controller {
    private String palavra;
    private String maiorpalavra;
    private String menorpalavra;
    private ArrayList<String> lista = new ArrayList<String>();
    
    public String inserir(){
        lista.add(palavra);
        palavra=null;
                
        return "";
    }
    
    public String calculastring(){
        maiorpalavra="";
        for (int i = 0; i < lista.size(); i++) {
            palavra = lista.get(i);
            if(palavra.length() > maiorpalavra.length()){
                maiorpalavra = palavra;
            }
        }
        return "";
    }
    public String limpar(){
        palavra=null;
        maiorpalavra=null;
        menorpalavra=null;
        return "";
    }
    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getMaiorpalavra() {
        return maiorpalavra;
    }

    public String getMenorpalavra() {
        return menorpalavra;
    }
    
    
}
