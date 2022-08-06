
# Java Projekt -- Appointments
<hr>

# Java 1
<details closed>
<summery><b>Gesamtübersicht - Java 1</b></summery>
<br>
 <br>
 
Im Rahmen des Projektes Java 1 ist den Studierenden des 3. Fachsemesters der Angewandten Informatik die Aufgabe gestellt worden die bis dato bestehende App der Fachhochschule Erfurt, die in der bisherigen Funktionalität und Benutzerfreundlichkeit nicht wenige Wünsche offen lässt, nachzubilden, sowie zu verbessern und ggf. zu erweitern. 
<br>
Dafür wurden 2 Teams gebildet, die konkurrierend jeweils ein gemeinsames Projekt erarbeiten.
<br>
Einzelne Bestandteile dieses Projekts wurden in sog. Services, 7 insgesamt, aufgeteilt, die jeweils kleineren Gruppen zugewiesen wurden. Diese hatten jeweils die Aufgabe u.a. die Logik und das Datenmodell für eine Java-basierte Serveranwendung (Service) zu entwickeln.

Unsere Gruppe war für den Service Appointments zuständig.
<br>
Arbeitskürzel des Serviceteils des Gesamtprojekts:
## WS2021_Java_Team_1_Service_6_Appointments

---
# Allgemeine Projektübersicht
## Projektteam
* * Jonas Helmboldt
* * Stephan Teichmüller
* * Nadine Hütter
* * Artur Jadranski
---
<br>
 

<details closed>
<summary><b>Anforderungsbeschreibung</b></summary>
<br>
Die bestehende Art und Weise des Terminplans soll in diesem Projekt neu ausgearbeiteten und ersetzt werden. Geplant ist ein allgemeiner Terminplan zum Anzeigen, Erstellen, sowie Bearbeiten von Terminen. Mitarbeiter in der Rolle des Terminerstellers sollen Termine erstellen können und diese veröffentlichen. Darüber hinaus soll bei Erstellung dem Termin eine Auswahl an Studenten zugeordnet werden. Die hier partizipierenden Studenten sollen dann über den Termin mit einer Nachricht informiert werden können. Die Bearbeitung der eigens erstellten Termine soll Fähigkeit des Terminerstellers sein. Ebenso soll nur der Terminersteller einen Termin löschen können.
<br><br>

Die Studenten wiederrum müssen nach den relevanten Terminen suchen, die erstellten relevanten Termine sehen, diese filtern und sortieren können. Bei Bedarf sollen sie auch über einen Termin bei Veröffentlichung informiert werden. 
<br>
<hr>

* Mitarbeiter sollen Termine erstellen können
* Mitarbeiter sollen Termine veröffentlichen können
* Mitarbeiter sollen Termine bearbeiten können
* Mitarbeiter sollen Termine löschen können
* Terminen wird bei Erstellung eine Wiederholrate zugeordnet
* Terminen wird bei Erstellung ein Veranstaltungsort zugeordnet
* Terminen wird bei Erstellung bei Bedarf eine Liste an partizipierenden Studenten zugeordnet
* Studenten können sich alle bestehenden relevanten Termine/Veranstaltungen ihrer Fakultät/Fachrichtung anzeigen lassen
* Studenten können sich alle relevanten Informationen und Zeiträume ihres Semesters anzeigen lassen
* Studenten können Termine nach Datum, Fakultät, Campus und Ersteller sortieren 
* Studenten können Termine nach Datum, Fakultät, Campus, Ersteller, Terminname filtern 
<br>
</details>
 
<details closed>
<summary><b>Aufsetzung und Nutzung des Programms</b></summary>
<br>
Da der Projektumfang sich zuerst auf die Datenstruktur und Logik des Services beschränkt, existieren sowohl keine reale Datenbank, als auch eine interaktive Benutzeroberfläche jeglicher Art. 
Die Fähigkeit und die Notwendigkeit einer Aufsetzung des Programms wird Teil von Java 2 sein.
<br>
Eine Möglichkeit der Interaktion wird ebenfalls Teil von Java 2 werden.
</details>

 
<details closed>
<summary><b>Diagramme</b></summary>
<br>
Hier sind zusammengefasst alle bisher erstellten relevanten Diagramme und Schemata, sowie die vorhergehenden Entwürfe.

