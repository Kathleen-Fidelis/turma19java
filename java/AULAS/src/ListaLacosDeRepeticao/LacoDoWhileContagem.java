package ListaLacosDeRepeticao;

public class LacoDoWhileContagem {

	public static void main(String[] args) {
		
		int x = 233;
		
		do {
			if (x > 300 && x < 400) {
				System.out.println(x + "+ 3=");
				x =  x + 3;
				System.out.println(x);
			}
			else {
				System.out.println(x + "+ 5=");
				x = x + 5;
				System.out.println(x);
			}
		}
		
		while(x < 456);

	}

}
