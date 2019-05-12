package ru.ricksanchez;

public class App {
    Client client;
    ConsoleEventLogger eventLogger;

    public static void main(String[] args) {
        App app = new App();

        app.client = new Client("1","John Smith");
        app.eventLogger = new ConsoleEventLogger();

        app.logEnent("Some event for user 1");
    }

    private void logEnent(String msg){
        String message = msg.replaceAll(client.getId(),client.getFullName());
        eventLogger.logEvent(message);
    }
}
