package appliccation;

public class Program {
	public static void main(String[] args) {
	Operacoes o=new Operacoes();
		do {
			o.Menu();
			o.escolherOpc();
			if(o.opc==1) {
				o.DiretamenteP();
			}
			if(o.opc==2) {
				o.InversamenteP();
			}
			if(o.opc>3||o.opc<1) {
				System.out.println("OPÇÃO INVALIDA BURRO");
			}
		}while(o.opc!=3);
		System.out.println("SISTEMA ENCERRADO PUTA");
	}
}