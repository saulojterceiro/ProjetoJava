/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import simulador.compraevenda.java.Controller;

/**
 *
 * @author CONDUCTOR\saulo.terceiro
 */
public class ControllerJFrame extends javax.swing.JFrame{
    Controller controller;
    
    public ControllerJFrame(Controller controller) {
        super();
        this.controller = controller;
    }
    
    public void inicializarCena(ControllerJFrame iniciar,ControllerJFrame desligar){
        iniciar.setVisible(true);
        desligar.dispose();
    }
}
