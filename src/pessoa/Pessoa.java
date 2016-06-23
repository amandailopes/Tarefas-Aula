/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Amanda
 */
public class Pessoa {

    private String nome;
    private String sobrenome;
    private GregorianCalendar dataNascimento;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    private Pessoa(String amanda, String lopes, int i, int i0, int i1) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = new GregorianCalendar(i, i0, i1);
    }

    private Pessoa(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public GregorianCalendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(GregorianCalendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String nomeCompleto() {
        return (this.nome + this.sobrenome);

    }

    private boolean compareTo(Pessoa P) {
        int y = this.dataNascimento.compareTo(P.getDataNascimento());
        if (y < 0) {
            return false;
        } else {
            return true;
        }

    }

    public boolean maisNovo(Pessoa P) {
        return !compareTo(P);
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Amanda", "Lopes", 1995, 1, 10);
        Pessoa p1 = new Pessoa("Amanda", "Lopes");
        System.out.println(p1.nomeCompleto());
        Pessoa c = new Pessoa("Kennedy", "Lopes", 1986, 8, 26);
        boolean k = c.maisNovo(p);
        System.out.println(k);
        
        
       
    }

}
