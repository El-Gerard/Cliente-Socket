package ClienteVista;

import java.io.DataInputStream;
import java.io.IOException;
//import java.net.ServerSocket;
import java.net.Socket;

public class Presentator {

	public void mostrar(Socket soc) {

		try {
			//Socket miSocket = new Socket("localhost",9999);

			//Socket miSocket = servidor.accept();

			DataInputStream flujo_entrada = new DataInputStream(soc.getInputStream());

			int Mensaje_texto = flujo_entrada.read();

			System.out.println("La suma es: " + Mensaje_texto);

			soc.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
