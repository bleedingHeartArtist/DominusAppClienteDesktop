package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelDominio.Usuario;
import modelDominio.Venda;

public class ConexaoController {
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private Usuario usuario; 

    public ConexaoController(ObjectOutputStream out, ObjectInputStream in) {
        this.out = out;
        this.in = in;
    }
    
    //---------VENDA---------//
   
    public ArrayList<Venda> listaVendas() {
        ArrayList<Venda> listaVendas;
        
        try {
            out.writeObject("ListaVendas");
            listaVendas = (ArrayList<Venda>)in.readObject();  
        } catch (IOException ioe) {
            ioe.printStackTrace();
            listaVendas = null;
        } catch (ClassNotFoundException cne) {
            cne.printStackTrace();
            listaVendas = null;
        }
        return listaVendas;
    }
    
    //---------LOGIN---------//
    
    public Usuario efetuarLogin(Usuario usuario) {
        Usuario usuarioLogado;
        
        try {
            out.writeObject("UsuarioEfetuarLogin");
            String msg = (String)in.readObject();
            out.writeObject(usuario);
            usuarioLogado = (Usuario)in.readObject();    
        } catch (IOException ioe) {
            ioe.printStackTrace();
            usuarioLogado = null;
        } catch (ClassNotFoundException cne) {
            cne.printStackTrace();
            usuarioLogado = null;
        }
        return usuarioLogado;
    }
    
    public void fim() {
        try {
            out.writeObject("fim");
            in.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
