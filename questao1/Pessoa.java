import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.text.html.HTMLDocument.RunElement;

public class Pessoa {
	private String nome;
	private String pai;
	private String mae;
	
	public Pessoa(String nome, String pai, String mae) { 
	      this.nome = nome;
	      this.pai = pai;
	      this.mae = mae;
	   }
	public Pessoa(String nome) { 
		 this.nome = nome; 
	   }
	
	public void SetNome(String nome) {
		this.nome = nome;
	}

	public void SetPai(String nome) {
		this.pai = nome;
	}

	public void SetMae(String nome) {
		this.mae = nome;
	}
	
	public String GetNome() {
		return (this.nome);
	}

	public String GetPai() {
		return (this.pai);
	}
	
	public String GetMae() {
		return (this.mae);
	}
	
	public void Verifica(Pessoa p) {
		if(this.pai == p.pai || this.mae == p.mae){
			System.out.println("São irmãos!");
		} else {
			System.out.println("Não são irmãos!");
		}
	}
	
	public void VerificaAntecessor(Pessoa p) {
		if(p.nome == this.pai || p.nome == this.mae) {
			System.out.println("É antecessor!");
		} else {
			System.out.println("Não é antecessor!");
		}
	}
}

