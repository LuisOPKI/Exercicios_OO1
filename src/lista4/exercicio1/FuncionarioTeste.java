package lista4.exercicio1;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Funcionario func1 = new Funcionario(
	            1025, 
	            "Ana Beatriz", 
	            "12/03/1995", 
	            "Feminino", 
	            "Recursos Humanos", 
	            "(41) 98888-7777", 
	            new Endereco(
	                    "Avenida República Argentina", 
	                    450, 
	                    "Portão", 
	                    "Curitiba", 
	                    "PR"
	                )
	        );
		
		func1.emitirRelatorio();
	}
}
