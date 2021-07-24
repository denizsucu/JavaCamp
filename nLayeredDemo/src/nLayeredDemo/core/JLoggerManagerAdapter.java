package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

// Kendi class'ının sonuna Adapter ekleyip class oluşturuyoruz sisteme adapte etmek için.
public class JLoggerManagerAdapter implements LoggerService{

    @Override
    public void logToSystem(String message) {
        JLoggerManager manager = new JLoggerManager();
        manager.log(message);
    }
}
