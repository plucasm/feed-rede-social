package negocio;

import java.util.ArrayList;

public class Bookface implements Subject{
    
    private ArrayList<Publicacao> publicacoes;
    private ArrayList<Observer> observers;

    public Bookface() {
        this.observers = new ArrayList<>();
        this.publicacoes = new ArrayList<>();
    }

    @Override
    public void adicionar(Observer observer) {
        observers.add(observer);
    }

    public void receberPublicacao(Publicacao publicacao, String nomeUsuario){
        publicacoes.add(publicacao);
        notificar(publicacao, nomeUsuario);
    }
    @Override
    public void notificar(Publicacao novaPublicacao, String autor) {
        for (Observer observer : observers) {
            observer.update(novaPublicacao, autor);
        }
    }

    public ArrayList<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }
}
