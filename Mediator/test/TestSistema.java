import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.sisoftware.mediator.*;

public class TestSistema {
	private Radio radio;
	private Telefono telefono;
	private Coche coche;
	
	@BeforeEach
	public void init() {
		radio = new Radio();
		telefono = new Telefono();
		coche = new Coche();
		MediatorI mediator = new MediatorI();
		radio.setMediator(mediator);
		telefono.setMediator(mediator);
		coche.setMediator(mediator);
		mediator.setTelefono(telefono);
		mediator.setCoche(coche);
		mediator.setRadio(radio);

	}
	
	@Test
	public void test_encender_apagar_coche() {
		assertFalse(radio.encendida());
		assertFalse(telefono.musicaEncendida());
		telefono.enciendeMusica();
		assertTrue(telefono.musicaEncendida());
		coche.cocheEnciende();
		assertTrue(radio.encendida());
		assertFalse(telefono.musicaEncendida());
		coche.cocheApaga();
		assertFalse(radio.encendida());
	}

	@Test
	public void test_suena_telefono() {
		radio.enciende();
		assertTrue(radio.encendida());
		telefono.recibeLlamada();
		assertFalse(radio.encendida());
	}
	
	@Test
	public void test_enciende_radio() {
			telefono.enciendeMusica();
			assertTrue(telefono.musicaEncendida());
			radio.enciendeR();
			assertFalse(telefono.musicaEncendida());

		}
}

