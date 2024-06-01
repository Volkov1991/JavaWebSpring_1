package org.example;

public class Main {
    static int tSize = 64;
    static int port = 1234;

    public static void main(String[] args) {
        Server server = new Server(tSize, port);
        server.start();
    }
}