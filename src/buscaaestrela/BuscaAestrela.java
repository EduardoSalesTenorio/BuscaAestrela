package buscaaestrela;

import javax.swing.JOptionPane;

public class BuscaAestrela {

    String Origem;
    String Destino;

    int SomaTotal = 0;

    public static void main(String[] args) {

        new BuscaAestrela().start();

    }

    public void start() {
        Origem = JOptionPane.showInputDialog(null, "Onde vc esta?");
        Destino = JOptionPane.showInputDialog(null, "Onde vc quer ir?");

        if (Origem != "E1" || Origem != "E2" || Origem != "E3" || Origem != "E4") {
            JOptionPane.showMessageDialog(null, "Entrada Invalida");
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
