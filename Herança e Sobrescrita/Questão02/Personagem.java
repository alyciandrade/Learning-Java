package Questão02;

public abstract class Personagem {
		
		protected String nome;
		protected int nivel;
		protected int experiencia;
		protected int saude;
		protected int forca;
		protected int inteligencia;
		protected int velocidade;
		
		public Personagem (String nome, int nivel, int experiencia, int saude, int forca, int inteligencia, int velocidade) {
			
			this.nome = nome;
			this.nivel = nivel;
			this.experiencia = experiencia;
			this.saude = saude;
			this.forca = forca;
			this.inteligencia = inteligencia;
			this.velocidade = velocidade;
		}
		
		public void atacar() {
			System.out.println("Ataque Padrão");
		}
		
		public void usarHabilidades() {
			System.out.println("Habilidades Padrão");
		}
		
		public String getNome() {
			return nome;
		}
		public int getNivel() {
			return nivel;
		}
		public int getExperiencia() {
			return experiencia;
		}
		public int getSaude() {
			return saude;
		}
		public int getForca() {
			return forca;
		}
		public int getInteligencia() {
			return inteligencia;
		}
		public int getVelocidade() {
			return velocidade;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public void setNivel(int nivel) {
			this.nivel = nivel;
		}
		public void setExperiencia(int experiencia) {
			this.experiencia = experiencia;
		}
		public void setSaude(int saude) {
			this.saude = saude;
		}
		public void setForca(int forca) {
			this.forca = forca;
		}
		public void setInteligencia(int inteligencia) {
			this.inteligencia = inteligencia;
		}
		public void setVelocidade(int velocidade) {
			this.velocidade = velocidade;
		}	

	}

