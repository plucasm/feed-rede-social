package negocio;

import java.util.ArrayList;

public class Usuario implements Observer{
    private ArrayList<Publicacao> publicacao;
    private String nomeUsuario;

    public Usuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
        this.publicacao = new ArrayList<>();
    }

    public void postar(Bookface bookface, Publicacao publicacao) {
        bookface.receberPublicacao(publicacao, this.nomeUsuario);
    }
    @Override
    public void update(Publicacao novaPublicacao, String autor) {
        System.out.println("-------------------------------------");
        System.out.println(nomeUsuario + " você tem uma nova publicação.\nAutor; " + autor + "\nPublicou: " + novaPublicacao.getTexto());
    }

    public ArrayList<Publicacao> getPublicacao() {return publicacao;}
    public void setPublicacao(ArrayList<Publicacao> publicacao) {this.publicacao = publicacao;}

    public String getNomeUsuario() {return nomeUsuario;}
    public void setNomeUsuario(String nomeUsuario) {this.nomeUsuario = nomeUsuario;}
}
