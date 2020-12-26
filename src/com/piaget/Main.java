package com.piaget;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ManipuladorDeImagens manipuladorDeImagens;

        ImagemACores tomEJerry = new ImagemACores("C:\\Users\\Joao Espada\\Documents\\GitHub\\Projecto_POO\\imagens\\tomjerrypng.png");
        ImagemACores bugsBunny = new ImagemACores("C:\\Users\\Joao Espada\\Documents\\GitHub\\Projecto_POO\\imagens\\bugsBunny.png");
        ImagemACores Jerry = new ImagemACores("C:\\Users\\Joao Espada\\Documents\\GitHub\\Projecto_POO\\imagens\\jerry.png");

        ImagemACores tomEJerryReduzido = ManipuladorDeImagens.reduzImagem(tomEJerry, 2);
        ImagemACores bugsBunnyReduzido = ManipuladorDeImagens.reduzImagem(bugsBunny, 3);
        //ImagemACores bugsBunnyPixel = ManipuladorDeImagens.pixelizaImagem(bugsBunny, 3);
        ImagemACores tomEJerryPixel = ManipuladorDeImagens.pixelizaImagem(tomEJerry, 2);
        ImagemACores JerryAumentado = ManipuladorDeImagens.aumentaImagem(Jerry);
    }
}
