package org.timgroup.dojo;

import fj.data.Stream;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.timgroup.dojo.Files.readLinesFrom;

public class FootballMungingTest {

    @Test
    public void teamWithSmallestDifferenceBetweenForAndAgainstIsAstonVilla() {
        Stream<String> footballLines = readLinesFrom("football.dat");
        assertThat(new FootballMunging(footballLines).teamWithSmallestDifferenceBetweenForAndAgainst(), is("Aston_Villa"));
    }
}
