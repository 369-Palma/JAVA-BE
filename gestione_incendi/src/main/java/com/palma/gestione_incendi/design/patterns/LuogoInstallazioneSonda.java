package com.palma.gestione_incendi.design.patterns;

public class LuogoInstallazioneSonda implements Observer {

	//private CentroControlloInterface controllo;
	
	@Override
	public void update(Subject obj) {
		DatiSonda dati = createDatiSonda((Sonda)obj);
		//controllo.rilevaIncendio(dati);
	}
	
	private DatiSonda createDatiSonda(Sonda obj) {
		return new DatiSonda(obj.getId(), obj.getLatitudine(), obj.getLongitudine(),obj.getSmokeLevel());
	}

}
