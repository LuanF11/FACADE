package src.pc.facade;

import src.pc.fabric.CPU;
import src.pc.fabric.HD;
import src.pc.fabric.Memoria;
import src.pc.fabric.SO;
import src.domain.fabric.Acessorios;

public class ComputerFacade {

    private Memoria memoria;
    private HD hd;
    private CPU cpu;
    private Acessorios acessorios;
    private SO so;

    public ComputerFacade() {
        this.memoria = new Memoria();
        this.hd = new HD();
        this.cpu = new CPU();
        this.acessorios = new Acessorios();
        this.so = new SO();
    }

    public void montarPC() {
        System.out.println("Montando PC...");

        memoria.addMemoria();
        hd.addHD();
        cpu.addcpu();
        acessorios.addMouse();
        acessorios.addTeclado();
        acessorios.addMonitor();
        so.instalarSO();

        System.out.println("PC montado!");
    }

}
