package org.timgroup.dojo;

import fj.data.Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Files {
    public static Stream<String> readLinesFrom(String fileName) {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.class.getResourceAsStream("/" + fileName)));
        final List<String> result = new ArrayList<String>();

        try {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Stream.iterableStream(result);
    }
}
