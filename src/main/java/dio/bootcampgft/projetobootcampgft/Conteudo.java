/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dio.bootcampgft.projetobootcampgft;

/**
 *
 * @author ErikaBorsos
 */
public abstract class Conteudo {

    private String titulo;
    private String descricao;
    protected static final double XP_PADRAO = 10d;    //static -> acessar fora da classe mãe

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //abstract -> as classes filhas deverão implementar esse método
    public abstract double calcularXp();
}
