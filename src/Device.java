public class Device extends Thread {
    private final Wifi hotspot;

    public Device(String name, Wifi hotspot) {
        super(name);
        this.hotspot = hotspot;
    }

    @Override
    public void run() {
        try {
            hotspot.connect(this);
            Thread.sleep((long) (Math.random() * 5000)); // Simule l'utilisation du WiFi
            hotspot.disconnect(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
