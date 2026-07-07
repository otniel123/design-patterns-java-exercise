package Adapter.first.models;

import Adapter.first.interfaces.TomadaAdapter;

public class TomadaBrasileira implements TomadaAdapter {
    @Override
    public void fornecer() {
        System.out.println("Estamos fornecendo 110v da tomada brasileira");
    }
}
