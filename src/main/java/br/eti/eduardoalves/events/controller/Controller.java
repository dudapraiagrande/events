package br.eti.eduardoalves.events.controller;

import javax.enterprise.event.Event;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

import br.eti.eduardoalves.events.pojo.Pojo;

public class Controller {
    
    @Inject @Any private Event<Pojo> pojoEvent;
	
	public void updatePojoName(Pojo pojo) {
	    pojo.setName("MyPojo");
	    System.out.println("Nome do pojo atualizado");
	    pojoEvent.fire(pojo);
	}

}
