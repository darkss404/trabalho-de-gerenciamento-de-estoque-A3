package principal;

import java.util.ArrayList;
import visao.FrmTelaInicial;
import  modelo.Produto;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<>();
        FrmTelaInicial objetotela = new FrmTelaInicial (estoque);
        objetotela.setVisible(true); 
    }
}