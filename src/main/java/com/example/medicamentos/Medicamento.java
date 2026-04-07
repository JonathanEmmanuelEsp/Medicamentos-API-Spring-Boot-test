package com.example.medicamentos;
import java.util.List;

public class Medicamento {
    // Atributos 
    private String nombre;

    private List<String> comercial;

    private List<String> via;

    private String dosis;

    private List<String> indicaciones;

    private List<String> contraindicaciones;

    private List<String> efectosAdversos;

    private List<String> cuidadosEnfermeria;


    // Constructor 
    
    public Medicamento(String nombre, List<String> comercial, List<String> via, String dosis,List<String> indicaciones, List<String> contraindicaciones, List<String> efectosAdversos,List<String> cuidadosEnfermeria) {
        this.nombre = nombre;
        this.comercial = comercial;
        this.via = via;
        this.dosis = dosis;
        this.indicaciones = indicaciones;
        this.contraindicaciones = contraindicaciones;
        this.efectosAdversos = efectosAdversos;
        this.cuidadosEnfermeria = cuidadosEnfermeria;
    }







    // Getters y Setters

    
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public List<String> getComercial() {
        return comercial;
    }


    public void setComercial(List<String> comercial) {
        this.comercial = comercial;
    }


    public List<String> getVia() {
        return via;
    }


    public void setVia(List<String> via) {
        this.via = via;
    }


    public String getDosis() {
        return dosis;
    }


    public void setDosis(String dosis) {
        this.dosis = dosis;
    }


    public List<String> getIndicaciones() {
        return indicaciones;
    }


    public void setIndicaciones(List<String> indicaciones) {
        this.indicaciones = indicaciones;
    }


    public List<String> getContraindicaciones() {
        return contraindicaciones;
    }


    public void setContraindicaciones(List<String> contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }


    public List<String> getEfectosAdversos() {
        return efectosAdversos;
    }


    public void setEfectosAdversos(List<String> efectosAdversos) {
        this.efectosAdversos = efectosAdversos;
    }


    public List<String> getCuidadosEnfermeria() {
        return cuidadosEnfermeria;
    }


    public void setCuidadosEnfermeria(List<String> cuidadosEnfermeria) {
        this.cuidadosEnfermeria = cuidadosEnfermeria;
    }

    



}
