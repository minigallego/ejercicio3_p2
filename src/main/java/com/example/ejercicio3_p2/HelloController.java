package com.example.ejercicio3_p2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import loteria.Loteria;

import java.util.ArrayList;

public class HelloController {


    public Label L1;
    public MenuButton MENUBT;
    public Label L2;
    public Button btcalcular;
    public TextField combinacion;
    public Label lcomb;
    public Label lcomp;
    public Label lreint;
    public TextField complementario;
    public TextField reintegro;
    public Button anterior;
    public Button siguiente;
    public ComboBox Combobox;

    public void initialize(){
        Combobox.getItems().addAll(1,2,3,4,5,6);
        Combobox.getSelectionModel().selectFirst();
    }
    Loteria loteria= new Loteria();
    ArrayList<Loteria> combinaciones =new ArrayList<>();

    int posicion=0;
    public void oncalcular(ActionEvent actionEvent) {
        int numero=(int)(Combobox.getSelectionModel().getSelectedItem());
        for (int i = 0; i < numero; i++) {
            int c=(int) (Math.random()*50);
            int r=(int) (Math.random()*10);
            String a=loteria.GenerarCombinacion();
            combinaciones.add(new Loteria(a,c,r));
        }
        combinacion.setText(combinaciones.get(0).getCombi());
        complementario.setText(combinaciones.get(0).getComp()+"");
        reintegro.setText(combinaciones.get(0).getReintegro()+"");
        posicion=0;
    }

    public void onanterior(ActionEvent actionEvent) {
        if (posicion==0){
            posicion=combinaciones.size()-1;
            combinacion.setText(combinaciones.get(combinaciones.size()-1).getCombi());
            complementario.setText(combinaciones.get(combinaciones.size()-1).getComp()+"");
            reintegro.setText(combinaciones.get(combinaciones.size()-1).getReintegro()+"");
        }else {
            posicion=posicion-1;
            combinacion.setText(combinaciones.get(posicion).getCombi());
            complementario.setText(combinaciones.get(posicion).getComp()+"");
            reintegro.setText(combinaciones.get(posicion).getReintegro()+"");
        }
    }

    public void onsiguiente(ActionEvent actionEvent) {
        if (posicion==combinaciones.size()-1){
            posicion=0;
            combinacion.setText(combinaciones.get(posicion).getCombi());
            complementario.setText(combinaciones.get(posicion).getComp()+"");
            reintegro.setText(combinaciones.get(posicion).getReintegro()+"");
        }else {
            posicion=posicion+1;
            combinacion.setText(combinaciones.get(posicion).getCombi());
            complementario.setText(combinaciones.get(posicion).getComp()+"");
            reintegro.setText(combinaciones.get(posicion).getReintegro()+"");
        }
    }


}