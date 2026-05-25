public class Carro extends Veiculo implements Avaliavel {

private int quantidadePortas;
private int avaliacao;

public Carro(String placa, String modelo, int anoFabricacao,
double valorDiaria, double quilometragem,
StatusVeiculo status, int quantidadePortas) {

super(placa, modelo, anoFabricacao, valorDiaria,
quilometragem, status);

this.quantidadePortas = quantidadePortas;
}

@Override
public void avaliar(int nota) {
avaliacao = nota;
System.out.println("Carro avaliado com nota: " + nota);
}

@Override
public String toString() {
return super.toString() +
"Portas: " + quantidadePortas +
"Avaliação: " + avaliacao;
}
}