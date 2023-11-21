/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GritonClientSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author lopez
 */
public class GritonClient {
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    
    public void connect() throws IOException{
        socket = new Socket("localhost", 3366);
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }
    
    public void talk() throws IOException{
        out.write("holis\n");
        out.flush();
        String message;
        do {
            message = JOptionPane.showInputDialog("Ingrese el mensaje: ");
            out.write(message + "\n");
            String messageProcessed = in.readLine();
            System.out.println(">>" + messageProcessed);
            out.flush();
        } while(!message.equalsIgnoreCase("chao"));
    }
    
    public void close() throws IOException{
        socket.close();
        out.close();
        in.close();
    }
}
