package aula05_encapsulamento.pratica01;

import java.time.LocalDateTime;


public class ServidorCameras implements Servidor{

    private boolean ligado;
    private boolean acess;
    LocalDateTime localDateTime;

    public ServidorCameras() {
    }

    public ServidorCameras(boolean ligado, boolean acess, LocalDateTime localDateTime) {
        this.ligado = ligado;
        this.acess = acess;
        this.localDateTime = localDateTime;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isAcess() {
        return acess;
    }

    public void setAcess(boolean acess) {
        this.acess = acess;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public void ligarServidor(){
        if(!isLigado()){
            setLigado(true);
       }
    }

    public void desligarServidor(){
        if(isLigado()){
            setLigado(false);

        }
    }

    public String resposta(String resp) {

            if (resp.equalsIgnoreCase("Sim")) {
                setLigado(true);
            }
            if (resp.equalsIgnoreCase("Não")) {
                setLigado(false);
        }
        return null;
    }


    @Override
    public void online() {
        if (isLigado()) {
            setLocalDateTime(LocalDateTime.now());
            System.out.println("Servidor online: " + getLocalDateTime());
        }
        if(!isLigado()) {
            setLocalDateTime(LocalDateTime.now());
            System.out.println("Servidor offline: " + getLocalDateTime());
        }
    }

    @Override
    public String acessoServico(String servico) {
        return servico;
    }
}