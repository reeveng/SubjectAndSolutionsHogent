package main;

import domain.MultiCastServer;

public class StartupServer {

    public static void main(String[] args) throws java.io.IOException {
        new MultiCastServer().run();
    }
}
