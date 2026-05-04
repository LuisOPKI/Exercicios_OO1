package atividadedeaula.aula11;
//
public class ClienteTeste {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente(1234,"otavio", "04/11", EstadoCivil.CASADO);
		Cliente cliente2 = new Cliente(4567,"murilo", "04/12", EstadoCivil.SOLTEIRO);
		System.out.println(cliente1);
		System.out.println(cliente2);
	}
}
