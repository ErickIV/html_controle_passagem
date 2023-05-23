package com.entidade;

import java.rmi.Remote;

public interface ControladorVoo extends Remote {

    public int verificarStatus(String codigoVoo, int numeroAssento) throws java.rmi.RemoteException;

    public int marcarVoo(String codigoVoo, int numeroAssento) throws java.rmi.RemoteException;

}