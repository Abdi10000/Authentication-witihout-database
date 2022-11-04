// Created by group ?
// Course: Data Security
// Autumn 2022

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


// client part
public class Client {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {


        // From server 5099 in ApplicationServer.java file
        Service service = (Service) Naming.lookup("rmi://localhost:3000/printer");


        System.out.println("--- " + "You got access to the printer");
        System.out.println();


        // testing the program using the methods/functions from the Server.java file
        System.out.println("--- " + service.print("picture.pdf", "X2"));
        System.out.println("--- " + service.queue("X2"));
        System.out.println("--- " + service.topQueue("X2", 2));
        System.out.println("--- " + service.start());
        System.out.println("--- " + service.stop());
        System.out.println("--- " + service.restart());
        System.out.println("--- " + service.status("printer status"));
        System.out.println("--- " + service.readConfig("token"));
        System.out.println("--- " + service.setConfig("map", "treasure"));
    }
}