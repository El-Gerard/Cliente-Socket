package ClienteVista;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Messenger {

	private String num1;
	
	public Messenger(String a) {
		this.num1 = a;
	}

	public void enviar() {
		try {
			Socket miSocket = new Socket("localhost", 9999);

			DataOutputStream flujo_salida = new DataOutputStream(miSocket.getOutputStream());

			flujo_salida.writeUTF(num1);
			
			Presentator pres = new Presentator();
			pres.mostrar(miSocket);
			
			flujo_salida.close();
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		}
	}
}
