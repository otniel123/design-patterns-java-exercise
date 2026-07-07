package Adapter.first;

import Adapter.first.interfaces.TomadaAdapter;
import Adapter.first.models.Aparelho;
import Adapter.first.models.TomadaAmericana;
import Adapter.first.models.TomadaBrasileira;

public class Main {
    public static void main(String[] args) {
        TomadaAdapter tomadaAdapterB = new TomadaBrasileira();
        TomadaAdapter tomadaAdapterA = new TomadaAmericana();

        Aparelho aparelhoB = new Aparelho(tomadaAdapterB);
        Aparelho aparelhoA = new Aparelho(tomadaAdapterA);

        aparelhoA.fornecer();
        aparelhoB.fornecer();
    }
}
