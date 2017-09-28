package br.com.caelum.dominio;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.servico.Avaliador;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aluno on 27/09/17.
 */
public class TesteDoAvaliador {
    @Test
    public void deveEntenderLancesEmOrdem (){
        Usuario joao = new Usuario("João");
        Usuario jose = new Usuario("José");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Xbx One usado");

        leilao.propoe(new Lance(joao, 250.00));
        leilao.propoe(new Lance(jose, 300.00));
        leilao.propoe(new Lance(maria, 400.00));

        Avaliador leioeiro = new Avaliador();

        leioeiro.avalia(leilao);

        double maiorEsperado = 400;
        double menorEsperado = 250;


        Assert.assertEquals(maiorEsperado, leioeiro.getMaiorLance(), 0.00001);
        Assert.assertEquals(menorEsperado,leioeiro.getMenorLance(),0.00001);

    }
}
