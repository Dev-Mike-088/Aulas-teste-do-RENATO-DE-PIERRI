public class Main {
	public static void main(String[] args) {
		videoAula video = new videoAula("Introdução à programação", 45, "YouTube");
		podcast audio = new podcast("Conceitos de orientação a objetos", 30, "Renato de Pierri");

		video.exibirResumo();
		audio.exibirResumo();

		video.reproduzirVideo();
		audio.ouvirPodcast();
	}
}
