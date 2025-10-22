/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author vanessalagomachado
 */
@Entity
@Table(name = "vendas")
public class Venda implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "venda_id")
    private int id;
    
    @Column(name = "venda_data_hora", nullable = false)
    private LocalDateTime dataVenda;
    
    @Column(name = "venda_valor", columnDefinition = "numeric(12,2)")
    private double valorVenda;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "venda_forma_contrato")
    private FormaContrato formaContrato;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "venda_forma_pgto")
    private FormaPgto formaPgto;
    
    @ManyToOne
    @JoinColumn(name = "venda_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "venda_vendedor")
    private Vendedor vendedor;

    @ManyToOne
    @JoinColumn(name = "venda_veiculo")
    private Veiculo veiculo;
    
    public String exibirDados(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String aux = "Detalhes da Venda: \n\n";
        aux += "ID da Venda: " + id + "\n";
        aux += "Data da Venda: " + (dataVenda != null ? dataVenda.format(formatter) : "N/A") + "\n";
        aux += "Valor: R$ " + String.format(java.util.Locale.US, "%.2f", valorVenda) + "\n\n";
        
        aux += "--- Cliente ---\n";
        aux += (cliente != null ? cliente.getNome() : "N/A") + "\n\n";
        
        aux += "--- Vendedor ---\n";
        aux += (vendedor != null ? vendedor.getNome() : "N/A") + "\n\n";
        
        aux += "--- Veículo ---\n";
        aux += (veiculo != null ? veiculo.getPlaca() + " - " + veiculo.getModelo() : "N/A") + "\n\n";
        
        aux += "Forma de Contrato: " + formaContrato + "\n";
        aux += "Forma de Pagamento: " + formaPgto + "\n";
    
        return aux;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public FormaContrato getFormaContrato() {
        return formaContrato;
    }

    public void setFormaContrato(FormaContrato formaContrato) {
        this.formaContrato = formaContrato;
    }

    public FormaPgto getFormaPgto() {
        return formaPgto;
    }

    public void setFormaPgto(FormaPgto formaPgto) {
        this.formaPgto = formaPgto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        if (dataVenda != null) {
            return dataVenda.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
        }
        return "Nova Venda";
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venda other = (Venda) obj;
        return this.id == other.id;
    }
}
