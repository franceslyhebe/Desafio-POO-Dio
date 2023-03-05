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

        System.out.println(cursoJava);
        System.out.println(cursoReact);
        System.out.println(mentoria);
    }

}
