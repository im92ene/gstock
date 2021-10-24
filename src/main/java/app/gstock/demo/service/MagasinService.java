package app.gstock.demo.service;

import java.util.List;

import app.gstock.demo.model.Magasin;

public interface MagasinService { public List<Magasin> getAllMagasins();

public Magasin getMagasinById(long id);
 
public void saveOrUpdate(Magasin agent);

public void deleteMagasin(long id);

}
