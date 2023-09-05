package desafio_diagramacao_de_classes_do_iPhone;

//iPhone
public abstract class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{


	public class App {
			
			//Interface ReprodutorMusica
			 public void reproduzirMusica(String musica) {
			     System.out.println("Reproduzindo uma musica");
			 }
			 
			 public void pausarMusica() {
			     System.out.println("Musica pausada");
			 }
			
			 public void ajustarVolume(int volume) {
			     System.out.println("Aumentando volume: "+10);
			 }
			
			 // Interface AparelhoTelefonico
			 public void fazerChamada(String numero) {
			     System.out.println("Fazendo uma chamada");
			 }
			
			 public void receberChamada(String numero) {
			     System.out.println("Recebendo uma chamada");
			 }
			
			 public void encerrarChamada() {
			     System.out.println("Encerrando chamada");
			 }
			
			 // Interface NavegadorInternet
			 public void abrirURL(String url) {
			     System.out.println("Abrindo uma pagina na internet");
			 }
			
			 public void navegarPagina(String pagina) {
			     System.out.println("Acessando email na internet");
			 }
			
			 public void fecharNavegador() {
			     System.out.println("Fechando o navegador");
			 }
		}
	}
	