package com.piaget;

public class Main {

    public static void main(String[] args) {

        ManipuladorDeImagens manipuladorDeImagens;

        // Manipulador Imagens testes

        //ImagemACores tomEJerry = new ImagemACores("C:\\Users\\Joao Espada\\Documents\\GitHub\\Projecto_POO\\imagens\\tomjerrypng.png");
        //ImagemACores bugsBunny = new ImagemACores("C:\\Users\\Joao Espada\\Documents\\GitHub\\Projecto_POO\\imagens\\bugsBunny.png");
        //ImagemACores Jerry = new ImagemACores("C:\\Users\\Joao Espada\\Documents\\GitHub\\Projecto_POO\\imagens\\jerry.png");

        //ImagemACores tomEJerryReduzido = ManipuladorDeImagens.reduzImagem(tomEJerry, 2);
        //ImagemACores bugsBunnyReduzido = ManipuladorDeImagens.reduzImagem(bugsBunny, 5);
        //ImagemACores bugsBunnyPixel = ManipuladorDeImagens.pixelizaImagem(bugsBunny, 3);
        //ImagemACores tomEJerryPixel = ManipuladorDeImagens.pixelizaImagem(tomEJerry, 2);
        //ImagemACores JerryAumentado = ManipuladorDeImagens.aumentaImagem(Jerry);
        //ImagemACores bugsBunnyReduzido = ManipuladorDeImagens.pixelizaImagem(tomEJerry, 2);

        // ImagemComEtiqueta testes

        ImagemComEtiqueta imagemEtiqueta = new ImagemComEtiqueta("C:\\Users\\Joao Espada\\Documents\\GitHub\\Projecto_POO\\imagens\\jerry.png", "rato");
        ImagemComEtiqueta imagemEtiqueta2 = new ImagemComEtiqueta("C:\\Users\\Joao Espada\\Documents\\GitHub\\Projecto_POO\\imagens\\tomjerrypng.png", "gato e rato");
        ImagemComEtiqueta imagemEtiqueta3 = new ImagemComEtiqueta("C:\\Users\\Joao Espada\\Documents\\GitHub\\Projecto_POO\\imagens\\bugsbunny.png", "coelho");
        ImagemComEtiqueta imagemEtiqueta4 = new ImagemComEtiqueta("C:\\Users\\Joao Espada\\Documents\\GitHub\\Projecto_POO\\imagens\\tomjerry_aumenta.png", "gato e rato aumentado");

        Album album = new Album();

        album.adicionaImagem(imagemEtiqueta);
        //album.mostrarDados(imagemEtiqueta);
        album.adicionaImagem(imagemEtiqueta2);
        //album.mostrarDados(imagemEtiqueta2);
        album.adicionaImagem(imagemEtiqueta3);
        album.adicionaImagem(imagemEtiqueta4);
        //album.pixelizarImagemExibicao();
        album.imagemExibicao();
        album.imagemSeguinte();
        System.out.println("**************************************************************************************************");
        album.imagemExibicao();
        album.imagemSeguinte();
        album.imagemSeguinte();
        System.out.println("**************************************************************************************************");
        album.imagemExibicao();
        System.out.println("**************************************************************************************************");
        album.imagemAnterior();
        album.imagemExibicao();
        System.out.println("**************************************************************************************************");
        album.aumentarImagemExibicao();
        System.out.println("**************************************************************************************************");
        album.pixelizarImagemExibicao();
        System.out.println("**************************************************************************************************");
        album.mostrarAlbum();
        System.out.println("**************************************************************************************************");
    }
}
