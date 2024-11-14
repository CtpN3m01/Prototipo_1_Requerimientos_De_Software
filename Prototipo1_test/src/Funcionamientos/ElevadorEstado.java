/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionamientos;



/**
 *
 * @author alema
 */
public class ElevadorEstado {
    private static String pisoActual="1"; // Piso inicial
    public static String getPisoActual() {
        return pisoActual;
    }

    public static void setPisoActual(String piso) {
        pisoActual = piso;
    }
}
