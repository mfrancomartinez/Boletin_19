/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_19;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class Boletin_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int opciones = Integer.parseInt(JOptionPane.showInputDialog("Elige:"+"(1)Añadir libro"+"(2)Vender libro"+"(3)Enseñar por titulo"+"(4)Enseñar todos"+"(5)Eliminar sin stock"));                
        switch (opciones) {
            case 1:
                Metodos.engadir();
                break;
            case 2:
                Metodos.vender(null);
                break;
            case 3:
                Metodos.amosarEspecifico(null);
                break;
            case 4:
                Metodos.amosarTodo();
                break;
            case 5:
                Metodos.darDeBaixa();
                break;
            default:
                    System.out.println("Numero invalido");
        }
    }
    }
    

