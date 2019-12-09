/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador.compraevenda.java;

import Interface.Menu;


/**
 *
 * @author CONDUCTOR\saulo.terceiro
 */
public class Fachada {
    

    
       public void login(String login, String senha){
                Controller controller = new Controller();
		Usuario usuario = new Usuario();
		String novoUsuario = "";
		usuario.setLogin(novoUsuario);
		String senhaUsuario = "";
		usuario.setSenha(senhaUsuario);
                if(usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)){
                    Menu menu = new Menu(controller);
                    menu.setVisible(true);
                }
        }
    
}



