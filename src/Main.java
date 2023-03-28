import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila: " + dev1.getConteudosInscritos());
        System.out.println("-");
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos Inscritos Camila: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Camila: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("\n------\n");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João: " + dev2.getConteudosInscritos());
        System.out.println("-");
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos Inscritos João: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluídos João: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());


    }
}
