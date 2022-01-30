/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dio.bootcampgft.projetobootcampgft;

import java.time.LocalDate;

/**
 *
 * @author ErikaBorsos
 */
public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "\nMentoria{" + "\ntitulo = " + super.getTitulo()
                + ", \ndescricao = " + super.getDescricao()
                + ", \ndata = " + data + '}';
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

}
