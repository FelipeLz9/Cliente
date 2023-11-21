/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gritonclient;

import GritonClientSocket.GritonClient;
import java.io.IOException;

/**
 *
 * @author lopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GritonClient client = new GritonClient();
        
        try {
            client.connect();
            client.talk();
            client.close();
        } catch (IOException ex) {
            System.out.println("Error, hablando con el servidor.");
        }
        
    }
    
}
