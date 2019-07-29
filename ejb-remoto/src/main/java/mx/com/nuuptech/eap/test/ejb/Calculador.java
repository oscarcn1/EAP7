package mx.com.nuuptech.eap.test.ejb;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(CalculadorRemoto.class)
public class Calculador implements CalculadorRemoto {

	public Calculador() {
	}
	
	

	private Long factorial(Long numero) {
		if (numero == 0L)
			return 1L;
		else
			return numero * factorial(numero - 1L);
	}



	@Override
	public Long calculaFactorial(Long numero) {
		return (numero != null && numero > -1L ) ? -1L : factorial(numero);
	}

}
