package atividadedeaula.aula11;
//
public class EmpresaTeste {
	public static void main(String[] args) {
		Empresa empresa1 = new Empresa("Digue Digue Joy", "763.644.676-37",UnidadeFederativa.RIO_DE_JANEIRO);
		
		System.out.println(empresa1 + UnidadeFederativa.RIO_DE_JANEIRO.getUf());
		
	}
}
