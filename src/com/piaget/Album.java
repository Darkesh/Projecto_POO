package com.piaget;

import java.util.ArrayList;
import java.util.List;

public class Album {
    ArrayList<ImagemComEtiqueta> asMinhasImagens = new ArrayList<>();

    ManipuladorDeImagens manipuladorDeImagens;

    private int E = 0;

    public List<ImagemComEtiqueta> getImagens(){
        return asMinhasImagens;
    }

    // Método para mostrar os dados de uma imagem
    public void mostrarDados(ImagemComEtiqueta imagemComEtiqueta){
        ImagemComEtiqueta imagemAtual = asMinhasImagens.get(E);
        System.out.print("|| < " + (E+1) + " >: < " + imagemAtual.obterNomeImagem()
                            + " > - [< " + imagemAtual.getLarguraImagem()
                            + " > x < " + imagemAtual.getAlturaImagem() + ">] (E) ||");
    }

    // Método para mostrar os dados da imagem anterior à em exibição
    public void mostrarDadosAnterior(ImagemComEtiqueta imagemComEtiqueta) {
        if(E > 0) {
            ImagemComEtiqueta imagemAtual = asMinhasImagens.get(E-1);
            ManipuladorDeImagens.reduzImagem(imagemAtual, 2);
            ImagemACores altReduzida = ManipuladorDeImagens.reduzImagem(imagemAtual, 2);
            System.out.print("|| < " + (E) + " >: < " + imagemAtual.obterNomeImagem()
                                + " > - [< " + altReduzida.obterLargura()
                                + " > x < " + altReduzida.obterAltura() + ">] ");
        }else {
            System.out.println(" Não existem imagens anteriores!");
        }
    }

    // Método para mostrar os dados da imagem seguinte à em exibição
    public void mostrarDadosSeguinte(ImagemComEtiqueta imagemComEtiqueta) {
        if(E < asMinhasImagens.size() - 1) {
            ImagemComEtiqueta imagemAtual = asMinhasImagens.get(E+1);
            ManipuladorDeImagens.reduzImagem(imagemAtual, 2);
            ImagemACores altReduzida = ManipuladorDeImagens.reduzImagem(imagemAtual, 2);
            System.out.println(" < " + (E+2) + " >: < " + imagemAtual.obterNomeImagem()
                                + " > - [< " + altReduzida.obterLargura()
                                + " > x < " + altReduzida.obterAltura() + ">] ||");
        }else {
            System.out.println(" Não existem imagens seguintes!");
        }
    }

    // Método para adicionar uma imagem à lista de imagens com etiqueta
    public void adicionaImagem(ImagemComEtiqueta imagemAAdicionar) {
        asMinhasImagens.add(imagemAAdicionar);
    }

    // Método para mostrar os dados da imagem em exibição, da imagem anterior e da imagem seguinte
    public void imagemExibicao() {
        ImagemComEtiqueta imagemAtual = asMinhasImagens.get(E);
        mostrarDadosAnterior(imagemAtual);
        mostrarDados(imagemAtual);
        mostrarDadosSeguinte(imagemAtual);
    }

    // Método para mudar a imagem em exibição para a imagem seguinte
    public void imagemSeguinte() {
        if(E == asMinhasImagens.size()){
            System.out.println("Está na última imagem!");
        }else {
            E++;
        }
    }

    // Método para mudar a imagem em exibição para a imagem anterior
    public void imagemAnterior() {
        if(E == 0){
            System.out.println("Está na primeira imagem!");
        }else {
            E--;
        }
    }

    // Método para reduzir para metade da imagem anterior à que está em exibição
    public void reduzirAnterior() {
        ImagemComEtiqueta imagemAtual = asMinhasImagens.get(E--);
        ManipuladorDeImagens.reduzImagem(imagemAtual, 2);
        ImagemACores altReduzida = ManipuladorDeImagens.reduzImagem(imagemAtual, 2);
    }

    // Método para reduzir para metade da imagem seguinte à que está em exibição
    public void reduzirSeguinte() {
        ImagemComEtiqueta imagemAtual = asMinhasImagens.get(E++);
        ManipuladorDeImagens.reduzImagem(imagemAtual, 2);
        ImagemACores altReduzida = ManipuladorDeImagens.reduzImagem(imagemAtual, 2);
    }

    // Método para aumentar a imagem em exibição
    public void aumentarImagemExibicao(){
        ImagemComEtiqueta imagemAtual = asMinhasImagens.get(E);
        mostrarDadosAnterior(imagemAtual);
        ManipuladorDeImagens.aumentaImagem(imagemAtual);
        ImagemACores altAumentada = ManipuladorDeImagens.aumentaImagem(imagemAtual);
        System.out.print("|| < " + (E+1) + " >: < " + imagemAtual.obterNomeImagem()
                + " > - [< " + altAumentada.obterLargura()
                + " > x < " + altAumentada.obterAltura() + ">] (E) ||");
        mostrarDadosSeguinte(imagemAtual);
    }

    // Método para pixelizar a imagem em exibição
    public void pixelizarImagemExibicao(){
        ImagemComEtiqueta imagemAtual = asMinhasImagens.get(E);
        mostrarDadosAnterior(imagemAtual);
        ManipuladorDeImagens.pixelizaImagem(imagemAtual, 2);
        ImagemACores altPixelizada = ManipuladorDeImagens.pixelizaImagem(imagemAtual, 2);
        System.out.print("|| < " + (E+1) + " >: < " + imagemAtual.obterNomeImagem()
                + " > - [< " + altPixelizada.obterLargura()
                + " > x < " + altPixelizada.obterAltura() + ">] (E) ||");
        mostrarDadosSeguinte(imagemAtual);
    }

    public int getE () {
        return E;
    }

}
