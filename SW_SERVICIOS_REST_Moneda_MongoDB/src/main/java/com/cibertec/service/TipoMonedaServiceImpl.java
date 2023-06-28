package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.TipoMoneda;
import com.cibertec.repository.TipoMonedaRepository;

@Service
public class TipoMonedaServiceImpl implements TipoMonedaService {

	@Autowired
	private TipoMonedaRepository repository;

	@Override
	public List<TipoMoneda> listaTipoMoneda() {
		return repository.findAll();
	}
	
	@Override
	public TipoMoneda insertaTipoMoneda(TipoMoneda obj) {
		return repository.save(obj);
	}

	@Override
	public Optional<TipoMoneda> buscaTipoMoneda(int idTipoMoneda) {
		return repository.findById(idTipoMoneda);
	}
	
	@Override
	public void eliminaTipoMoneda(int idTipoMoneda) {
		List<TipoMoneda> opt =  repository.buscaTipoMonedaPorId(idTipoMoneda);
		repository.delete(opt.get(0));
	}


	@Override
	public List<TipoMoneda> listaTipoMonedaPorDescripcion(String descripcion) {
		return repository.listaTipoMonedaPorDescripcion(descripcion);
	}
	
	@Override
	public List<TipoMoneda> listaTipoMonedaPorId(int idTipoMoneda) {
		return repository.listaTipoMonedaPorId(idTipoMoneda);
	}
	
	@Override
	public List<TipoMoneda> buscaTipoMonedaPorId(int idBanco) {
		return repository.buscaTipoMonedaPorId(idBanco);
	}


}


