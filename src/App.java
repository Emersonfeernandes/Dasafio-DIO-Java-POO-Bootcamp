
import bootcamp.Bootcamp;
import bootcamp.Curso;
import bootcamp.Dev;
import bootcamp.Mentoria;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev marcos = new Dev();
        marcos.setNome("Marcos");
        marcos.inscreverBootcamp(bootcamp);
        
        marcos.showIncritos();
        marcos.progredir();
        marcos.progredir();
        System.out.println("------------------------------");
        marcos.showIncritos();
        marcos.showConcluidos();
        
    }
}
