import com.dio.desafio.dominio.Bootcamp;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Dev;
import com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de programação em Java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Curso de programação em Javascript");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDaynara = new Dev();
        devDaynara.setNome("Daynara");
        devDaynara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Daynara: "
                + devDaynara.getConteudosInscritos());
        devDaynara.progredir();
        System.out.println("----");
        System.out.println("Conteúdos inscritos Daynara: "
                + devDaynara.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Daynara: "
                + devDaynara.getConteudosConcluidos());
        System.out.println("XP: " + devDaynara.calcularTotalXp());

        System.out.println("-----------------------------");

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Carlos: "
                + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        System.out.println("-----");
        System.out.println("Conteúdos inscritos Carlos: "
                + devCarlos.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Carlos: "
                + devCarlos.getConteudosConcluidos());
        System.out.println("XP: " + devCarlos.calcularTotalXp());
    }
}
