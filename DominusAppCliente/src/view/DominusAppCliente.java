package view;

import controller.ConexaoController;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class DominusAppCliente {
    public static ConexaoController conexaoController;
    
    public static void main(String[] args) {
        Socket socket;
        ObjectInputStream in;
        ObjectOutputStream out;
        
        try {
            System.out.println("Tentando conectar ao servidor...");
            socket = new Socket("127.0.0.1", 12345);
            System.out.println("Conectado com sucesso.");
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            
            conexaoController = new ConexaoController(out, in);
            
            new FormLogin().setVisible(true);
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
