package br.eti.eduardoalves.events.controller;

import javax.annotation.Priority;
import javax.enterprise.event.Observes;

import br.eti.eduardoalves.events.pojo.Pojo;

public class Process3Controller {

    public void bussinessLogic(@Observes @Priority(3) Pojo pojo) throws InterruptedException {
        System.out.println("Process 3: " + pojo.getName());
    }

}
