package headfirst.designpatterns.proxy.rmi.client;

import headfirst.designpatterns.proxy.rmi.server.MyRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by Jerry on 3/17/16.
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    private void go() {
        try {
            final MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            final String s = service.sayHello();
            System.out.println(s);

        } catch ( NotBoundException e ) {
            e.printStackTrace();
        } catch ( MalformedURLException e ) {
            e.printStackTrace();
        } catch ( RemoteException e ) {
            e.printStackTrace();
        }
    }
}
