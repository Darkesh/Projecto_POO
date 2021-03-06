package com.piaget;

public class ManipuladorDeImagens {

    ImagemACores imagem = new ImagemACores(20, 20);

    // Método para reduzir uma imagem
    public static ImagemACores reduzImagem(ImagemACores imagemAAlterar, int escala) {

        int larguraDaImagemAAlterar = imagemAAlterar.obterLargura();
        int alturaDaImagemAAlterar = imagemAAlterar.obterAltura();

        ImagemACores imagemNova = new ImagemACores(larguraDaImagemAAlterar / escala, alturaDaImagemAAlterar / escala);

        // Imagem 4x4
        //   0      1     2     3
        //0: [0, 0][0, 1][0, 2][0, 3]
        //1: [1, 0][1, 1][1, 2][1, 3]
        //2: [2, 0][2, 1][2, 2][2, 3]
        //3: [3, 0][3, 1][3, 2][3, 3]

        for (int xQuadradoFora = 0; xQuadradoFora < larguraDaImagemAAlterar - escala; xQuadradoFora += escala) {
            for (int yQuadradoFora = 0; yQuadradoFora < alturaDaImagemAAlterar - escala; yQuadradoFora += escala) {

                int acumulaR = 0;
                int acumulaG = 0;
                int acumulaB = 0;

                for (int xQuadradoDentro = xQuadradoFora; xQuadradoDentro < xQuadradoFora + escala; xQuadradoDentro++) {
                    for (int yQuadradoDentro = yQuadradoFora; yQuadradoDentro < yQuadradoFora + escala; yQuadradoDentro++) {
                        Cor corDoPixel = imagemAAlterar.obterCor(xQuadradoDentro, yQuadradoDentro);

                        int r = corDoPixel.obterR();
                        int g = corDoPixel.obterG();
                        int b = corDoPixel.obterB();

                        acumulaR += r;
                        acumulaG += g;
                        acumulaB += b;

                        int mediaR = acumulaR / ((int) Math.pow(escala, 2));
                        int mediaG = acumulaG / ((int) Math.pow(escala, 2));
                        int mediaB = acumulaB / ((int) Math.pow(escala, 2));

                        Cor corNova = new Cor(mediaR, mediaG, mediaB);

                        imagemNova.mudaCor(xQuadradoFora / escala, yQuadradoFora / escala, corNova);
                    }
                }
            }
        }

        imagemNova.escreverParaDisco("C:\\Users\\Joao Espada\\Documents\\GitHub\\Projecto_POO\\imagens\\tomjerry_reduz.png", "png");

        return imagemNova;
    }

    // Método para aumentar uma imagem
    public static ImagemACores aumentaImagem(ImagemACores imagemAAumentar) {

        int larguraDaImagemAAlterar = imagemAAumentar.obterLargura();
        int alturaDaImagemAAlterar = imagemAAumentar.obterAltura();

        ImagemACores imagemMaior = new ImagemACores(larguraDaImagemAAlterar * 3, alturaDaImagemAAlterar * 3);

        for (int xQuadradoDentro = 1; xQuadradoDentro < larguraDaImagemAAlterar - 1; xQuadradoDentro++) {
            for (int yQuadradoDentro = 1; yQuadradoDentro < alturaDaImagemAAlterar - 1; yQuadradoDentro++) {

                int acumulaR = 0;
                int acumulaG = 0;
                int acumulaB = 0;

                for (int xQuadradoFora = xQuadradoDentro - 1; xQuadradoFora <= xQuadradoDentro + 1; xQuadradoFora++) {
                    for (int yQuadradoFora = yQuadradoDentro - 1; yQuadradoFora <= yQuadradoDentro + 1; yQuadradoFora++) {
                        Cor corDoPixel = imagemAAumentar.obterCor(xQuadradoFora, yQuadradoFora);

                        int r = corDoPixel.obterR();
                        int g = corDoPixel.obterG();
                        int b = corDoPixel.obterB();

                        acumulaR += r;
                        acumulaG += g;
                        acumulaB += b;

                    }
                }

                int mediaR = acumulaR / ((int) Math.pow(3, 2));
                int mediaG = acumulaG / ((int) Math.pow(3, 2));
                int mediaB = acumulaB / ((int) Math.pow(3, 2));

                Cor corNova = new Cor(mediaR, mediaG, mediaB);

                for (int x = (xQuadradoDentro + (2 * xQuadradoDentro)); x <= (xQuadradoDentro + (2 * xQuadradoDentro) + 2); x++) {
                    for (int y = (yQuadradoDentro + (2 * yQuadradoDentro)); y <= (yQuadradoDentro + (2 * yQuadradoDentro) + 2); y++) {

                        imagemMaior.mudaCor(x, y, corNova);
                    }
                }
            }
        }

        imagemMaior.escreverParaDisco("C:\\Users\\Joao Espada\\Documents\\GitHub\\Projecto_POO\\imagens\\tomjerry_aumenta.png", "png");

        return imagemMaior;
    }

    // Método para pixelizar uma imagem
    public static ImagemACores pixelizaImagem(ImagemACores imagemAPixelizar, int escala) {
        int largura = imagemAPixelizar.obterLargura();
        int altura = imagemAPixelizar.obterAltura();

        ImagemACores imagemNova = new ImagemACores(largura, altura);

        for (int xQuadradoFora = 0; xQuadradoFora < largura; xQuadradoFora += escala) {
            for (int yQuadradoFora = 0; yQuadradoFora < altura; yQuadradoFora += escala) {

                int acumulaR = 0;
                int acumulaG = 0;
                int acumulaB = 0;

                for (int xQuadradoDentro = xQuadradoFora; xQuadradoDentro < xQuadradoFora + escala; xQuadradoDentro++) {
                    for (int yQuadradoDentro = yQuadradoFora; yQuadradoDentro < yQuadradoFora + escala; yQuadradoDentro++) {
                        Cor corDoPixel = imagemAPixelizar.obterCor(xQuadradoDentro, yQuadradoDentro);

                        int r = corDoPixel.obterR();
                        int g = corDoPixel.obterG();
                        int b = corDoPixel.obterB();

                        acumulaR += r;
                        acumulaG += g;
                        acumulaB += b;

                        int mediaR = acumulaR / ((int) Math.pow(escala, 2));
                        int mediaG = acumulaG / ((int) Math.pow(escala, 2));
                        int mediaB = acumulaB / ((int) Math.pow(escala, 2));

                        Cor corNova = new Cor(mediaR, mediaG, mediaB);

                        imagemNova.mudaCor(xQuadradoDentro, yQuadradoDentro, corNova);
                    }
                }
            }
        }

        imagemNova.escreverParaDisco("C:\\Users\\Joao Espada\\Documents\\GitHub\\Projecto_POO\\imagens\\tomjerry_pixel.png", "png");

        return imagemNova;
    }
}
