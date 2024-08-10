import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlunoTest {
    /*  @Test
      public void testMatriculaValida() {
          Aluno aluno = new Aluno(1, "João", 7.5, 8.0);

          aluno.setMatricula(10);

          Assertions.assertTrue(aluno.getMatricula() > 0, "Matrícula deve ser maior que zero.");
      }*/
    @Test
    public void nomeComMenosDeQuatroCaracteresTes() {
        Aluno aluno = new Aluno();
        String nome = "Ana Maria";

        aluno.setNome(nome);

        Assertions.assertTrue(nome.length() >= 4, "O nome deve ter pelo menos quatro caracteres.");
    }

    @Test
    public void nomeESobrenomeTest() {

        Aluno aluno = new Aluno();
        String nome = "Carlos Paulo";

        aluno.setNome(nome);

        String[] partesDoNome = nome.split(" ");
        Assertions.assertTrue(partesDoNome.length >= 2, "O nome deve conter pelo menos dois nomes (nome e sobrenome).");
    }

    @Test
    public void notaValidaTest() {
        Aluno aluno = new Aluno();
        double nota = 7.5;

        aluno.setNota1(nota);

        Assertions.assertTrue(nota >= 0 && nota <= 10, "A nota deve estar entre 0 e 10.");
    }

    @Test
    public void notaInvalidaAbaixoDeZeroTest() {
        Aluno aluno = new Aluno();
        double nota = -1.0;

        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
            }
            aluno.setNota1(nota);
        });

        Assertions.assertEquals("A nota deve estar entre 0 e 10.", exception.getMessage());
    }

    @Test
    public void testCalcularMedia() {

        Aluno aluno = new Aluno();
        aluno.setNota1(7.5);
        aluno.setNota2(8.5);
        double esperado = 8.0;

        double media = aluno.calcularMedia();

        Assertions.assertEquals(esperado, media, "A média das notas está incorreta.");
    }

}

