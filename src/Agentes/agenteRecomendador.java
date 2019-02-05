/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agentes;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.wrapper.StaleProxyException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Salventy
 */
public class agenteRecomendador extends Agent{
    
@Override
public void setup(){
    System.out.println("Hola soy un agente");
//    addBehaviour(new ComportamientoSuma());
}
protected void takeDown() {
    System.out.println("Finaliza el "
            + this.getLocalName());
    System.out.println("--------------------------------------------------");
}
//private class ComportamientoSuma extends Behaviour {
//
//        @Override
//        public void action() {
            Object[] args = getArguments();
//            System.out.println("asdasdasdasd");
//            
//
//        }
//
//        @Override
//        public boolean done() {
//
//            System.out.println("Finaliza el " + this.getBehaviourName());
//            System.out.println("--------------------------------------------------");
//            doDelete();
//            return true;
//        }
//
//    }

    
    
}
