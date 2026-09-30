package br.com.fiap.api;

public class Personagem {

    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;

    public Personagem() {
    }

    public Personagem(String name, String status, String species, String type, String gender) {
        this.name = name;
        this.status = status;
        this.species = species;
        this.type = type;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\n\n== Personagem ==" +
                "\nNome = " + name +
                "\nStatus = " + status +
                "\nEspécie = " + species +
                "\nTipo = " + type +
                "\nGênero = " + gender;
    }
}

