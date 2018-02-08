/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio.io;

import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;


/**
 *
 * @author egliocz
 */
public class Persona implements Serializable,Comparable,TextSerializable {

    private String nome;
    private String cognome;
    private String indirizzo;
    private String email;
    private String telefono;

    public Persona(String nome, String cognome, String indirizzo, String email, String telefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //TODO 
    @Override
    public int compareTo(Object t) {
        Persona p=(Persona)t;
        return this.getCognome().compareTo(p.getCognome());
    }

    @Override
    public String toString() {
        return nome + " " + cognome + ", " + indirizzo + ", " + email + ", " + telefono;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        return true;
    }

    @Override
    public void write() {
        PrintWriter pw = new PrintWriter(System.out);
           pw.println(this.toString());
    }

    public Persona read() {
        System.out.println("nome cognome indirizzo email telefono");
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" ");
        String tnome= sc.next();
        String tcogn = sc.next();
        String tInd = sc.next();
        String tEmail = sc.next();
        String tTel = sc.next();
        
        Persona x = new Persona(tnome,tcogn,tInd,tEmail,tTel);
        return x;       
        
        }
    
    
    
}
