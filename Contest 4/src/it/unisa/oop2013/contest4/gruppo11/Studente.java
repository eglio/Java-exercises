package it.unisa.oop2013.contest4.gruppo11;

import java.io.Serializable;

/**
 *
 * @author gruppo11
 */
public class Studente implements Serializable {
	private String nome;
	private String cognome;
	private String nazionalita;
	
	/**
     *Creates a new object Studente
     * @param nome  name of the object
     * @param cognome  surname of the object
     * @param nazionalita  nationality of the object
     */
    public Studente(String nome, String cognome, String nazionalita) {
		this.nome = nome;
		this.cognome = cognome;
		this.nazionalita = nazionalita;
	}
	
	/**
     *Returns the name of the object
     * @return name
     */
    public String getNome() {
		return nome;
	}
	
	/**
     *Sets the name of the object
     * @param nome name
     */
    public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
     *Returns the surname of the object
     * @return surname
     */
    public String getCognome() {
		return cognome;
	}
	
	/**
     *Sets the surname of the object
     * @param cognome surname
     */
    public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	/**
     *Returns the nationality of the object
     * @return nationality
     */
    public String getNazionalita() {
		return nazionalita;
	}
	
	/**
     *Sets the nationality of the object
     * @param nazionalita  nationality
     */
    public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}
}
