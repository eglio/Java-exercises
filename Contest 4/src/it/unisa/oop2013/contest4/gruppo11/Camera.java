package it.unisa.oop2013.contest4.gruppo11;

import java.io.Serializable;

/**
 *
 * @author gruppo11
 */
public class Camera implements Serializable, Comparable {
	private int numero;
	private int piano;
	
	/**
     * Creates a new object Camera
     * @param numero  the number of the chambre
     * @param piano  the floor of the chambre
     */
    public Camera(int numero, int piano) {
		this.numero = numero;
		this.piano = piano;
	}
	
	/**
     *Gets the number of the object Camera
     * @return int - number
     */
    public int getNumero() {
		return numero;
	}
	
	/**
     *Sets the number of Camera
     * @param numero
     */
    public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
     *Gets the floor of Camera
     * @return piano
     */
    public int getPiano() {
		return piano;
	}

	/**
     *Sets the floor of Camera
     * @param piano
     */
    public void setPiano(int piano) {
		this.piano = piano;
	}
	
	/**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Camera other = (Camera) obj;
        if (this.numero != other.getNumero()) {
        	return false;
        }
        return true;
    }

	/**
     *
     * @param o
     * @return
     */
    @Override
	public int compareTo(Object o) {
		Camera c = (Camera) o;
		return this.numero - c.getNumero();
    }
}
