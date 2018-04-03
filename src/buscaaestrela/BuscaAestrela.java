package buscaaestrela;

import javax.swing.JOptionPane;

public class BuscaAestrela {

    String Origem;
    String Destino;

    int SomaTotal = 0;

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Digite a sua Origem e Destino para Tentarmos Encontrar a melhor rota");

        new BuscaAestrela().start();

    }

    public void start() {
        Origem = JOptionPane.showInputDialog(null, "Onde vc esta?");

        while (Origem != "E1" && Origem != "E2" && Origem != "E3" && Origem != "E4" && Origem != "E5" && Origem != "E6" && Origem != "E7" && Origem != "E8" && Origem != "E9" && Origem != "E10" && Origem != "E11") {
            JOptionPane.showMessageDialog(null, "Origem Invalida");
            Origem = JOptionPane.showInputDialog(null, "Digite Novamente Onde vc Esta?");
        }

        Destino = JOptionPane.showInputDialog(null, "Onde vc quer ir?");

        while (Destino != "E1" && Destino != "E2" && Destino != "E3" && Destino != "E4" && Destino != "E5" && Destino != "E6" && Destino != "E7" && Destino != "E8" && Destino != "E9" && Destino != "E10" && Destino != "E11") {
            JOptionPane.showMessageDialog(null, "Destino Invalida");
            Destino = JOptionPane.showInputDialog(null, "Onde vc quer ir?");
        }
    }

    public void eUm() {

    }

    public void eDois() {

    }

    public void eTres() {

    }

    public void eQuatro() {

    }

    public void eCinco() {

    }

    public void eSeis() {

    }

    public void eSete() {

    }

    public void eOito() {

    }

    public void enove() {

    }

    public void eDez() {

    }

    public void eonze() {

    }
}
