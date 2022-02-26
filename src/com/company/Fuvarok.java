package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Fuvarok {

    private List<Fuvar> fuvarLista;

    public Fuvarok(String fileName) {
        fuvarLista = new LinkedList<>();
        try {
            FileReader fr = new FileReader(fileName);

            BufferedReader br = new BufferedReader(fr);
            br.readLine();
            String line = br.readLine();
            while (line != null) {
                fuvarLista.add(new Fuvar(line));
                line = br.readLine();
            }
            fr.close();
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Fuvarok{" +
                "fuvarLista=" + fuvarLista +
                '}';
    }
}
