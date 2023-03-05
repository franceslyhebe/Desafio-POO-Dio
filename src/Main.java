import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setCurso("Java", "Curso completo Java", 120);

        Curso cursoReact = new Curso();
        cursoReact.setCurso("React", "Curso completo React", 85);

        Mentoria mentoria = new Mentoria();
        mentoria.setMentoria("Mentoria de Java", "Se prepare para o mercado de trabalho!", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setBootcamp("Java Developer", "Bootcamp para se especializar em Java");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(mentoria);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setBootcamp("React Developer", "Bootcamp para se especializar em React");
        bootcamp2.getConteudos().add(cursoReact);
        bootcamp2.getConteudos().add(mentoria);

        Dev developer = new Dev();
        developer.setNome("Francesly");
        developer.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + developer.getConteudoInscritos());
        developer.progredir();
        System.out.println("Conteudos Concluídos" + developer.getConteudosConcluidos());



        Dev developer2 = new Dev();
        developer2.setNome("Camila");
        developer2 .inscreverBootcamp(bootcamp2);
        System.out.println("Conteudos Inscritos" + developer2.getConteudoInscritos());
        System.out.println("Conteudos Concluídos" + developer2.getConteudosConcluidos());



    }

}
