package _02_Structural.Flyweight.Stage_01;

import java.util.HashMap;
import java.util.Map;

public class BandFactory {

    private final static Map<String, Band> bands = new HashMap<>();

    public Band getBand(String bandName) {
        Band band = bands.get(bandName);

        if (band == null) {
            switch (bandName) {
                case "Metallica":
                    band = new BandMetallicaImpl();
                    break;
                case "Slayer":
                    band = new BandSlayerImpl();
                    break;
                case "Kreator":
                   band = new BandKreatorImpl();
                   break;
            }
            bands.put(bandName, band);
        }
        return band;
    }
}
