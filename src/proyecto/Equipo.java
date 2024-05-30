package proyecto;

public class Equipo {
	private String pais;
	private int jugadores;
	private String dt;
	public Equipo() {
		pais="Japon";
		jugadores=6;
		dt="Philippe Blain";
	}
	public Equipo(String a,int b,String c) {
		pais=a;
		jugadores=b;
		dt=c;
	}
	public Equipo(int a,String b) {
		pais="Italia";
		jugadores=a;
		dt=b;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getJugadores() {
		return jugadores;
	}
	public void setJugadores(int jugadores) {
		this.jugadores = jugadores;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}		
	

}
