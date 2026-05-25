public class AluguelPremium extends Aluguel {

public AluguelPremium(String cliente) {
super(cliente);
}

@Override
public void detalhes() {
System.out.println("Aluguel Premium");
System.out.println("KM ilimitada");
System.out.println("Seguro incluso");
}
}