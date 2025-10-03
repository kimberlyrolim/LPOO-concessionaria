/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author vanessalagomachado
 */
@Entity
@Table(name = "Vendedor")
public class Vendedor extends Pessoa implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    @Column(name = "ven_id")
    private Long id;

    @Column(name = "ven_salario")
    private double salario;
    
    @Column(name = "ven_comissao")
    private double comissao;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String exibirDados(){
        String aux = super.exibirDados()+"\n";
        aux += "Salário" + salario + "\n";
        aux += "Comissão:" + comissao + "\n";
    
        return aux;
    }
    
}
