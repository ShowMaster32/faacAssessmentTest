# faacAssessmentTest

Progetto faac colloquio.

## Pre-requisiti

Quali software l'utente ha bisogno di installare in anticipo e come farlo.

- Java Development Kit (JDK) versione 18
- Maven

## Come installare il progetto

1. Clona il repository del progetto o scarica il codice sorgente come un archivio ZIP.
2. Naviga alla cartella del progetto (dove si trova il file `pom.xml`).
3. Avvia l'applicazione con il comando `mvn spring-boot:run`.

## Come visualizzare l'anteprima del progetto

Una volta avviata l'applicazione, è possibile visualizzare un'anteprima del progetto seguendo questi passaggi:

1. Connettersi a `localhost:8080` sul tuo browser.
2. Fai clic sul link "login" che si trova in alto a destra della pagina.
3. Inserisci le credenziali dell'utente. Puoi creare un nuovo utente inserendo un nome utente e una password che non sono stati utilizzati in precedenza. Dopo aver effettuato l'accesso, le nuove credenziali dell'utente verranno salvate automaticamente nel database.
4. Se l'utente è un amministratore, verrà riconosciuto come tale nella piattaforma attraverso lettura dati dal db.
