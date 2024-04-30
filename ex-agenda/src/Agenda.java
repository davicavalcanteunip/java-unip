import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;

public class Agenda extends WindowAdapter implements ActionListener {
    private Frame janela;
	private Panel painelEndereco,painelBotoes;
	private Label lCodigo, lNome, lEndereco, lFone, lCelular, lSexo, lNacionalidade, lData, lCpf, lEmail, lNumeroRes, lCep, lComplemento;
	private TextField tCodigo, tNome, tEndereco, tFone, tCelular, tNacionalidade, tData, tCpf, tEmail, tNumeroRes, tCep, tComplemento;
	private TextArea tObs;
	private Button bNovo, bSalva,bExclui,bProximo,bAnterior;
	private CheckboxGroup cbgSexo;
	private Checkbox masculino, feminino;
	private Vector vContatos;
	private int posicao;
  	//Método Construtor Criacao de vetor, frame
	public Agenda(){
		vContatos=new Vector();
		janela = new Frame();
		janela.setTitle("Agenda");
		janela.setSize(370,600);
		janela.setBackground(new Color(10,10,10));
		janela.setLayout(null);
	 	janela.addWindowListener(this);

		//Método Construtor Criacao de Painel
		painelEndereco = new Panel();
		painelEndereco.setBackground(new Color(20,50,100));
		painelEndereco.setSize(350, 450);
		painelEndereco.setLocation(10,30);
		painelEndereco.setLayout(null);

		//Método Construtor Criacao de Painel
		painelBotoes = new Panel();
		painelBotoes.setBackground(new Color(20,50,100));
		painelBotoes.setSize(350,34);
		painelBotoes.setLocation(10,500);
		painelBotoes.setLayout(new FlowLayout());

		//Método Construtor Criacao de Labels
		lCodigo = new Label("Codigo:");
		lNome = new Label("Nome:");
		lEndereco = new Label("Endereco:");
		lFone = new Label("Fone:");
		lCelular = new Label("Celular:");
		lSexo = new Label("Sexo:");
		lNacionalidade = new Label("Nacionalidade:");
		lData = new Label("Data de Nascimento:");
		lCpf = new Label("CPF:");
		lEmail = new Label("E-mail:");
		lNumeroRes = new Label("Número Residencial:");
		lCep = new Label("CEP:");
		lComplemento = new Label("Complemento do Endereço:");

		//Método Construtor Criacao de TextFields
		tCodigo = new TextField(10);
		tNome = new TextField(45);
		tEndereco = new TextField(60);
		tFone = new TextField(8);
		tCelular = new TextField(9);
		tNacionalidade = new TextField(20);
		tData = new TextField(15);
		tCpf = new TextField(15);
		tEmail = new TextField(60);
		tNumeroRes = new TextField(5);
		tCep = new TextField(15);
		tComplemento = new TextField(60);

		//Substituicao do item pelo  compomente especificado, na posicao indicada
		lCodigo.setBounds(10,15,50,13);
		tCodigo.setBounds(70,12,50,19);

		lNome.setBounds(10,37,50,13);
		tNome.setBounds(70,34,240,19);

		lEndereco.setBounds(10,59,60,13);
		tEndereco.setBounds(70,56,270,19);

		lFone.setBounds(10,83,60,13);
		tFone.setBounds(70,80,86,19);

		lCelular.setBounds(180,83,50,13);
		tCelular.setBounds(240,80,80,19);

		lSexo.setBounds(10,105,30,13);

		lNacionalidade.setBounds(10, 230, 90, 19);
		tNacionalidade.setBounds(10, 250, 150, 19);

		lData.setBounds(170, 230, 200, 19);
		tData.setBounds(170, 250, 170, 19);

		lCpf.setBounds(10, 280, 80, 19);
		tCpf.setBounds(10, 300, 150, 19);

		lEmail.setBounds(170, 280, 80, 19);
		tEmail.setBounds(170, 300, 170, 19);

		lNumeroRes.setBounds(10, 330, 150, 19);
		tNumeroRes.setBounds(10, 350, 150, 19);

		lCep.setBounds(170, 330, 80, 19);
		tCep.setBounds(170, 350, 170, 19);

		lComplemento.setBounds(10, 380, 300, 19);
		tComplemento.setBounds(10, 400, 330, 19);

		lCodigo.setForeground(Color.WHITE);
		lNome.setForeground(Color.WHITE);
		lEndereco.setForeground(Color.WHITE);
		lFone.setForeground(Color.WHITE);
		lCelular.setForeground(Color.WHITE);
		lSexo.setForeground(Color.WHITE);
		lNacionalidade.setForeground(Color.WHITE);
		lData.setForeground(Color.WHITE);
		lCpf.setForeground(Color.WHITE);
		lEmail.setForeground(Color.WHITE);
		lNumeroRes.setForeground(Color.WHITE);
		lCep.setForeground(Color.WHITE);
		lComplemento.setForeground(Color.WHITE);

		//Método Construtor Criacao de CheckboxGroup
		cbgSexo = new CheckboxGroup();
		masculino = new Checkbox("Masculino",false,cbgSexo);
		feminino = new Checkbox("Feminino",false,cbgSexo);
		masculino.setBounds(70,102,90,19);
		feminino.setBounds(160,102,90,19);
		masculino.setForeground(Color.WHITE);
		feminino.setForeground(Color.WHITE);

		//Método Construtor Criacao de de TextArea
		tObs = new TextArea("",15,90,TextArea.SCROLLBARS_BOTH);
		tObs.setBounds(10,132,330,90);

		//Adiciona no frame painelEndereco os componentes criados
		painelEndereco.add(lCodigo);
		painelEndereco.add(tCodigo);
		painelEndereco.add(lNome);
		painelEndereco.add(tNome);
		painelEndereco.add(lEndereco);
		painelEndereco.add(tEndereco);
		painelEndereco.add(lFone);
		painelEndereco.add(tFone);
		painelEndereco.add(lCelular);
		painelEndereco.add(tCelular);
		painelEndereco.add(lSexo);
		painelEndereco.add(tObs);
		painelEndereco.add(masculino);
		painelEndereco.add(feminino);
		painelEndereco.add(lNacionalidade);
		painelEndereco.add(tNacionalidade);
		painelEndereco.add(lData);
		painelEndereco.add(tData);
		painelEndereco.add(lCpf);
		painelEndereco.add(tCpf);
		painelEndereco.add(lEmail);
		painelEndereco.add(tEmail);
		painelEndereco.add(lNumeroRes);
		painelEndereco.add(tNumeroRes);
		painelEndereco.add(lCep);
		painelEndereco.add(tCep);
		painelEndereco.add(lComplemento);
		painelEndereco.add(tComplemento);

		//Método Construtor Criacao de botoes e ativa o escutator(listener)
		bNovo = new Button("Novo");
		bNovo.addActionListener(this);
		bSalva = new Button("Salva");
		bSalva.addActionListener(this);
		bExclui = new Button("Exclui");
		bExclui.addActionListener(this);
		bProximo=new Button("Próximo");
		bProximo.addActionListener(this);
		bAnterior=new Button("Anterior");
		bAnterior.addActionListener(this);

		//Adiciona no frame painelBotoes os botoes criados
		painelBotoes.add(bNovo);
		painelBotoes.add(bSalva);
		painelBotoes.add(bExclui);
		painelBotoes.add(bProximo);
		painelBotoes.add(bAnterior);

    		//adiciona na Janela os frames
		janela.add(painelEndereco);
		janela.add(painelBotoes);

		//Desabilita os botoes quando inicia o programa
		bExclui.setEnabled(false);
		bAnterior.setEnabled(false);
		bProximo.setEnabled(false);
	}


