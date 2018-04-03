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

        while (!"E1".equals(Origem) && !"E2".equals(Origem) && !"E3".equals(Origem) && !"E4".equals(Origem) && !"E5".equals(Origem) && !"E6".equals(Origem) && !"E7".equals(Origem) && !"E8".equals(Origem) && !"E9".equals(Origem) && !"E10".equals(Origem) && !"E11".equals(Origem) && !"E12".equals(Origem) && !"E13".equals(Origem) && !"E14".equals(Origem)) {
            JOptionPane.showMessageDialog(null, "Origem Invalida");
            Origem = JOptionPane.showInputDialog(null, "Digite Novamente Onde vc Esta?");
        }

        Destino = JOptionPane.showInputDialog(null, "Onde vc quer ir?");

        while (!"E1".equals(Destino) && !"E2".equals(Destino) && !"E3".equals(Destino) && !"E4".equals(Destino) && !"E5".equals(Destino) && !"E6".equals(Destino) && !"E7".equals(Destino) && !"E8".equals(Destino) && !"E9".equals(Destino) && !"E10".equals(Destino) && !"E11".equals(Destino) && !"E12".equals(Destino) && !"E13".equals(Destino) && !"E14".equals(Destino)) {
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

    public void eOnze() {

    }

    public void eDoze() {

    }

    public void eTreze() {

    }

    public void eQuatoze() {

    }
}
