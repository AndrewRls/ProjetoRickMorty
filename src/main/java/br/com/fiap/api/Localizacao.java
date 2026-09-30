package br.com.fiap.api;

public class Localizacao {


    /*
  "name": "Earth (Fascist Shrimp Dimension)",
  "type": "Planet",
  "dimension": "Fascist Shrimp Dimension",
  */
    private String name;
    private String type;
    private String dimension;

    public Localizacao() {
    }

    public Localizacao(String name, String type, String dimension) {
        this.name = name;
        this.type = type;
        this.dimension = dimension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "\n\n== Localização ==" +
                "\nNome = " + name +
                "\nTipo = " + type +
                "\nDimensão = " + dimension;
    }
}
