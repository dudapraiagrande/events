package br.eti.eduardoalves.events.controller;

import javax.annotation.Priority;
import javax.enterprise.event.Observes;

import br.eti.eduardoalves.events.pojo.Pojo;

public class Process1Controller {

    public void bussinessLogic(@Observes @Priority(2) Pojo pojo) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Process 1: " + pojo.getName());
    }

}
