public class AluguelExecutivo extends Aluguel
implements Avaliavel {

private int avaliacao;

public AluguelExecutivo(String cliente) {
super(cliente);
}

@Override
public void avaliar(int nota) {
avaliacao = nota;
System.out.println("Aluguel executivo avaliado com nota: " + nota);
}

@Override
public void detalhes() {
System.out.println("Aluguel Executivo");
System.out.println("Motorista particular");
System.out.println("KM ilimitada");
}
}