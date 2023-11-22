package state;

import state.ConectionMessages.Link;
import state.ConectionMessagesSolution.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConexionTest {

    private Context conexion;
    private Link link;

    @BeforeEach
    public void setUp() {
        link = new Link() {
            @Override
            public void enviar(String msg) {

            }

            @Override
            public void recibir(int respuesta) {

            }
        };
        conexion = new Context(link);
    }

    @Test
    public void testConexionInicialEstadoCerrado() {
        assertEquals(new Cerrado().getClass(), conexion.getEstado().getClass());
    }

    @Test
    public void testAbrirConexionDesdeEstadoCerrado() {
        conexion.abrir();
        assertEquals(new Preparado().getClass(), conexion.getEstado().getClass());
    }

    @Test
    public void testCerrarConexionDesdeEstadoPreparado() {
        conexion.abrir();
        conexion.cerrar();
        assertEquals(new Cerrado().getClass(), conexion.getEstado().getClass());
    }

    @Test
    public void testPararConexionDesdeEstadoPreparado() {
        conexion.abrir();
        conexion.parar();
        assertEquals(new Parado().getClass(), conexion.getEstado().getClass());
    }

    @Test
    public void testIniciarConexionDesdeEstadoParado() {
        conexion.abrir();
        conexion.parar();
        conexion.iniciar();
        assertEquals(new Preparado().getClass(), conexion.getEstado().getClass());
    }

    @Test
    public void testEnviarMensajeDesdeEstadoPreparado() {
        conexion.abrir();
        conexion.enviar("Hola");
        assertEquals(new Esperando().getClass(), conexion.getEstado().getClass());
    }

    @Test
    public void testRecibirRespuestaDesdeEstadoEsperando() {
        conexion.abrir();
        conexion.enviar("Hola");
        conexion.recibir(0);
        assertEquals(new Preparado().getClass(), conexion.getEstado().getClass());
    }

    @Test
    public void testRecibirRespuestaIncorrectaDesdeEstadoEsperando() {
        conexion.abrir();
        conexion.enviar("Hola");
        conexion.recibir(1);
        assertEquals(new Cerrado().getClass(), conexion.getEstado().getClass());
    }
}
