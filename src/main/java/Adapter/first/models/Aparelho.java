package Adapter.first.models;

import Adapter.first.interfaces.TomadaAdapter;

public class Aparelho {

    private TomadaAdapter tomadaAdapter;

    public Aparelho(TomadaAdapter tomadaAdapter) {
        this.tomadaAdapter = tomadaAdapter;
    }

    public void fornecer(){
        this.tomadaAdapter.fornecer();
    }
}
