package negocio;

public interface Subject {
    public void adicionar(Observer observer);
    public void notificar(Publicacao novaPublicacao, String autor);
}
