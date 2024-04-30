public class Contato {
    private String codigo;
    private String nome;
    private String endereco;
    private String fone;
    private String celular;
    private String sexo;
    private String obs;
    private String nacionalidade;
    private String data;
    private String cpf;
    private String email;
    private String numResidencia;
    private String cep;
    private String compEnd;

    public Contato( String codigo, String nome, String endereco, String fone, String celular, String sexo, String obs, String nacionalidade, String data, String cpf, String email, String numResidencia, String cep, String compEnd){
        this.codigo=codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.fone = fone;
        this.celular = celular;
        this.sexo=sexo;
        this.obs=obs;
        this.nacionalidade = nacionalidade;
        this.data = data;
        this.cpf = cpf;
        this.email = email;
        this.numResidencia = numResidencia;
        this.cep = cep;
        this.compEnd = compEnd;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public String getData() {
        return this.data;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNumResidencia() {
        return this.numResidencia;
    }

    public String getCep() {
        return this.cep;
    }

    public String getCompEnd() {
        return this.compEnd;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public String getFone(){
        return this.fone;
    }

    public String getCelular(){
        return this.celular;
    }

    public String getSexo(){
        return this.sexo;
    }

    public String getObs() {
        return obs;
    }
}
