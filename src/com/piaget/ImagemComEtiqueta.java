package com.piaget;

public class ImagemComEtiqueta extends ImagemACores {
    private String nomeImagem;
    private int alturaImagem, larguraImagem;
    private String ficheiro;
    private int Exibicao = 0;

    ImagemComEtiqueta(String ficheiro, String nomeImagem) {
        super(ficheiro);
        this.ficheiro = ficheiro;
        this.nomeImagem = nomeImagem;
        this.alturaImagem = obterAltura();
        this.larguraImagem = obterLargura();
    }

    public String getFicheiro() {
        return ficheiro;
    }

    // Método para obter o nome de uma imagem
    public String obterNomeImagem() {
        return nomeImagem;
    }

    // Método para mudar o nome de uma imagem
    public void mudarNomeImagem(String nomeImagem) {
        this.nomeImagem = nomeImagem;
    }

    // Método para obter a altura de uma imagem
    public int getAlturaImagem() {
        return obterAltura();
    }

    // Método para obter a largura de uma imagem
    public int getLarguraImagem() {
        return obterLargura();
    }
}
