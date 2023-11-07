package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelDominio.Departamento;
import modelDominio.Marca;
import modelDominio.Produto;
import modelDominio.Usuario;
import modelDominio.Venda;
import modelDominio.Vendedor;

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
            String msg = (String)in.readObject();
            
            Vendedor vendedor = new Vendedor(this.usuario.getCodUsuario());
            out.writeObject(vendedor);
            
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
    
    //------------CADASTRO DE USUARIO----------//
    
    public boolean vendedorInserir(Vendedor vendedor) {
        boolean resultado;
        
        try {
            out.writeObject("VendedorInserir");
            String msg = (String)in.readObject();
            out.writeObject(vendedor);
            resultado = (boolean) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            resultado = false;
        }
        return resultado;
    }
    
    //----------------PRODUTO-------------------//
    
    public ArrayList<Produto> listaProdutos(){
        ArrayList<Produto> listaProdutos;
        
        try {
            out.writeObject("ListaProdutos");
            String msg = (String)in.readObject();
            
            Vendedor vendedor = new Vendedor(this.usuario.getCodUsuario());
            out.writeObject(vendedor);
            
            listaProdutos = (ArrayList<Produto>) in.readObject();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            listaProdutos = null;
        } catch (ClassNotFoundException cne) {
            cne.printStackTrace();
            listaProdutos = null;
        }
        return listaProdutos;
    }
    
    public boolean produtoInserir(Produto produto) {
        boolean resultado;
            
        try {
            out.writeObject("ProdutoInserir");
            String msg = (String)in.readObject();
            out.writeObject(produto);
            resultado = (boolean)in.readObject();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            resultado = false;
        } catch (ClassNotFoundException cne) {
            cne.printStackTrace();
            resultado = false;
        }
        return resultado;
    }
    
    //------------MARCA---------------//
    
    public ArrayList<Marca> listaMarcas() {
        ArrayList<Marca> listaMarcas;
        
        try {
            out.writeObject("ListaMarcas");
            listaMarcas = (ArrayList<Marca>) in.readObject();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            listaMarcas = null;
        } catch(ClassNotFoundException cne) {
            cne.printStackTrace();
            listaMarcas = null;
        }
        return listaMarcas;
    }
    
    //---------------DEPARTAMENTO-------------//
    
    public ArrayList<Departamento> listaDepartamentos() {
        ArrayList<Departamento> listaDepartamentos;
        
        try {
            out.writeObject("ListaDepartamentos");
            listaDepartamentos = (ArrayList<Departamento>) in.readObject();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            listaDepartamentos = null;
        } catch (ClassNotFoundException cne) {
            cne.printStackTrace();
            listaDepartamentos = null;
        }
        return listaDepartamentos;
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
