public class Moto extends Veiculo implements Inspecionavel {

private int cilindrada;

public Moto(String placa, String modelo, int anoFabricacao,
double valorDiaria, double quilometragem,
StatusVeiculo status, int cilindrada) {

super(placa, modelo, anoFabricacao,
valorDiaria, quilometragem, status);

this.cilindrada = cilindrada;
}

@Override
public void realizarInspecao() {
System.out.println("Inspeção realizada na moto.");
}

@Override
public String toString() {
return super.toString() +
"Cilindrada: " + cilindrada;
}
}