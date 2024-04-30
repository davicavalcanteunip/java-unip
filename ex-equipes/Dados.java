public class Dados {
    private String codigo;
    private String nome;
    private String homens;
    private String mulheres;
    private String total;

    public Dados( String codigo, String nome, String homens, String mulheres, String total){
        this.codigo=codigo;
        this.nome = nome;
        this.homens = homens;
        this.mulheres = mulheres;
        this.total = total;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public String getHomens() {
        return this.homens;
    }

    public String getMulheres() {
        return this.mulheres;
    }

    public String getTotal() {
        return this.total;
    }
}