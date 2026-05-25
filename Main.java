import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

public static void main(String[] args) {

List<Veiculo> veiculos = new ArrayList<>();
List<Aluguel> alugueis = new ArrayList<>();

Carro carro = new Carro(
"ABC1234",
"Civic",
2020,
250,
50000,
StatusVeiculo.DISPONIVEL,
4);

Moto moto = new Moto(
"XYZ9999",
"CB500",
2022,
120,
12000,
StatusVeiculo.MANUTENCAO,
500);

Van van = new Van(
"VAN7777",
"Sprinter",
2021,
400,
70000,
StatusVeiculo.DISPONIVEL,
15);

veiculos.add(carro);
veiculos.add(moto);
veiculos.add(van);


AluguelBasico basico =
new AluguelBasico("João");

AluguelPremium premium =
new AluguelPremium("Maria");

alugueis.add(basico);
alugueis.add(premium);


basico.adicionarVeiculo(carro);
premium.adicionarVeiculo(van);


System.out.println("VEÍCULOS ");

for (Veiculo v : veiculos) {
System.out.println(v);
}


System.out.println("ALUGUÉIS ");

for (Aluguel a : alugueis) {
System.out.println(a);
a.detalhes();
}

System.out.println(" DISPONÍVEIS ");

for (Veiculo v : veiculos) {
if (v.getStatus() == StatusVeiculo.DISPONIVEL) {
System.out.println(v);
}
}


carro.avaliar(9);
van.avaliar(10);


moto.realizarInspecao();
van.realizarInspecao();


Iterator<Veiculo> iterator = veiculos.iterator();

while (iterator.hasNext()) {

Veiculo v = iterator.next();

if (v.getStatus() ==
StatusVeiculo.MANUTENCAO) {

iterator.remove();
}
}

System.out.println("VEÍCULOS APÓS REMOÇÃO ");

for (Veiculo v : veiculos) {
System.out.println(v);
}
}
}