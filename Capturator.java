package ClienteVista;

public class Capturator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "";
		//String[] argu = {"8","2"}; 
		for (int i = 0; i < args.length; i++) {
			num = num + args[i];
		}		
		//int num1 = Integer.parseInt(args[0]);
		//int num2 = Integer.parseInt(args[1]);
		
		Messenger Men = new Messenger(num);
		Men.enviar();
//		Presentator pres = new Presentator();
//		pres.respuesta();
		//System.out.println(num);
	}
}
