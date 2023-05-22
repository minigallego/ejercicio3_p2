package loteria;

import javafx.scene.control.ComboBox;

import java.util.ArrayList;
import java.util.HashSet;

public class Loteria {
    String combi;
    int comp;
    int reintegro;

    public Loteria() {
    }

    public Loteria(String combi, int comp, int reintegro) {
        this.combi = combi;
        this.comp = comp;
        this.reintegro = reintegro;
    }

    public String getCombi() {
        return combi;
    }

    public void setCombi(String combi) {
        this.combi = combi;
    }

    public int getComp() {
        return comp;
    }

    public void setComp(int comp) {
        this.comp = comp;
    }

    public int getReintegro() {
        return reintegro;
    }

    public void setReintegro(int reintegro) {
        this.reintegro = reintegro;
    }

    public String GenerarCombinacion(){
        ArrayList<Integer> hs=new ArrayList<>();
        while (hs.size()!=6){
            int numeroAleatorio = (int) (Math.random()*50);
            hs.add(numeroAleatorio);
        }
        String result="";
        for (int i = 0; i < hs.size(); i++) {
            result=result+hs.get(i);
        }

        return result;
    }
}
//