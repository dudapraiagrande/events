package br.eti.eduardoalves.events;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import br.eti.eduardoalves.events.controller.Controller;
import br.eti.eduardoalves.events.pojo.Pojo;

public class Main {

    public static void main(String[] args) {

        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            Controller myBean = container.select(Controller.class).get();
            Pojo pojo = new Pojo();
            System.out.println("Nome original do pojo: " + pojo.getName());
            myBean.updatePojoName(pojo);
        }

    }

}
