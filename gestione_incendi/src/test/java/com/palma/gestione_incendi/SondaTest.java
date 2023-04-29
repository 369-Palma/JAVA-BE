package com.palma.gestione_incendi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeAll;
public class SondaTest {
	
static com.palma.gestione_incendi.design.patterns.Sonda s;
com.palma.gestione_incendi.design.patterns.Sonda s1;
	
//test sulle proprietà dell'oggetto istanziato (verifico se quello che ottengo è ciò che mi aspetto)

@BeforeAll
public static void beforeTestSonda() {
	s = new com.palma.gestione_incendi.design.patterns.Sonda(11l,23.345322,11.2346311, 7);
}

@Test
public void testId() {
		assertEquals(11l, s.getId());
	}
	
@Test
public void testLatitudine() {
		assertEquals(23.345322, s.getLatitudine());
	}

@Test
public void testLongitudine() {
	assertEquals(11.2346311, s.getLongitudine());	
}

@Test
public void testSmokeLevel() {
	assertEquals(7, s.getSmokeLevel());	
}

//verifico che i rilevatori del livello/intesità del fumo funzionino correttamente

@Test
@DisplayName("Dovrebbe essere true. C'è un incendio")
public void TestAllarme() {
	assertTrue(s.getSmokeLevel() > 5);
}

@Test
@DisplayName("Dovrebbe essere false. Non c'è alcun incendio")
public void TestNoIncendio() {
	s1 = new com.palma.gestione_incendi.design.patterns.Sonda(11l,23.345322,11.2346311, 5);
	assertFalse(s1.getSmokeLevel() > 5);
}

 //resetto le variabili dell'oggetto sonda testato prima

@AfterAll
public static void afterAllTestSonda() {
	s = null;
}

}