	//Adiciona o conteudo no vetor(setText)
	public void setNacionalidade(String nacionalidade) {
		tNacionalidade.setText(nacionalidade);
	}

	public void setData(String data) {
		tData.setText(data);
	}

	public void setCpf(String cpf) {
		tCpf.setText(cpf);
	}

	public void setEmail(String email) {
		tEmail.setText(email);
	}

	public void setNumResidencia(String numeroRes) {
		tNumeroRes.setText(numeroRes);
	}

	public void setCep(String cep) {
		tCep.setText(cep);
	}

	public void setCompEnd(String complemento) {
		tComplemento.setText(complemento);
	}

	public void setCodigo(String codigo){
		tCodigo.setText(codigo);
	}
	public void setNome(String nome){
		tNome.setText(nome);
	}
	public void setEndereco(String endereco){
		tEndereco.setText(endereco);
	}
	public void setFone(String fone){
		tFone.setText(fone);
	}
	public void setCelular(String celular){
		tCelular.setText(celular);
	}
	public void setObs(String Obs){
		tObs.setText(Obs);
	}
	public void setSexo(String sexo) {
		if (sexo != null)	{
			if (sexo.equals("F")) feminino.setState(true);
			else if (sexo.equals("M")) masculino.setState(true);
		}
	}
	public void setMenuBar(MenuBar mb)	{
		janela.setMenuBar(mb);
	}

