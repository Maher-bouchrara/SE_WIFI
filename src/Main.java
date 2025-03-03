public class Main {
    public static void main(String[] args) {
        Wifi hotspot = new Wifi();

        for (int i = 1; i <= 12; i++) { // 12 appareils pour tester la file d'attente
            new Device("Appareil " + i, hotspot).start();
        }
    }
}
