import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Wifi {
    private static final int MAX_CONNECTIONS = 8;
    private final Semaphore semaphore = new Semaphore(MAX_CONNECTIONS, true);
    private final Queue<Device> waitingQueue = new LinkedList<>();

    public synchronized void connect(Device device) throws InterruptedException {
        if (semaphore.tryAcquire()) { // équivalent a Semaphore.down()
            System.out.println(device.getName() + " est connecté au WiFi.");
        } else {
            System.out.println(device.getName() + " est en attente...");
            waitingQueue.add(device);
        }
    }

    public synchronized void disconnect(Device device) {
        System.out.println(device.getName() + " s'est déconnecté.");
        semaphore.release();

        if (!waitingQueue.isEmpty()) {
            Device nextDevice = waitingQueue.poll();
            new Thread(() -> {
                try {
                    connect(nextDevice);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}