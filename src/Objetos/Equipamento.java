/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Lucas
 */
@Entity
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer frota;
    private String equipamento;
    private String marca;
    private String modelo;
    private String ano;
    private double horimetro;
    private String observacao;

    public Equipamento() {
    }

    public Equipamento(Integer frota, String equipamento, String marca, String modelo, String ano, double horimetro, String observacao) {

        this.frota = frota;
        this.equipamento = equipamento;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.horimetro = horimetro;
        this.observacao = observacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFrota() {
        return frota;
    }

    public void setFrota(Integer frota) {
        this.frota = frota;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public double getHorimetro() {
        return horimetro;
    }

    public void setHorimetro(Float horimetro) {
        this.horimetro = horimetro;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
