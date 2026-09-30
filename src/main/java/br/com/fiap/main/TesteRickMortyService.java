package br.com.fiap.main;

import br.com.fiap.api.Episodio;
import br.com.fiap.api.Localizacao;
import br.com.fiap.api.Personagem;
import br.com.fiap.services.RickMortyService;

import javax.swing.*;
import java.io.IOException;

public class TesteRickMortyService {

    static int inteiro (String i){
        return Integer.parseInt( JOptionPane.showInputDialog(i) );
    }
    static String texto (String t){
        return JOptionPane.showInputDialog(t);
    }

    public static void main(String[] args) throws IOException {

        JOptionPane.showMessageDialog(null,
                "Faça uma busca no universo gigantesco de Rick and Morty!!"+
                "\nInforme apenas opções válidas: " +
                        "\n1- Personagens" +
                        "\n2- Planetas / localizações famosas" +
                        "\n3- Episódios");

        int opcao = 0;
        while (true){
            try {
                opcao = inteiro("1- Personagens" +
                        "\n2- Planetas" +
                        "\n3- Episódios" +
                        "\n\nInforme uma opção válida");

                if (opcao > 3 || opcao < 1){
                    throw new Exception("Informe uma opção válida entre 1 e 3.");
                }
                break;
            } catch (Exception e){
                System.out.println("Erro detectado: "+ e.getMessage());
            }

        }

        if (opcao == 1){
            RickMortyService rickMortyService = new RickMortyService();

            String p = texto("Informe um número para busca de um personagem (1 a 826)");

            Personagem personagem = rickMortyService.getPersonagem(p);

            System.out.println(personagem);
        } else if (opcao == 2) {
            RickMortyService rickMortyService = new RickMortyService();

            String p = texto("Informe um número para busca de uma localização/planeta (1 a 126)");

            Localizacao localizacao = rickMortyService.getLocalizacao(p);

            System.out.println(localizacao);
        } else if (opcao == 3) {
            RickMortyService rickMortyService = new RickMortyService();

            String p = texto("Informe um número para busca de um episódio (1 a 51)");

            Episodio episodio = rickMortyService.getEpisodio(p);

            System.out.println(episodio);
        }


    }

}
