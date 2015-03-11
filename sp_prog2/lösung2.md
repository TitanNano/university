# Studienleistung Programmieren 2 Teil 2

##Recherche und Definitionen

###1) Welche Aussagen sind richtig?
zutreffende aussage: 
- Ein Objekt ist ein Exemplar einer Klasse.
- Ein Objekt ist eine Instanz einer Klasse.
- Eine Unterklasse erbt alle Eigenschaften ihrer Oberklasse.

###2) Definieren Sie: Konstruktor und Dekonstruktor, überladen von Methoden, Generalisierung und Spezialisierung (von Klassen).
**Konstruktoren und Destruktoren**  
Als Konstruktoren und Destruktoren (aus dem Englischen auch kurz ctor bzw. dtor genannt) werden in der Programmierung spezielle Prozeduren bzw. 
Methoden bezeichnet, die beim Erzeugen und Auflösen von Objekten und Variablen aufgerufen werden. 
Konstruktoren können mit Parametern versehen werden, während Destruktoren in der Regel argumentfrei sind.

**Überladen von Methoden**  
Überladen bedeutet, dass derselbe Methodenname mehrfach in einer Klasse verwendet werden kann. Das Überladen findet häufig bei Konstruktoren oder Konvertierungsmethoden statt.
Damit das Überladen möglich ist, muss wenigstens eine der folgenden Vorraussetzungen erfüllt sein:

1. Der Datentyp mindestens eines Übergabeparameters ist anders als in den übrigen gleichnamen Methoden.
2. Die Anzahl der Übergabeparameter ist unterschiedlich.

**Generalisierung und Spezialisierung**
Java bietet die Möglichkeit, eine komplette Vererbungshierarchie zwischen Klassen nachzubilden. Leitet man also eine Klasse von einer anderen ab, so erbt die neue Klasse alle Elemente und Fähigkeiten ihrer Vaterklasse. Diese können wiederum in der neuen Klasse ergänzt und erweitert werden.

Erweitert eine abgeleitete Klasse die Fähigkeiten und Elemente ihrer Vaterklasse, so spricht man auch von der Spezialisierung, da die neue Klasse dem nachgebildeten Realitätsmodell bereits weitaus näher ist. Der umgekehrte Weg von der abgeleiteten Klasse zur Basisklasse hingegen wird als Generalisierung bezeichnet, da dass gesamte nachgebildete Modell nach oben hin verallgemeinert wird. 

###3) Welche Rolle haben Dekonstruktoren in C++, C# und Java?
**Java**  
Sie stellen das Gegenstück zu den Konstruktoren dar. Allerdings übernimmt Java selbständig die gesamte Speicherverwaltung in Form des im Hintergrund laufenden Garbage Collectors, weshalb den Destruktoren in Java eine viel geringere Rolle zukommt.

Der Destruktor wird immer dann ausgeführt, wenn eine Objektreferenz aus dem Speicher entfernt wird und folglich das Objekt abgebaut werden muss. Der Programmierer kann wichtige Bereinigungsaufgaben an eine spezielle Methode übertragen, die den Standarddestruktor überschreibt. Das Überschreiben hat keine schwerwiegende Folgen, da die Destruktormethode ohnehin leer ist.

Syntaktisch ist die Methode exakt vorgeschrieben und muss lediglich in der entsprechenden Klasse nachgebildet werden. 

**C#**  
Destruktoren werden zur Zerstörung von Klasseninstanzen verwendet.

- Destruktoren können nicht in Strukturen definiert werden. sie werden nur mit Klassen verwendet.
- Eine Klasse darf nur einen Destruktor besitzen.
- Destruktoren können nicht vererbt oder überladen werden.
- Destruktoren können nicht aufgerufen werden. Der Aufruf wird automatisch vollzogen.
- Ein Destruktor akzeptiert weder Modifizierer, noch besitzt er Parameter.

