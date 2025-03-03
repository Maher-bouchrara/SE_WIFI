# Synchronisation de Spot Wi-Fi avec Semaphore en Java

## Description
Ce projet démontre comment gérer l'accès simultané de plusieurs appareils à un spot Wi-Fi en utilisant la **synchronisation par sémaphore** en Java. L'objectif est de simuler comment plusieurs appareils peuvent se connecter au spot Wi-Fi de manière ordonnée, en veillant à ce qu'il n'y ait pas plus d'appareils que la capacité du spot Wi-Fi. Cela est réalisé en utilisant la classe `Semaphore` de Java pour contrôler l'accès à cette ressource partagée.

## Fonctionnalités
- **Synchronisation basée sur le sémaphore** : Garantit qu'un nombre spécifique d'appareils peuvent se connecter au spot Wi-Fi à tout moment.
- **Simulation des requêtes des appareils** : Les appareils demandent l'accès au Wi-Fi et doivent attendre si le spot est plein.
- **Simulation en temps réel** : Les appareils obtiennent immédiatement l'accès au Wi-Fi ou sont bloqués jusqu'à ce qu'une place se libère.
- **Concurrence** : Plusieurs threads sont utilisés pour simuler des appareils tentant de se connecter au spot Wi-Fi simultanément.

