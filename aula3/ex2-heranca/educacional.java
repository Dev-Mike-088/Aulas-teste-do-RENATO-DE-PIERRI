class conteudo{
    public String titulo;
    public int duracaoMinutos;

    public conteudo(String titulo, int duracaoMinutos){
            this.titulo = titulo;
            this.duracaoMinutos = duracaoMinutos;
    }

    public void exibirResumo(){
            System.out.println("Dados do conteúdo");
            System.out.println("Conteúdo: " + titulo);
            System.out.println("duração em minutos: " + duracaoMinutos);
    }
}

class videoAula extends conteudo{
    public String plataforma;
    
    
    public videoAula(String titulo, int duracaoMinutos, String plataforma){
        super(titulo, duracaoMinutos);
        this.plataforma = plataforma;
    }

    public void reproduzirVideo(){
        System.out.println("Aula rolando em vídeo!!!!");
    }
}

class podcast extends conteudo{
    public String apresentador;

    public podcast(String titulo, int duracaoMinutos, String apresentador){
        super(titulo, duracaoMinutos);
        this.apresentador = apresentador;
    }
    
    public void ouvirPodcast(){
        System.out.println("Ouvindo a aula na forma de podcast!!!");
    }
}