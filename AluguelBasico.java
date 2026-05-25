public class AluguelBasico extends Aluguel {

public AluguelBasico(String cliente) {
super(cliente);
}

@Override
public void detalhes() {
System.out.println("Aluguel Básico");
System.out.println("Até 100km/dia");
System.out.println("Sem seguro");
}
}