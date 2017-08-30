package br.eti.eduardoalves.events.event;

import java.util.EventObject;

import br.eti.eduardoalves.events.model.Pojo;

public class BussinessEvent extends EventObject {

	private static final long serialVersionUID = 1L;
	private final Pojo pojo;

	public BussinessEvent(Object source, Pojo pojo) {
		super(source);
		this.pojo = pojo;
	}

	public Pojo getPojo() {
		return pojo;
	}

}
