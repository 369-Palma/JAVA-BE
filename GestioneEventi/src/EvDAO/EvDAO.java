package EvDAO;

import java.util.List;

import util.Evento;

public interface EvDAO {
public void save(Evento e);
public Evento getById(Long id);
public void delete(Evento e);
public List <Evento> gettAll();
}