## UC
![UC](https://raw.githubusercontent.com/fh-erfurt/WS2021_Java_Team_1_Service_6_Appointments/main/doc/documentation/pictures/UC_Terminverwaltung%20-%20v1.png)
<br>
Im ersten Entwurf wurde sich auf die notwendigsten Funktionalitäten beschränkt, die für die Realisierung des Gesamtprojekts sinnvoll wären. Eine grundlegende Terminverwaltung, die im vollen Umfang einem erstellenden Mitarbeiter zugeordnet wird, erschien als notwendig. Darüber hinaus war auch Teil des Entwurfsprozesses die Überlegung, dass eine Art rudimentäres Rechtesystem existieren könne. Hier gäbe es die Möglichkeit die Erstellung und sonstige Verwaltung eines Termins explizit nur Mitarbeitern zuzuordnen. Zusätzlich sollte ein Benutzer sich die bestehenden Termine anzeigen lassen können.
<br>
══════════════════════════════════════════════════
<br><br>
![UC](https://raw.githubusercontent.com/fh-erfurt/WS2021_Java_Team_1_Service_6_Appointments/main/doc/documentation/pictures/UC_Terminverwaltung%20-%20v2.png)
<br>
Im Hinblick auf den Projektumfang und die erarbeiteten Entwürfe anderer Services wurde die Realisierung des Service Appointments mit den hier gezeigten Fähigkeiten realisiert. Grundlegend existieren zwei große Rollen. Ein Benutzer, dies sind Studenten. Sowie Mitarbeiter, zu diesen zählen auch Professoren. Teil der Mitarbeiter sind ebenfalls Terminersteller, die einen Termin erstellen und löschen können. Zudem können Termine angesehen und sortiert/gefiltert werden können. Benutzer können wiederum nur Termine ansehen, jedoch nicht erstellen oder löschen.
<br>
══════════════════════════════════════════════════
<br><br>
![UC](https://raw.githubusercontent.com/fh-erfurt/WS2021_Java_Team_1_Service_6_Appointments/main/doc/documentation/pictures/UC%20final.png)
<br>
Dies ist das finale Use Case des Service Appointments. <br>
Benutzer und Mitarbeiter sind vorerst über eine gemeinsame, Rolle in ihren Berechtigungen, vereinigt.
<br>
══════════════════════════════════════════════════
<br><br>
## UML 
![UC](https://raw.githubusercontent.com/fh-erfurt/WS2021_Java_Team_1_Service_6_Appointments/main/doc/documentation/pictures/UML%20-%201.png)
<br>
Dies ist der Erste Entwurf einer Prüfungsan- und abmeldung.
<br>
══════════════════════════════════════════════════
<br><br>

![UC]( https://raw.githubusercontent.com/fh-erfurt/WS2021_Java_Team_1_Service_6_Appointments/main/doc/documentation/pictures/UML%20-%202.png)
<br>
Erste Überlegung zu Eingrenzung der Termine u.a. mit Studienganginformationen.
<br>
══════════════════════════════════════════════════
<br><br>

## Klassenmodelle
![CLASS](https://raw.githubusercontent.com/fh-erfurt/WS2021_Java_Team_1_Service_6_Appointments/main/doc/documentation/pictures/Klassenmodell%20-%20Entwurf.png)
<br>
Dies ist der ausgearbeitete Entwurf des Klassenmodells mit den zu implementierenden Funktionen und Klassen. 
<br>
══════════════════════════════════════════════════
<br><br>

![CLASS](https://raw.githubusercontent.com/fh-erfurt/WS2021_Java_Team_1_Service_6_Appointments/main/doc/documentation/pictures/expected%20from%20persons.png)
<br>
Hier wird beschreiben, welche relevanten Informationen unser Service Appointments vom Service Persons entgegennehmen soll. Da dies ein Entwurf ist und nicht final, haben wir uns auf die Realisierung unseres Services auf grundlegendste und relevanteste Informationen begrenzt.
<br>
══════════════════════════════════════════════════
<br><br>


![CLASS](https://raw.githubusercontent.com/fh-erfurt/WS2021_Java_Team_1_Service_6_Appointments/main/doc/documentation/pictures/Klassenmodell%20-%20final.png)
<br>
Das hier vorliegende Klassenmodell entspricht der finalen Form.
<br>
══════════════════════════════════════════════════
<br><br>

   </details>
   
 
<details closed>
<summary><b>Ideensammlung und Meilensteine</b></summary>
<br>
Die Arbeit am Projekt kann in 3 grundlegende Abschnitte eingeteilt werden:
<br />

* Entwurfsphase
* Ausbau-/Erweiterungsphase
* Finalisierungsphase

 
### Entwurfsphase
* Erarbeitung des Projekts geplant methodisch wöchentlich durchgeführt
* Sammlung erster Projektideen
* Überlegung des Funktionsumfangs
* Aufteilung Rollen in Student <=> Mitarbeiter
* Überlegung relevanter Zuarbeiten von / zu anderen Services
* Schnittstelle zu Datenbank (provisorisch wird im Weiteren ausgetauscht) 
* Checkfuntion ob Termin vorhanden
* Erstellung einer Präsentation über unsere Gruppe und den zu erstellenden Service 
* erste Präsentation

### Ausbau-/Erweiterungsphase
* Erstellung eines Repository in Github, sowie erste Konfiguration
* erstes Erstellen einer Ausgangssituation:
    * Überlegung: die Art und Weise der Terminverwaltung:
        * benötigte weitere grobe Differenzierung Studenten <=> Dozenten
        * Termine sollten nur von Dozenten erstellt, bearbeitet und gelöscht werden können
        * Dozenten sollten auch nur ihre eigenen Termine verwalten können
        * eine Art Superrolle für allgemeine Organisation der Termine könnte ebenfalls im weiteren Projektverlauf implementiert werden
        * Studenten sollen allgemein nur für sie relevanten Termine angezeigt werden
        * Möglichkeit der Terminsuche soll auf alle Termine ausgeweitet werden 
* Erstellung erster Entwürfe zum Use Case 

* Erste Überlegungen zum Klassenmodell
* Erste Überlegungen zu Funktionalitäten:
* Bereitstellung des Appointment-Interfaces mit grundlegenden Funktionalitäten
* Termine ausgeben / exportieren
* Termine filtern und sortieren
* Ausarbeitung benötigter Informationen für das Anlegen von Terminen aus anderen Services
* Standort (Campus)
* Betreffende Fakultät (Faculty)
* Ersteller (Mitarbeiter) verknüpfen mit >Persons<

### Finalisierungsphase 
* Erstellung einer gemeinsamen Rolle >Creator<
* Zusammenführung der Berechtigungen und Fähigkeiten
* zweite Präsentation der gesammelten Ideen
* weitere Ausarbeitung der geplanten Funktionen
* Klassenmodelle sind erstellt
* Ordnerstruktur implementiert
* Funktionalitäten erstellt und getestet
* Beginn der Implementierung
* erneute Absprachen mit anderen Services
* Erstellung und Implementierung von Tests
* Fehlerbehebung

</details>

 
<details closed>
<summary><b>Verwendete Programme</b></summary>
 <br>
 
* [Intellij](https://www.jetbrains.com/de-de/idea/ "Intellij") - IDE für Java
* [draw.io](https://draw.io/ " draw.io ") - für Diagramme
* [SharePoint]( https://www.microsoft.com/de-de/microsoft-365/sharepoint/collaboration " SharePoint ") - vorläufige Dokumentation, Präsentationen & Veranschaulichung, Projektplanung und Aufgabenverteilung
* [Github](https://github.com/ "Github") – Versionskontrolle, Projektplanung und Aufgabenverteilung
* [Discord](https://discord.com/ "Discord") - Kommunikationsmittel

</details>

 </details>
 



# Java 2
<details closed>
<summery><b>Gesamtübersicht - Java 2</b></summery>
<br>
 <br>
Im Rahmen des Projektes Java 2 ist den Studierenden des 4. Fachsemesters der Angewandten Informatik die Aufgabe gestellt worden, das zuvor erstellte Projekt aus Java 1 zu erweitern und zu korigieren, in welchem die bis dato bestehende App der Fachhochschule Erfurt die in der bisherigen Funktionalität und Benutzerfreundlichkeit nicht wenige Wünsche offen lässt, nachzubilden, sowie zu verbessern und ggf. zu erweitern.
<br>
Einzelne Bestandteile dieses Projekts wurden in sog. Services, 7 insgesamt, aufgeteilt, die jeweils kleineren Gruppen zugewiesen wurden.

Dafür wurde das bestehende Team aus Java 1 beibehalten, die Services wurden allerdings voneinander getrennt, wodurch keine Schnittstellen zu anderen Services mehr benötigt wurden.
<br>


Unsere Gruppe war für den Service Appointments zuständig.
<br>
Arbeitskürzel des Serviceteils des Gesamtprojekts:
## WS2021_Java_Team_1_Service_6_Appointments
---
# Allgemeine Projektübersicht
## Projektteam
* * Jonas Helmboldt
* * Stephan Teichmüller
* * Nadine Hütter
* * Artur Jadranski
---
<br>


<details closed>
<summary><b>Anforderungsbeschreibung</b></summary>
<br>
Die bestehende Art und Weise des Terminplans soll in diesem Projekt neu ausgearbeiteten und ersetzt werden. Geplant ist ein allgemeiner Terminplan zum Anzeigen, Erstellen, sowie Bearbeiten von Terminen. Mitarbeiter in der Rolle des Terminerstellers sollen Termine erstellen können und diese veröffentlichen. Darüber hinaus soll bei Erstellung dem Termin eine Auswahl an Studenten zugeordnet werden. Die hier partizipierenden Studenten sollen dann über den Termin mit einer Nachricht informiert werden können. Die Bearbeitung der eigens erstellten Termine soll Fähigkeit des Terminerstellers sein. Ebenso soll nur der Terminersteller einen Termin löschen können.
<br><br>

Die Studenten wiederrum müssen nach den relevanten Terminen suchen, die erstellten relevanten Termine sehen, diese filtern und sortieren können. Bei Bedarf sollen sie auch über einen Termin bei Veröffentlichung informiert werden.
<br>
<hr>

* Benutzer sollen Termine erstellen können
* Benutzer sollen Termine veröffentlichen können
* Benutzer sollen Termine bearbeiten können
* Benutzer sollen Termine löschen können
* Terminen wird bei Erstellung eine Wiederholrate zugeordnet
* Terminen wird bei Erstellung ein Veranstaltungsort zugeordnet
* Terminen wird bei Erstellung bei Bedarf eine Liste an partizipierenden Benutzer zugeordnet
* Benutzer können sich alle bestehenden relevanten Termine/Veranstaltungen ihrer Fakultät/Fachrichtung anzeigen lassen
* Benutzer können sich alle relevanten Informationen und Zeiträume ihres Semesters anzeigen lassen
* Benutzer können Termine nach Datum, Fakultät, Campus und Ersteller sortieren
* Benutzer können Termine nach Datum, Fakultät, Campus, Ersteller, Terminname filtern
* Die Daten sollen in einer Datenbank untergespeichert werden
* Die Funktionalitäten sollen über eine Desktopaplikation zugänglich sein
  <br>


</details>

<details closed>
<summary><b>Meilensteine</b></summary>

<br>
 
<b>Korrekturphase</b><br>
<b>Ausbau-/Erweiterungsphase</b><br>
<b>Finalisierungsphase</b><br>


### Korrekturphase
* Ist-Zustand des bestehenden Projekts durchschauen
* Überarbeitung und Anpassung des aus Java 1 bestehenden Klassendiagramms
* Überarbeitung der Herangehensweise an das Projekt im Hinblick auf den Wegfall der benötigten Schnittstellen zu / von anderen Services
* Streichung / Überarbeitung der bestehenden Interfaces, sowie ihre Funktionalitäten
* Korrektur Code-Dokumentation und Übersetzung in englische Sprache
* Anpassung 
* MAIN-Package: models umbenannt
* fixed JPA-Import
* AppointmentInterface - mit zugehörigen Klassen
  * packages angepasst
  * umbenannt
 
* sorting + searching in utils package korrigiert
  * FindBy und SortBy auf static gesetzt
 
* storage package erstellt und befüllt


### Ausbau-/Erweiterungsphase
* Überlegung Ertellung erster Konzepte zu Datenbanktabellen
* Überlegung Aufbau- Klassen und Datenbanktabellen
* Händisches Aufzeigen der Beziehungen (Zeichnung) zwischen den möglichen Datenbanktabellen und deren Relationen
* Größtenteils festlegen der möglichen Datenbanktabellen:
  Große Liste mit allen Personen, die jeweils in **students** und (*z.B.) **Mitarbeiter** aufgespalten wird. Diese sollen jeweils von Persons ihre Daten erben
* Eine große Termintabelle soll erstellt werden.
 Termintabelle soll über eindeutige Bezeichner mit z.B. students oder Mitarbeiter in eine Relation über eine Zwischentabelle zusammengebracht werden.
 **Students** = Matr.Nr
 **Mitarbeiter** = z.B. Kürzel
* erste Tests mit Docker
* Ausbau POM.xml bezüglich Plugins und dependencies
* storage- core package
  * zusätzliche DAOs hinzugefügt
* Data controller umgeformt zu RepositoryFactory
  * erweitert um repository-Attribut
  * erweitert um GET-Methoden im Repository
* neue Konstruktoren hinzugefügt und bestehende erweitert
  * siehe RepositoryImpl
  * DataProvider.createTestData
* bisherigen storage controller gelöscht
* Repository hinzugefügt
  * 1 Interface pro Modellklasse
  * RepositoryImpl implementiert alle Interfaces
* Erstellung der Schnittstelle für die Webapplikation
* base resource package hinzugefügt
* beschränkt auf 1 Ressource / Modell
  * mit CRUD Operationen
  * zusätzliche Interface-Funktionalitäten hinzugefügt
* request.http via REST implementiert
* Entfernen bestehender Docker-Komponenten


### Finalisierungsphase
* bugfixing
* Generierung von Testdaten
* Finalisierung von unit-Tests
* Filterung nach Appointment gefixt


</details>


<details closed>
<summary><b>Verwendete Programme</b></summary>
 <br>

* [Intellij](https://www.jetbrains.com/de-de/idea/ "Intellij") - IDE für Java
* [draw.io](https://draw.io/ " draw.io ") - für Diagramme
* [SharePoint]( https://www.microsoft.com/de-de/microsoft-365/sharepoint/collaboration " SharePoint ") - vorläufige Dokumentation, Präsentationen & Veranschaulichung, Projektplanung und Aufgabenverteilung
* [Github](https://github.com/ "Github") – Versionskontrolle, Projektplanung und Aufgabenverteilung
* [Discord](https://discord.com/ "Discord") - Kommunikationsmittel
* [Whatsapp](https://www.whatsapp.com/ "Whatsapp") - Kommunikationsmittel
* [Postman](https://www.postman.com/ "Postman") - API Plattform zum bauen und verwenden von APIs
* [Docker](https://www.docker.com/ "Docker") - Software zur Isolierung von Anwendungen mit Hilfe von Containervirtualisierung.
</details>

<details closed>
<summary>Lessons Learned</summary>
 
* IDEs und Arbeitsumgebungen müssen von Anfang an korrekt funktionieren und zugänglich sein
* Projektdokumentation muss in Zukunft strikter gehandhabt werden. Nötige Schritte müssen schriftlich festgehalten werden, um Übersicht über das Projekt zu behalten
 
* Erstellung realistischer Meilensteine, die in regelmäßigen Abständen eingebracht werden, muss besser umgesetzt werden.
* Aufgabenverteilung und -abarbeitung muss basierend auf den Meilensteinen eindeutiger umgesetzt werden. 



</details>
</details>
