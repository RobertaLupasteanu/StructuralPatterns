package Observer;

public class TestObserver {
    public static void main(String[] args){

        //Observer
        ModulMonitorizareConexiune monitorizareConexiune=
                new ModulMonitorizareConexiune();
        monitorizareConexiune.notificareConexiunePierduta();
        System.out.println("----------------------");
        ModulInterfataJucator interfata = new ModulInterfataJucator();
        ModulStareJoc stareJoc = new ModulStareJoc();

        monitorizareConexiune.registerObservator(interfata);
        monitorizareConexiune.registerObservator(stareJoc);
        monitorizareConexiune.notificareConexiunePierduta();

        System.out.println("----------------------");
        monitorizareConexiune.unregisterObservator(stareJoc);
        monitorizareConexiune.notificareConexiuneActiva();

        //exemplu observator anonim
        monitorizareConexiune.registerObservator(new IStareConexiuneListener() {
            @Override
            public void conexiunePierduta(String timestamp) {
                System.out.println("Aprinde led rosu");
            }

            @Override
            public void conexiuneActiva() {
                System.out.println("Aprinde led verde");
            }
        });

        monitorizareConexiune.notificareConexiunePierduta();


    }
}
