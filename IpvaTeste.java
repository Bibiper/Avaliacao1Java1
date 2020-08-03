
package br.com.serratec.avaliacaojava1;

public class IpvaTeste {
    
         public static void main(String[] args) {
		
	Ipva veiculo1 = new Ipva("Sandero", "LVC-5430", "gnv", 55000.0, 125);
	veiculo1.calculaIpva();
	System.out.println(veiculo1);

	Ipva veiculo2 = new Ipva("Fiesta", "MVC-1212", "flex", 40000.0, 125);
	veiculo2.calculaIpva();
	System.out.println(veiculo2);
         }
}
