package atividadedeaula.aula09;

public class RelogioTeste {
	public static void main(String[] args) {
		Relogio relogio1 = new Relogio("Rolex", 13, 53);
		
		System.out.println("O relogio " + relogio1.getMarca() + " aprensenta " + 
		relogio1.getHora() + " horas e " + relogio1.getMinutos() + " minutos.");
		
		relogio1.setHora(0);
		relogio1.setMinutos(59);
		
		System.out.println("O relogio " + relogio1.getMarca() + " aprensenta " + 
				relogio1.getHora() + " horas e " + relogio1.getMinutos() + " minutos.");
		
		relogio1.setHora(-1);
		relogio1.setMinutos(60);
		
		System.out.println("O relogio " + relogio1.getMarca() + " aprensenta " + 
				relogio1.getHora() + " horas e " + relogio1.getMinutos() + " minutos.");
				
	}
}
