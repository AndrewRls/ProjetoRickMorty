package br.com.fiap.api;

public class Episodio {

    /*
  "name": "A Rickconvenient Mort",
  "air_date": "July 4, 2021",
  "episode": "S05E03"
 */
    private String name;
    private String air_date;
    private String episode;

    public Episodio() {
    }

    public Episodio(String name, String air_date, String episode) {
        this.name = name;
        this.air_date = air_date;
        this.episode = episode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAir_date() {
        return air_date;
    }

    public void setAir_date(String air_date) {
        this.air_date = air_date;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    @Override
    public String toString() {
        return "\n\n== Episódio ==" +
                "\nNome = " + name +
                "\nData de publicação = " + air_date +
                "\nEpisódio (temporada/episódio) = " + episode;
    }
}
