package br.com.fiap.services;

import br.com.fiap.api.Episodio;
import br.com.fiap.api.Localizacao;
import br.com.fiap.api.Personagem;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class RickMortyService {

    public Personagem getPersonagem(String p) throws IOException {

        Personagem personagem = null;

        //request
        HttpGet request =new HttpGet("https://rickandmortyapi.com/api/character/"+p);

        //client
        CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

        //response
        CloseableHttpResponse response = httpClient.execute(request);

        //entity
        HttpEntity entity = response.getEntity();

        //gson
        if (entity!= null){
            String result = EntityUtils.toString(entity);

            Gson gson = new Gson();

            personagem = gson.fromJson(result, Personagem.class);

        }
        return personagem;
    }


    public Localizacao getLocalizacao(String p) throws IOException {

        Localizacao localizacao = null;

        //request
        HttpGet request =new HttpGet("https://rickandmortyapi.com/api/location/"+p);

        //client
        CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

        //response
        CloseableHttpResponse response = httpClient.execute(request);

        //entity
        HttpEntity entity = response.getEntity();

        //gson
        if (entity!= null){
            String result = EntityUtils.toString(entity);

            Gson gson = new Gson();

            localizacao = gson.fromJson(result, Localizacao.class);

        }
        return localizacao;
    }


    public Episodio getEpisodio(String p) throws IOException {

        Episodio episodio = null;

        //request
        HttpGet request =new HttpGet("https://rickandmortyapi.com/api/episode/"+p);

        //client
        CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

        //response
        CloseableHttpResponse response = httpClient.execute(request);

        //entity
        HttpEntity entity = response.getEntity();

        //gson
        if (entity!= null){
            String result = EntityUtils.toString(entity);

            Gson gson = new Gson();

            episodio = gson.fromJson(result, Episodio.class);

        }
        return episodio;
    }
}
