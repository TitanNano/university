Jovan Gerodetti - 18.02.2015 - Lösung Algorithmen und Datenstrukturen Aufgabenblatt1


###Aufgabe 1
####a) Wenden Sie diesen Algorithmus auf folgenden Paare von Zahlen an und notieren Sie dabei alle Zwischenschritte:
```
a=6, b=15
b>a => b <- b-a (15-6) b = 9
b>a => b <- b-a (9-6) b = 3
a>b => a <- a-b (6-3) a = 3

ggT <- 3


a=11, b=3
a>b => a <- a-b (11 - 3) a = 8
a>b => a <- a-b (8-3) a = 5
a>b => a <- a-b (5-3) a = 2
b>a => b <- b-a (3-2) b = 1
a>b => a <- a-b (2-1) a = 1

ggT <- 1


a=12, b=4
a>b => a <- a-b (12-4) a = 8
a>b => a <- a-b (8-4) a = 8

ggT <- 4


a=30, b=3
a>b a <- a-b (30 - 3) a = 27
a>b a <- a-b (27 - 3) a = 24
a>b a <- a-b (24 - 3) a = 21
a>b a <- a-b (21 - 3) a = 18
a>b a <- a-b (18 - 3) a = 15
a>b a <- a-b (15 - 3) a = 12
a>b a <- a-b (12 - 3) a = 9
a>b a <- a-b (9 - 3) a = 6
a>b a <- a-b (6 - 3) a = 3

ggT <- 3
```
####b) Beobachten Sie das Vorgehen des Algorithmus. In welchen Fällen ist er besonders ineffizient? Wie könnte man ihn verbessern?
Der Algorithmus ist besoders inefizient wenn die Zahlen keinen größeren Teiler als 1 haben. Er ist ebenfalls inefizient wenn die zwei zahlen weit auseinander liegen.
Zur verbesserun ist vorzuschlagen die zahlen zu dividieren anstatt zu subtrahieren.


####c) Nun haben Sie zwei Stäbe unterschiedlicher Länge. Sie möchten diese Stäbe so in möglichst lange, gleichgroße Stücke zerteilen, dass kein Rest übrig bleibt.
1. vergleiche stab a und b => stab a is größer als stab b.
2. zerteile stab a in stücke der größe von b.
    => bleibt ein rest so werden nun alle annderen stücke in die größe des rests zerteilt.


###Aufgabe 2
Beschreiben Sie informell einen Algorithmus der die ersten 100 Primzahlen berechnet. Beschreiben Sie hierzu erst die Eigenschaft einer Primzahl, und formulieren Sie dann den Algorithmus.

Eine Primzahl ist eine natürliche Zahl, die genau zwei natürliche Zahlen als Teiler hat.[1] Eine Primzahl ist also eine natürliche Zahl größer als eins, die nur durch sich selbst und durch 1 ganzzahlig teilbar ist.

Der einfachste Primzahltest ist die Probedivision. Dabei probiert man nacheinander, ob die Zahl n durch eine der Primzahlen zwischen 2 und \sqrt{n} teilbar ist. Ist sie das nicht, dann ist n eine Primzahl. Die Probedivision ist jedoch viel zu aufwendig, sodass sie in der Praxis als Primzahltest nicht zum Einsatz kommt.

###Aufgabe 3

#### a) Analysieren Sie die Komplexität dieses Algorithmus. Bestimmen Sie hierzu zunächst für jede elementare Operation (Vergleich, Zuweisung) wie häufig diese Operation in Abhängigkeit von der Eingabe durchgeführt wird.

```
for (i = 1;i < N;i++){      c1      n+1
    a = 2                   c2      n
    while (a < i ) do{      c3      summe(i = 1 bis n) i-2
        s += a              c4      summe(i = 1 bis n) i-3
        a += 1              c5      summe(i = 1 bis n) i-3
    }
}
return s                    c6      1
```

T(n) = c1(n+1) + c2n + c3\*summe(1 bis n){i-2} + c4\*summe(1 bis n){i-3} + c5*summe(1 bis n){i-3} + c6

T(n) = c1n + c1 + c2n + c3\*summe(1 bis n){i-2} + summe(1 bis n){i-3}*(c4+c5) + c6

T(n) = n(c1+c2) + summe(1 bis n){i-2}\*c3 + summe(1 bis n){i-3}*(c4+c5) + c1 + c6

T(n) = n(c1+c2) + ((n(n+1)/2 - 2n) * c3 + (n(n+1)/2-3n)(c4+c5) + c1 + c6

T(n) = n(c1+c2) + (n^2 - 3n)c3 + (n^2-5n)(c4+c5) + c1 + c6

T(n) = n^2(c3 + c4 + c5) - 3nc3 - 5n(c4+c5) + n(c1+c2) + c1 +c6


n^2a - 3nb - 5nc + nd + e

O(n^2)

Ω(n)

scharfeSchranke(n^2)

###Aufgabe 4

optimierte Version:

```
Shx= 1-Sh
Slx= 1-Sl
for (i=1;i < N;i++){
    bg=BG(i)
    Th = 0
    Tl = 0
    if bg > M then
        NG(i) = bg x Shx
        Th = TH + bg x Sl
    else if bg <= M then
        NG(i) = bg x Slx
        Tl = Tl + bg x Sl
}
```
Die optimierte version arbeitet effizienter da die vergleiche nicht mehr zweifach durchgeführt werden müssen. 
Dazu kommt das die statsichen Berechnungen auf einen einmaligen Rechenschritt reduziert wurden so wie die funktions Aufrufe auf einmal pro Durchlauf reduziert wurden.

###Aufgabe 5
```
x <- a                      c1     1
y <- b                      c2     1
z <- 0                      c3     1

while (y > 0) do {          c4     (n / 2 + n % 2) +1
    if not odd(y) then{     c5     (n / 2 + n % 2)
        y <- y / 2          c6     (n / 2)
        x <- x + x          c7     (n / 2)
    }else{                  c8     (n % 2)
        y <- y - 1          c9     (n % 2)
        z <- z + x          c10    (n % 2)
    }
}
```

T(n) = c1 + c2 + c3 + c4(n/2+n-n/2+1) + c5(n/2+n-n/2) + (c6+c7)\*(n/2) + (c8+c9+c10)*(n-n/2)

T(n) = c1+c2+c3+c4 + n(c4+c5) + (c6+c7) * (n/2) + (c8+c9+c10) * (n-n/2)

O(n)
