package org.timgroup.dojo;

import fj.data.Stream;

public class WeatherMunging {
    private final Stream<String> lines;

    public WeatherMunging(Stream<String> lines) {
        this.lines = lines;
    }

    public int dayWithTheSmallestTemperatureSpread() {
        return 0;
    }
}
