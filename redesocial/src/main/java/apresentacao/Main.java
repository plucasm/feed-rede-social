package apresentacao;

import negocio.Bookface;
import negocio.Publicacao;
import negocio.Usuario;

public class Main {
    
    public static void main(String[] args) {
        Bookface redeSocial = new Bookface();

        Usuario pedro = new Usuario("@Pedrol");
        Usuario igor = new Usuario("@IgorPereira");

        redeSocial.adicionar(pedro);
        redeSocial.adicionar(igor);

        Publicacao publicacaoIgor = new Publicacao("Conteudo novo de PPP");
        Publicacao publicacaoPedro = new Publicacao("Aprendi a programar em Java");

        pedro.postar(redeSocial, publicacaoPedro);
        igor.postar(redeSocial, publicacaoIgor);
    }
}
