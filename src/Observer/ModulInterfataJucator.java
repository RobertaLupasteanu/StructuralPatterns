package Observer;

public class ModulInterfataJucator implements IStareConexiuneListener{
    @Override
    public void conexiunePierduta(String timestamp) {
        System.out.println("Alerta conexiune pierduta la "+timestamp);
    }

    @Override
    public void conexiuneActiva() {
        System.out.println("Conexiune activa");
    }
}
