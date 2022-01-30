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
public class Main {

    public static void main(String[] args) {

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Boas vindas ao Bootcamp!");
        mentoria1.setDescricao("Boas vindas ao Bootcamp.");
        mentoria1.setData(LocalDate.now());

        Curso curso1 = new Curso();
        curso1.setTitulo("GFT Start #3 Java");
        curso1.setDescricao("O Bootcamp GFT Start #3 Java foi pensado "
                + "exclusivamente para o seu desenvolvimento na tecnologia de "
                + "Java, contendo uma sequência completa de cursos, mentorias "
                + "e desafios. ");
        curso1.setCargaHoraria(57);

        Curso curso2 = new Curso();
        curso2.setTitulo("GFT Start #3 Net");
        curso2.setDescricao("O Bootcamp GFT Start #3 .NET foi pensado "
                + "exclusivamente para o seu desenvolvimento em .NET, contendo "
                + "uma sequência completa de cursos, mentorias e desafios.");
        curso2.setCargaHoraria(58);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp GFT");
        bootcamp.setDescricao("Bootcamp GFT");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Érika");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println(dev1.getNome() + " Conteúdos inscritos" + dev1.getConteudosInscritos());
        dev1.concluirEtapa();
        System.out.println(dev1.getNome() + " Conteúdos concluidos" + dev1.getConteudosConcluidos());
        System.out.println("Xp " + dev1.calcularTotalXp());

        System.out.println("***********************************");
        Dev dev2 = new Dev();
        dev2.setNome("José");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println(dev2.getNome() + " Conteúdos inscritos" + dev2.getConteudosInscritos());
        dev2.concluirEtapa();
        dev2.concluirEtapa();
        System.out.println(dev2.getNome() + " Conteúdos concluidos" + dev2.getConteudosConcluidos());
        System.out.println(dev2.getNome() + " Conteúdos inscritos" + dev2.getConteudosInscritos());
        System.out.println("Xp " + dev2.calcularTotalXp());

    }

}
