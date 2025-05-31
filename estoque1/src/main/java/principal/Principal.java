package principal;

import java.util.ArrayList;
import visao.FrmTelaInicial;
import  modelo.Produtos;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produtos> estoque = new ArrayList<>();
        FrmTelaInicial objetotela = new FrmTelaInicial (estoque);
        objetotela.setVisible(true); 
    }
}