**C++**  
Destruktorfunktionen sind das Gegenteil von Konstruktorfunktionen. Sie werden aufgerufen, wenn Objekte zerstört (freigegeben) werden. Legen Sie eine Funktion als Destruktor einer Klasse fest, indem Sie dem Klassennamen eine Tilde (~) voranstellen. Beispielsweise wird der Destruktor für die String-Klasse folgendermaßen deklariert: ~String().

In einer /clr- Kompilierung hat der Destruktor eine besondere Rolle bei der Freigabe verwalteter und nicht verwalteter Ressourcen.

###4) Was bedeuten die Accessorattribute public, private, protected, internal (nur C#) und protected internal (nur C#)?
|         |Eigene Klasse   |Paket-Klasse   |Elternklasse   |Fremde Klasse    |
|---------|----------------|---------------|---------------|-----------------|
|private  |Zugriff erlaubt | 			   |               |                 |
|package  |Zugriff erlaubt |Zugriff erlaubt| 		       |                 |
|protected|Zugriff erlaubt |Zugriff erlaubt|Zugriff erlaubt| 	             |
|public   |Zugriff erlaubt |Zugriff erlaubt|Zugriff erlaubt|Zugriff erlaubt  |

**C#**
**Internal:** Der Zugriff ist auf die aktuelle Assembly begrenzt.  
**protected Internal:** Zugriff wird der aktuellen Assembly oder auf Typen eingeschränkt, die über die Klasse abgeleitet werden. 

##Programmierpraxis
###1) Inhaltlicher Vergleich mit equals
siehe e2 ordner

###2) Implementieren Sie eine Klasse "GeometricalType". Erstellen Sie die Klasse als abstrakte Klasse, denn Instanzen von GeometricalType wird es nicht geben, nur konkrete Punkte und Kreise.
siehe e2 ordner

### 4) Führen Sie noch eine weitere Klasse ein: Rechteck
siehe e2 ordner

### 3) Portieren Sie das Beispiel nach C#.
siehe e3 ordner

##Experimente mit Strings
####Zeigen Sie in einem Beispiel ob sich Strings in C# oder in Java mit == auf inhaltliche Gleichheit prüfen lassen. Wenn dies in einer Sprache nicht der Fall ist, was muss dann getan werden, um Strings inhaltlich zu vergleichen?
Ja die operatoren sind werte vergleichend. Da es sich bei Java Strings jedoch um Objekte handelt können die Strings nicht verglichen werden, da der Operator lediglich die speicher referenzen auf die jeweiligen String Objekte vergleicht.

##Experimente mit Arrays
Arrays können mit der Objektmethode clone() kopiert werden.

###1) Was passiert bei Referenztypen?
Das Array wird kopiert, jedoch zeigen die neuen Zeiger auf die selben Speicherstellen wie die ursprünglichen.

###2) Vergleichen Sie nun die Arrays mit euqals(). Frage: Ist die korrekte Arbeitsweise abhängig davon, ob Sie in der Point Klasse die Methode equals() überschrieben haben (siehe Aufgabe oben)?
Nein es spielt absoult keine rolle. Dazu ist anzumerken das die equals methode für Arrays nicht implementiert wurde und direkt von der Object Klasse vererbt wurde. Möchte man zwei Arrays auf inhaltliche gleichheit überprüfen so sollte man die methode Array.equals(array1, array2) verwenden.

###3) Gegeben sein ein zweidimensionales (unregelmäßiges) Array. Die erste Dimension steht für die Layer im Zeichenprogramm. Jeder Layer kann verschiedene geometrische Objekte beinhalten. Lässt sich ein solches mehrdimensionales Array klonen? Handelt es sich bei der Kopie um eine "echte" Kopie (siehe oben)?
Das hängt von der klon Funktion ab. die standart klon function von arrays `array.clone()` wird lediglich eine kopie des obersten arrays erzeugen. Die kopie ver weist dann auf die selben sub arrays wie das Original. Möchte man eine "echte" Kopie so muss eine deep-copy Funktion geschrieben werden.
