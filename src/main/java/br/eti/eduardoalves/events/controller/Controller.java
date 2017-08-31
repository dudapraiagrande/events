package br.eti.eduardoalves.events.controller;

import br.eti.eduardoalves.events.event.BusinessEvent;
import br.eti.eduardoalves.events.model.Pojo;

public class Controller {
	
	public void businessLogic() {
	    Pojo pojo = new Pojo();
	    pojo.setName("João");
	    
	    BusinessEvent bussinessEvent = new BusinessEvent(this, pojo);
		System.out.println("Process 1!");
		System.out.println("Process 2!");
		System.out.println("Process 3!");
	}

}
