public class Van extends Veiculo
implements Avaliavel, Inspecionavel {

private int maxPassageiros;
private int avaliacao;

public Van(String placa, String modelo, int anoFabricacao,
double valorDiaria, double quilometragem,
StatusVeiculo status, int maxPassageiros) {

super(placa, modelo, anoFabricacao,
valorDiaria, quilometragem, status);

this.maxPassageiros = maxPassageiros;
}

@Override
public void avaliar(int nota) {
avaliacao = nota;
System.out.println("Van avaliada com nota: " + nota);
}

@Override
public void realizarInspecao() {
System.out.println("Inspeção realizada na van.");
}

@Override
public String toString() {
return super.toString() +
"Máx Passageiros: " + maxPassageiros +
"Avaliação: " + avaliacao;
}
}