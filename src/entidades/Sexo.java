package entidades;

public class Sexo {

    public Sexo(String Sexo) {
        this.Sexo = Sexo;
    }
    private int idsexo;
    private String Sexo;

    public int getIdsexo() {
        return idsexo;
    }

    public void setIdsexo(int idsexo) {
        this.idsexo = idsexo;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
}