	//Retorna o conteudo(=objeto) que esta no vetor

	public String getNacionalidade() {
		return tNacionalidade.getText();
	}

	public String getData() {
		return tData.getText();
	}

	public String getCpf() {
		return tCpf.getText();
	}

	public String getEmail() {
		return tEmail.getText();
	}

	public String getNumResidencia() {
		return tNumeroRes.getText();
	}

	public String getCep() {
		return tCep.getText();
	}

	public String getCompEnd() {
		return tComplemento.getText();
	}

	public String getCodigo(){
		return tCodigo.getText();
	}

	public String getNome(){
		return tNome.getText();
	}

	public String getEndereco(){
		return tEndereco.getText();
	}

	public String getFone(){
		return tFone.getText();
	}

	public String getCelular(){
		return tCelular.getText();
	}

	public String getObs(){
		return tObs.getText();
	}

	public String getSexo() {
		if (masculino.getState() == true) return "M";
		else if (feminino.getState() == true) return "F";
		else return " ";
	}

	//Verificacao de qual dos botoes foi acionado para chamar os procedimentos devidos
	public void actionPerformed(ActionEvent e)	{
		Button b=(Button)e.getSource();
		if (b==bNovo)          this.botaoNovo();
		else if (b==bSalva)	   this.botaoSalva();
		else if (b==bExclui)   this.botaoExclui();
		else if (b==bAnterior) this.botaoAnterior();
		else if (b==bProximo)  this.botaoProximo();
	}

	//Acao do botao Novo
	void botaoNovo() {
		this.limpaDados();
		bExclui.setEnabled(false);
		bAnterior.setEnabled(false);
		bProximo.setEnabled(false);
		tCodigo.requestFocus();
	}

	//Acao do botao salva
	public void botaoSalva() {
		vContatos.addElement(new Contato(getCodigo(), getNome(), getEndereco(), getFone(), getCelular(), getSexo(), getObs(), getNacionalidade(), getData(), getCpf(), getEmail(), getNumResidencia(), getCep(), getCompEnd()));
		bExclui.setEnabled(true);
		bAnterior.setEnabled(true);
		bProximo.setEnabled(true);
	}

	//Acao do botao Exclui
	void botaoExclui() {
		if(!vContatos.isEmpty())
			vContatos.removeElementAt(posicao);
		}

	//Acao do botao Anterior
	void botaoAnterior() {
		if(!vContatos.isEmpty()){
			bProximo.setEnabled(true);
			--posicao;
			if(posicao<=0) {
				posicao=0;
				bAnterior.setEnabled(false);
			}
			this.obterDadosContatos(posicao);
		}
	}

	//Acao do botao Proximo
	void botaoProximo() {
		if(!vContatos.isEmpty()){
			bAnterior.setEnabled(true);
			++posicao;
			if(posicao>=vContatos.size()-1) {
				posicao=vContatos.size()-1;
				bProximo.setEnabled(false);
			}
			this.obterDadosContatos(posicao);
		}
	}

	//Limpa Campos
	public void limpaDados()	{
		this.setCodigo("");
		this.setNome("");
		this.setEndereco("");
		this.setFone("");
		this.setCelular("");
		this.setObs("");
	}

	//Obtem dados
	public void obterDadosContatos(int pos) {
		Contato contatoAtual=(Contato)vContatos.elementAt(pos);
		this.setCodigo(contatoAtual.getCodigo());
		this.setNome(contatoAtual.getNome());
		this.setEndereco(contatoAtual.getEndereco());
		this.setFone(contatoAtual.getFone());
		this.setCelular(contatoAtual.getCelular());
		this.setSexo(contatoAtual.getSexo());
		this.setObs(contatoAtual.getObs());
		this.setNacionalidade(contatoAtual.getNacionalidade());
		this.setData(contatoAtual.getData());
		this.setCep(contatoAtual.getCep());
		this.setEmail(contatoAtual.getEmail());
		this.setCpf(contatoAtual.getCpf());
		this.setNumResidencia(contatoAtual.getNumResidencia());
		this.setCompEnd(contatoAtual.getCompEnd());
	}

    //fecha janela
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void mostraAgenda(){
		janela.setVisible(true);
	}

    public static void main(String[] args) {
    //Criacao da Agenda
        Agenda agenda = new Agenda();
        agenda.mostraAgenda();
    }
}