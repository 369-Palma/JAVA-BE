package com.palma.gestione_incendi.design.patterns;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	private final List <Observer> observers = new ArrayList<Observer>();
	
	
	public void notifyObservers() {
		this.getObservers().forEach(e->e.update(this));
	}
	
	public void addObserver(Observer o) {
		this.getObservers().add(o);
	}
	
	public boolean removeObserver(Observer o) {
		return this.getObservers().remove(o);
	}
	
	public List <Observer> getObservers() {
		return observers;
	}
}