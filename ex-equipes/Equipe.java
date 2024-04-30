import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;

public class Equipe extends WindowAdapter implements ActionListener {
    private Frame janela;
	private Panel painelEquipe, painelBotoes;
	private Label lCodigo, lNome, lHomens, lMulheres, lTotal;
	private TextField tCodigo, tNome, tHomens, tMulheres, tTotal;
	private Button bNovo, bSalva, bExclui, bProximo, bAnterior;
	private Vector vEquipes;
	private int posicao;
  	//Método Construtor Criacao de vetor, frame
	public Equipe(){
		vEquipes =new Vector();
		janela = new Frame();
		janela.setTitle("Agenda");
		janela.setSize(370,225);
		janela.setBackground(new Color(10,10,10));
		janela.setLayout(null);
	 	janela.addWindowListener(this);

		painelEquipe = new Panel();
		painelEquipe.setBackground(new Color(140,20,50));
		painelEquipe.setSize(350, 150);
		painelEquipe.setLocation(10,30);
		painelEquipe.setLayout(null);

		painelBotoes = new Panel();
		painelBotoes.setBackground(new Color(20,50,100));
		painelBotoes.setSize(350,34);
		painelBotoes.setLocation(10,181);
		painelBotoes.setLayout(new FlowLayout());

		lCodigo = new Label("Codigo:");
		lNome = new Label("Nome:");
		lHomens = new Label("Quantidade Homens:");
		lMulheres = new Label("Quantidade Mulheres:");
		lTotal = new Label("Total da Equipe:");

		//Método Construtor Criacao de TextFields
		tCodigo = new TextField(10);
		tNome = new TextField(45);
		tHomens = new TextField(10);
		tMulheres = new TextField(10);
		tTotal = new TextField(10);

		lCodigo.setBounds(10,15,50,13);
		lCodigo.setForeground(Color.WHITE);
		tCodigo.setBounds(70,12,50,19);

		lNome.setBounds(10,37,50,13);
		lNome.setForeground(Color.WHITE);
		tNome.setBounds(70,34,240,19);

		lHomens.setBounds(10,59,120,13);
		lHomens.setForeground(Color.WHITE);
		tHomens.setBounds(140,56,170,19);

		lMulheres.setBounds(10,83,120,13);
		lMulheres.setForeground(Color.WHITE);
		tMulheres.setBounds(140,80,170,19);

		lTotal.setBounds(10,107,120,13);
		lTotal.setForeground(Color.WHITE);
		tTotal.setBounds(140,104,170,19);

		painelEquipe.add(lCodigo);
		painelEquipe.add(tCodigo);
		painelEquipe.add(lNome);
		painelEquipe.add(tNome);
		painelEquipe.add(lHomens);
		painelEquipe.add(tHomens);
		painelEquipe.add(lMulheres);
		painelEquipe.add(tMulheres);
		painelEquipe.add(lTotal);
		painelEquipe.add(tTotal);

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

		painelBotoes.add(bNovo);
		painelBotoes.add(bSalva);
		painelBotoes.add(bExclui);
		painelBotoes.add(bProximo);
		painelBotoes.add(bAnterior);

		janela.add(painelEquipe);
		janela.add(painelBotoes);

		bExclui.setEnabled(false);
		bAnterior.setEnabled(false);
		bProximo.setEnabled(false);
	}

	public void setCodigo(String codigo) {
		tCodigo.setText(codigo);
	}

	public void setNome(String nome) {
		tNome.setText(nome);
	}

	public void setHomens(String homens) {
		tHomens.setText(homens);
	}

	public void setMulheres(String mulheres) {
		tMulheres.setText(mulheres);
	}

	public void setTotal(String total) {
		tTotal.setText(total);
	}

	public void setMenuBar(MenuBar mb)	{
		janela.setMenuBar(mb);
	}

	public String getCodigo() {
		return tCodigo.getText();
	}

	public String getNome() {
		return tNome.getText();
	}

	public String getHomens() {
		return tHomens.getText();
	}

	public String getMulheres() {
		return tMulheres.getText();
	}

	public String getTotal() {
		return tTotal.getText();
	}

	public void actionPerformed(ActionEvent e)	{
		Button b=(Button)e.getSource();
		if (b==bNovo)          this.botaoNovo();
		else if (b==bSalva)	   this.botaoSalva();
		else if (b==bExclui)   this.botaoExclui();
		else if (b==bAnterior) this.botaoAnterior();
		else if (b==bProximo)  this.botaoProximo();
	}

	void botaoNovo() {
		this.limpaDados();
		bExclui.setEnabled(false);
		bAnterior.setEnabled(false);
		bProximo.setEnabled(false);
		tCodigo.requestFocus();
	}

	public void botaoSalva() {
		vEquipes.addElement(new Dados(getCodigo(), getNome(), getHomens(), getMulheres(), getTotal()));
		bExclui.setEnabled(true);
		bAnterior.setEnabled(true);
		bProximo.setEnabled(true);
	}

	void botaoExclui() {
		if(!vEquipes.isEmpty())
			vEquipes.removeElementAt(posicao);
			limpaDados();
		}

	void botaoAnterior() {
		if(!vEquipes.isEmpty()){
			bProximo.setEnabled(true);
			--posicao;
			if(posicao<=0) {
				posicao=0;
				bAnterior.setEnabled(false);
			}
			this.obterDadosEquipes(posicao);
		}
	}

	void botaoProximo() {
		if(!vEquipes.isEmpty()){
			bAnterior.setEnabled(true);
			++posicao;
			if(posicao>=vEquipes.size()-1) {
				posicao=vEquipes.size()-1;
				bProximo.setEnabled(false);
			}
			this.obterDadosEquipes(posicao);
		}
	}

	public void limpaDados()	{
		this.setCodigo("");
		this.setNome("");
		this.setHomens("");
		this.setMulheres("");
		this.setTotal("");
	}

	public void obterDadosEquipes(int pos) {
		Dados equipeAtual = (Dados)vEquipes.elementAt(pos);
		this.setCodigo(equipeAtual.getCodigo());
		this.setNome(equipeAtual.getNome());
		this.setHomens(equipeAtual.getHomens());
		this.setMulheres(equipeAtual.getMulheres());
		this.setTotal(equipeAtual.getTotal());
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void mostraJanela(){
		janela.setVisible(true);
	}

    public static void main(String[] args) {
        Equipe equipe = new Equipe();
        equipe.mostraJanela();
    }
}