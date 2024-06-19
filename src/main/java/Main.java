import java.time.LocalDate;
import org.dio.bootcamp.dominio.Bootcamp;
import org.dio.bootcamp.dominio.Curso;
import org.dio.bootcamp.dominio.Dev;
import org.dio.bootcamp.dominio.Mentoria;

public class Main {

  public static void main(String[] args) {
    Curso curso = new Curso();

    curso.setTitulo("Curso Java");
    curso.setDescricao("Curso de java");
    curso.setCargaHoraria(8);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria Java");
    mentoria.setDescricao("descrição da mentoria de Java");
    mentoria.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso);
    bootcamp.getConteudos().add(mentoria);

    Dev devEmerson = new Dev();
    devEmerson.setNome("Emerson");
    devEmerson.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos Emerson" + devEmerson.getConteudosInscritos());
    devEmerson.progredir();
    System.out.println("Conteúdos Concluídos Emerson" + devEmerson.getConteudosConcluidos());

    Dev devJose = new Dev();
    devJose.setNome("José");
    devJose.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos José" + devJose.getConteudosInscritos());
    devJose.progredir();
    System.out.println("Conteúdos Concluídos José" + devJose.getConteudosConcluidos());
  }
}
