package Observer;

public class ModulStareJoc implements IStareConexiuneListener{
    @Override
    public void conexiunePierduta(String timestamp) {
        System.out.println("Salvare stare joc ");
    }

    @Override
    public void conexiuneActiva() {
        System.out.println("Restaurare stare joc si reluare joc");
    }
}
