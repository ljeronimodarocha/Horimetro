/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Lucas
 */
@Entity
public class Operacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "idEquipamento", nullable = false)
    private Equipamento equipamento;
    @Column(nullable = false)
    private Double abastecimento;
    @Column(nullable = false)
    private Double horasTrabalhadas;
    @Column(nullable = false)
    private Double media;
    @Column(nullable = false)
    private Double gastoTotal;
    @Column(nullable = false)
    private Double valorCombustivel;
    private boolean parada;
    private String motivo;
    @Column(nullable = false)
    private Date data;

    public Operacao() {

    }

    public Operacao(Equipamento equipamento, Double abastecimento, Double horasTrabalhadas, Double media, Double gastoTotal, Double valorCombustivel, boolean parada, String motivo, Date data) {
        this.id = id;
        this.equipamento = equipamento;
        this.abastecimento = abastecimento;
        this.horasTrabalhadas = horasTrabalhadas;
        this.media = media;
        this.gastoTotal = gastoTotal;
        this.valorCombustivel = valorCombustivel;
        this.parada = parada;
        this.motivo = motivo;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Double getAbastecimento() {
        return abastecimento;
    }

    public void setAbastecimento(Double abastecimento) {
        this.abastecimento = abastecimento;
    }

    public Double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Double getGastoTotal() {
        return gastoTotal;
    }

    public void setGastoTotal(Double gastoTotal) {
        this.gastoTotal = gastoTotal;
    }

    public Double getValorCombustivel() {
        return valorCombustivel;
    }

    public void setValorCombustivel(Double valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }

    public boolean getParada() {
        return parada;
    }

    public void setParada(boolean parada) {
        this.parada = parada;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
