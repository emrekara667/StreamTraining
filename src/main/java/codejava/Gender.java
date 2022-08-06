package codejava;

public enum Gender {
    MALE("male"),
    FEMALE("female");

    private String info;

    Gender(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return info;
    }
}
