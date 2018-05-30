package EntidadesDominio;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import static org.junit.Assert.assertFalse;

public class ProyectoSteps {

    private Proyecto proyecto;
    private List<Requisito> requisitos;

    @Dado("^que mi caja de ahorro tiene un saldo de \"(.*?)\" pesos$")
    public void que_mi_caja_de_ahorro_tiene_un_saldo_de_pesos(int saldoInicial) throws Throwable {
        fachadaBanco = new FachadaBanco();
        fachadaBanco.crearCuenta(CBU, saldoInicial);
    }

    @Cuando("^cuando debito \"(.*?)\" pesos$")
    public void cuando_debito_pesos(int montoADebitar) throws Throwable {
        resultadoExitoso = fachadaBanco.debitar(CBU, montoADebitar);
    }

    @Entonces("^el saldo final es de \"(.*?)\" pesos$")
    public void el_saldo_final_es_de_pesos(int saldoFinal) throws Throwable {
        assertTrue(resultadoExitoso);
        assertEquals(saldoFinal, fachadaBanco.consultarSaldo(CBU));
    }

    @Entonces("^la operacion es rechazada y el saldo final es \"(.*?)\" pesos$")
    public void la_operacion_es_rechazada_y_el_saldo_final_es_pesos(int saldoFinal) throws Throwable {
        assertFalse(resultadoExitoso);
        assertEquals(saldoFinal, fachadaBanco.consultarSaldo(CBU));
    }

}
