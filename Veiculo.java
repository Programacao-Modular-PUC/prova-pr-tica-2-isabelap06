public abstract class Veiculo {

protected String placa;
protected String modelo;
protected int anoFabricacao;
protected double valorDiaria;
protected double quilometragem;
protected StatusVeiculo status;

public Veiculo(String placa, String modelo, int anoFabricacao,
double valorDiaria, double quilometragem,
StatusVeiculo status) {

this.placa = placa;
this.modelo = modelo;
this.anoFabricacao = anoFabricacao;
this.valorDiaria = valorDiaria;
this.quilometragem = quilometragem;
this.status = status;
}

public StatusVeiculo getStatus() {
return status;
}

public void setStatus(StatusVeiculo status) {
this.status = status;
}

@Override
public String toString() {
return "Placa: " + placa +
"Modelo: " + modelo +
"Ano: " + anoFabricacao +
"Diária: " + valorDiaria +
"KM: " + quilometragem +
"Status: " + status;
}
}