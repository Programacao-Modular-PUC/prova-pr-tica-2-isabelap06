import java.util.ArrayList;
import java.util.List;

public abstract class Aluguel {

protected String cliente;
protected List<Veiculo> veiculos;

public Aluguel(String cliente) {
this.cliente = cliente;
veiculos = new ArrayList<>();
}

public void adicionarVeiculo(Veiculo v) {
veiculos.add(v);
v.setStatus(StatusVeiculo.ALUGADO);
}

public abstract void detalhes();

@Override
public String toString() {
return "\nCliente: " + cliente +
"Quantidade de veículos: " + veiculos.size();
}
}