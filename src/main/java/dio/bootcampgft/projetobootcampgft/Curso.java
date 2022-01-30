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
public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * this.cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nCurso{" + "\ntitulo=" + super.getTitulo()
                + ", \ndescricao=" + super.getDescricao()
                + ", \ncargaHoraria=" + this.cargaHoraria + '}';
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

}
