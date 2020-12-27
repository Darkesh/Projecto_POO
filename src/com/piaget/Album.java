package com.piaget;

import java.util.ArrayList;
import java.util.List;

public class Album<imagem1> {
    List<ImagemComEtiqueta> asMinhasImagens = new ArrayList<ImagemComEtiqueta>();
    ManipuladorDeImagens manipuladorDeImagens;

    ImagemComEtiqueta imagem1 = new ImagemComEtiqueta("C:\\Users\\Joao Espada\\Documents\\GitHub\\Projecto_POO\\imagens\\jerry.png");

    ImagemComEtiqueta imagem1reduzida = (ImagemComEtiqueta) ManipuladorDeImagens.reduzImagem(imagem1, 2);

    public void addImage (ImagemComEtiqueta imagem1) {
        asMinhasImagens.add(imagem1);
    }

    public void dataImages (){
        String nome = imagem1.nomeImage;
        System.out.println(nome);
    }
}
