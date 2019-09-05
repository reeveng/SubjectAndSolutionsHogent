package main;

import domain.MultiCastClient;
import java.io.*;

public class StartUpClient {

    public static void main(String[] args) throws IOException {
        new MultiCastClient().run();
    }

}
