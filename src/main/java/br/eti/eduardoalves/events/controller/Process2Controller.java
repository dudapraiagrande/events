package br.eti.eduardoalves.events.controller;

import javax.annotation.Priority;
import javax.enterprise.event.Observes;

import br.eti.eduardoalves.events.pojo.Pojo;

public class Process2Controller {

    public void bussinessLogic(@Observes @Priority(1) Pojo pojo) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Process 2: " + pojo.getName());
    }

}
