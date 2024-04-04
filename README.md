# faacAssessmentTest

Progetto faac colloquio.

## Pre-requisiti

Quali software l'utente ha bisogno di installare in anticipo e come farlo.

- Java Development Kit (JDK) versione 18
- Maven

## Dipendenze principali e le loro funzioni

Ecco l'elenco delle principali dipendenze del progetto e le loro versioni, insieme a una breve descrizione su cosa fanno:

- **Spring Boot 3.2.4**: Fornisce l'automazione della configurazione e dell'implementazione per applicazioni Spring.
- **Spring Modulith 1.1.3**: Aiuta a modularizzare applicazioni Spring per una migliore progettazione del software.
- **Springdoc OpenApi UI 1.7.0**: Genera automaticamente la documentazione dell'API per applicazioni web Spring.
- **Spring Data JPA**: Fornisce un modo semplice per fare il mapping oggetto-relazionale dei dati. Nel progetto, è utilizzato per l'entità `User` e il repository `UserRepository`.
- **Lombok 1.18.32**: Riduce il codice ripetitivo in Java, per esempio generando automaticamente getter, setter e altri metodi comuni.
- **Jakarta XML Bind API 4.0.1 & Jakarta EE API 11.0.0-M1**: Forniscono l'API per JAXB e l'intero ambiente Jakarta EE rispettivamente.
- **Hibernate Core 6.4.4.Final**: Fornisce un framework per mappare oggetti Java a database relazionali (ORM).

## Come installare il progetto

1. Clona il repository del progetto o scarica il codice sorgente come un archivio ZIP.
2. Naviga alla cartella del progetto (dove si trova il file `pom.xml`).
3. Avvia l'applicazione con il comando `mvn spring-boot:run`.

## Documentazione API

Per vedere la documentazione dell'API, avvia l'applicazione e visita `http://localhost:8080/swagger-ui.html`. Questa documentazione generata automaticamente elencherà e descriverà tutti gli endpoints API esposti dall'applicazione.

## Java ORM con Spring Data JPA

Questo progetto utilizza Java ORM tramite il modulo Spring Data JPA. Le classi di modello (come `User`) rappresentano le entità di dominio e vengono mappate direttamente alle tabelle del database. Il progetto utilizza repository (come `UserRepository`) che estendono l'interfaccia JpaRepository per fornire funzionalità CRUD automatiche senza richiedere un'implementazione manuale.