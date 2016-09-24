package com.example.lesson1.practice.transport;

/**
 * Created by troy379 on 23.09.16.
 */
public abstract class Transport implements IMovable {

    protected boolean isPrepared;
    private Transport.Listener transportListener;

    public abstract void makeSound();

    protected boolean isPrepared() {
        return isPrepared;
    }

    public void setTransportListener(Listener transportListener) {
        this.transportListener = transportListener;
    }

    protected void notifyTransportStopped() {
        if (transportListener != null) {
            transportListener.onStopped();
        }
    }

    public interface Listener {
        void onStopped();
    }

    public class TransportException extends RuntimeException {

        public TransportException(String message) {
            super(message);
        }
    }
}
