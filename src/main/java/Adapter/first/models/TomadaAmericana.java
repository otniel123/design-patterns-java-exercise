package Adapter.first.models;

import Adapter.first.interfaces.TomadaAdapter;

public class TomadaAmericana implements TomadaAdapter {
    @Override
    public void fornecer() {
        System.out.println("Estamos fornecendo 220v da tomada americana");
    }
}
