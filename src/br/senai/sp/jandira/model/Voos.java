package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Voos {

    String nomeCompanhia;
    int codigoCompanhia;
    int numeroVoo;
    String origem;
    String destino;
    LocalDate dataPartida;
    LocalTime horaPartida;
    int capacidadePassageiros;

    public Voos(int numeroVoo, String origem, String destino, LocalDate dataPartida, LocalTime horaPartida, int capacidadePassageiros) {
        this.nomeCompanhia = nomeCompanhia;
        this.codigoCompanhia = codigoCompanhia;
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.dataPartida = dataPartida;
        this.horaPartida = horaPartida;
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public String getNomeCompanhia() {
        return nomeCompanhia;
    }

    public void setNomeCompanhia(String nomeCompanhia) {
        this.nomeCompanhia = nomeCompanhia;
    }

    public int getCodigoCompanhia() {
        return codigoCompanhia;
    }

    public void setCodigoCompanhia(int codigoCompanhia) {
        this.codigoCompanhia = codigoCompanhia;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }

    public LocalTime getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(LocalTime horaPartida) {
        this.horaPartida = horaPartida;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }
}
