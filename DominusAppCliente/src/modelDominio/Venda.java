package modelDominio;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Venda implements Serializable{
    private static final long serialVersionUID = 123l;

    private int codVenda;
    private Date dataVenda;
    private float valor;
    private ArrayList<ItensVenda> itens;
    private Cliente cliente;

    public Venda(int codVenda, Date dataVenda, float valor, ArrayList<ItensVenda> itens, Cliente cliente) {
        this.codVenda = codVenda;
        this.dataVenda = dataVenda;
        this.valor = valor;
        this.itens = itens;
        this.cliente = cliente;
    }

    public Venda(Date dataVenda, float valor, ArrayList<ItensVenda> itens, Usuario comprador) {
        //PARA INSERTS
        this.dataVenda = dataVenda;
        this.valor = valor;
        this.itens = itens;
        this.cliente = new Cliente(null, comprador.getCodUsuario(), comprador.getNome());
    }

    @Override
    public String toString() {
        return "Venda{" + "codVenda=" + codVenda + ", dataVenda=" + dataVenda + ", valor=" + valor + ", itens=" + itens + ", cliente=" + cliente + '}';
    }

    public int getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public ArrayList<ItensVenda> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItensVenda> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDataVendaString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(this.dataVenda);
    }

    public String getValorString() {
        DecimalFormat dcf = new DecimalFormat("#,##0.00");
        return dcf.format(this.valor);
    }

    public String getItensLiteral() {
        String itens = "";

        for (int i = 0; i < this.itens.size(); i++) {
            if (!itens.equals("")) {
                itens += ", ";
            }
            itens += this.itens.get(i).getProduto().getNome();
        }

        return itens;
    }

}
