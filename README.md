Synchronisation de Spot Wi-Fi avec Semaphore en Java
Description
Ce projet démontre comment gérer l'accès simultané de plusieurs appareils à un spot Wi-Fi en utilisant la synchronisation par sémaphore en Java. L'objectif est de simuler comment plusieurs appareils peuvent se connecter au spot Wi-Fi de manière ordonnée, en veillant à ce qu'il n'y ait pas plus d'appareils que la capacité du spot Wi-Fi. Cela est réalisé en utilisant la classe Semaphore de Java pour contrôler l'accès à cette ressource partagée.

Fonctionnalités
Synchronisation basée sur le sémaphore : Garantit qu'un nombre spécifique d'appareils peuvent se connecter au spot Wi-Fi à tout moment.
Simulation des requêtes des appareils : Les appareils demandent l'accès au Wi-Fi et doivent attendre si le spot est plein.
Simulation en temps réel : Les appareils obtiennent immédiatement l'accès au Wi-Fi ou sont bloqués jusqu'à ce qu'une place se libère.
Concurrence : Plusieurs threads sont utilisés pour simuler des appareils tentant de se connecter au spot Wi-Fi simultanément.
Installation
Clonez le repository :

bash
Copier
Modifier
git clone https://github.com/yourusername/wifi-spot-synchronization.git
cd wifi-spot-synchronization
Compilez le projet :

bash
Copier
Modifier
javac *.java
Exécutez le programme :

bash
Copier
Modifier
java WiFiSpotSimulation
Utilisation
Capacité du Spot Wi-Fi : Le nombre maximal d'appareils qui peuvent se connecter simultanément au spot Wi-Fi est défini en utilisant le sémaphore. Par exemple, définir un Semaphore(5) permet à 5 appareils de se connecter en même temps.

Simulation des appareils : Chaque appareil est simulé comme un thread tentant de se connecter au spot Wi-Fi. Si le spot est plein, l'appareil attend qu'une place se libère.

Logs : Le programme consigne chaque tentative de connexion ou de déconnexion des appareils, fournissant ainsi une mise à jour en temps réel de la simulation.

Exemple de sortie
arduino
Copier
Modifier
Appareil 1 est connecté au WiFi.
Appareil 12 est connecté au WiFi.
Appareil 11 est connecté au WiFi.
Appareil 10 est connecté au WiFi.
Appareil 9 est connecté au WiFi.
Appareil 8 est connecté au WiFi.
Appareil 7 est connecté au WiFi.
Appareil 6 est connecté au WiFi.
Appareil 5 est en attente...
Appareil 4 est en attente...
Appareil 3 est en attente...
Appareil 2 est en attente...
Appareil 8 s'est déconnecté.
Appareil 5 est connecté au WiFi.
Appareil 3 s'est déconnecté.
Appareil 4 est connecté au WiFi.
Appareil 5 s'est déconnecté.
Appareil 3 est connecté au WiFi.
Appareil 1 s'est déconnecté.
Appareil 2 est connecté au WiFi.
Appareil 9 s'est déconnecté.
Appareil 7 s'est déconnecté.
Appareil 12 s'est déconnecté.
Appareil 2 s'est déconnecté.
Appareil 11 s'est déconnecté.
Appareil 4 s'est déconnecté.
Appareil 10 s'est déconnecté.
Appareil 6 s'est déconnecté.
