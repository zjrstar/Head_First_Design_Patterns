package headfirst.designpatterns.proxy.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Jerry on 3/17/16.
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}

