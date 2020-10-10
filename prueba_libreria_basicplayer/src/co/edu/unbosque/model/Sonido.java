package co.edu.unbosque.model;

import java.io.File;

import javazoom.jlgui.basicplayer.BasicPlayer;

public class Sonido {

	private BasicPlayer player;

	public Sonido() {

		player = new BasicPlayer();
	}

	public void Play() throws Exception {
		player.play();
	}

	public void abrirFichero() throws Exception {
		player.open(new File("./musica/cancion.mp3"));

	}

	public void Pausa() throws Exception {
		player.pause();
	}

	public void Continuar() throws Exception {
		player.resume();
	}

	public void Stop() throws Exception {
		player.stop();
	}

}
