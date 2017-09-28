package br.com.caelum.leilao.dominio.br.com.caelum.leilao;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.servico.Avaliador;

/**
 * Created by Gilmar-Filho on 27/09/2017.
 */
public class TesteDoAvaliador {
    public static void main(String[] args){
        // parte 1: cenario
        Usuario joao = new Usuario("João");
        Usuario jose = new Usuario("José");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Playstation 3 Novo");

        // parte 2: acao
        leilao.propoe(new Lance(joao, 250.0));
        leilao.propoe(new Lance(jose, 300.0));
        leilao.propoe(new Lance(maria, 400.0));

        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        // parte 3: validacao
        double maiorEsperado = 400;
        double menorEsperado = 250;

        System.out.println(maiorEsperado == leiloeiro.getMaiorLance());
        System.out.println(menorEsperado == leiloeiro.getMenorLance());
    }
}
