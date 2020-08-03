
package br.com.serratec.avaliacaojava1;


public class Ipva extends Veiculo {
    
         private double valorIpva;
         private double taxaLicenciamento;

         public Ipva(String modelo, String placa, String combustivel, double valorVeiculo, double taxaLicenciamento) {
	super(modelo.toUpperCase(), placa.toUpperCase(), combustivel.toUpperCase(), valorVeiculo);
	this.taxaLicenciamento = taxaLicenciamento;
         }

         public double getValorIpva() {
	return valorIpva;
         }

         public void calculaIpva() {
             switch (combustivel) {
                 case "GNV":
                     valorIpva = (valorVeiculo * 0.01) + taxaLicenciamento;
                     break;
                 case "FLEX":
                     valorIpva = (valorVeiculo * 0.03) + taxaLicenciamento;
                     break;
                 default:
                     valorIpva = (valorVeiculo * 0.04) + taxaLicenciamento;
                     break;
             }
         }

         @Override
         public String toString() {
	return "Modelo : " + modelo + "\n" + 
                             "Placa: " + placa + "\n" + 
	           "Combustível: " + combustivel + "\n" + 
	           "Valor do Veículo: " + valorVeiculo + "\n" +
	           "Taxa de Licenciamento: " + taxaLicenciamento + "\n" +
	           "Valor do IPVA: " + valorIpva + "\n";
         }
}

