import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Service {

    public Server() throws RemoteException {
        super();
    }

    // a method which prints a file based on the filename and specified printer
    public String print(String filename, String printer) throws RemoteException {
        return "From server: printing the file";
    }


    // method used to list the print queue for a given printer
    public String queue(String printer) throws RemoteException {
        return "From server: Returning the list";
    }


    // method for moving the job to the top of the queue
    public String topQueue(String printer, int job) throws RemoteException {
        return "From server: Moved to top of queue";
    }


    // method for starting the server
    public String start() throws RemoteException {
        return "From server: Server started";
    }


    // method for stopping the server
    public String stop() throws RemoteException {
        return "From server: Server stopped";
    }


    // method for restarting the server
    public String restart() throws RemoteException  {
        return "From server: Server restarts";
    }


    // method for showing the status of the printer
    public String status(String printer) throws RemoteException {
        // returns the status of printer on user's display
        return "From server: Shows the status of the printer";
    }


    // method for printing the value of the parameter
    public String readConfig(String parameter) throws RemoteException {
        return "From server: printing parameter value";
    }


    // method for editing the value
    public String setConfig(String parameter, String value) throws RemoteException {
        return "From server: changing the value";
    }
}