package KimElena.hw7;

public enum Size {
    XXS ("Детский размер", 32),
    XS ("Взрослый размер", 34),
    S ("Взрослый размер", 36),
    M ("Взрослый размер", 38),
    L ("Взрослый размер", 40);

    String description;
    int euroSize;

    Size(String s, int i) {
        this.description = s;
        this.euroSize = i;
    }
    public String getDescription() {
        return description;
    }
    public int getEuroSize() {
        return euroSize;
    }
}

