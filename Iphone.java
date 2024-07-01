package Iphone;

public class Iphone {
	public static void main(String[] args) {
		
        
        Imusic imusic = new Imusic();
        imusic.artista = "Justin Bieber";
        imusic.musica = "Somebody";
        imusic.album = "Justin essentials";
		imusic.tocar();
        
    
        
        Icall icall = new Icall();
        icall.contato = "Giulianna";
        icall.numero = "2299864829";
		icall.ligar();
        
        
        Safari safari = new Safari();
        safari.pagina = "Instagram";
        safari.novapagina = "Facebook";
		safari.exibirPagina();
    }
}

