package com.UTN.clases;

import java.util.concurrent.Semaphore;

public class Connection {

    private static Connection instance = new Connection();

    private int connections = 0;

    private Semaphore sem = new Semaphore(10, true); //cantidad de permisos, true = respeta orden de ingreso

    private Connection () {

    }

    public static Connection getInstance(){
        return instance;
    }

    private void doConnect(){
        synchronized (this){
            connections++;
            System.out.println("Conexiones actuales: " + connections);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this){
            connections--;
            System.out.println("Disconnected");
        }
    }

    public void connect(){
        try {
            sem.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            doConnect();
        }
        finally {
            sem.release();
        }
    }
}
