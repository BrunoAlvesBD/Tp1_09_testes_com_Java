import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {
    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }
}
