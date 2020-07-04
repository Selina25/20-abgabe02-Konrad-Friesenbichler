###Mögliche Einsatzgebiete einer Queue (Warteschlange)

Eine typische Verwendung einer Queue wäre zum Beispiel beim Drucker. Hier sollen die Seiten gedruckt werden, 
da alles auf einmal zu drucken ja nicht möglich wäre passiert es hier nacheinander. 
Damit der Drucker aber weiß, wann was kommt, gibt es eine Warteschlange, die abgearbeitet wird (mit dem FIFO-Prinzip --> First In First Out).  
Auch verwenden graphische Benutzeroberflächen eine Queue indem sie Maus- und Tastaturereignisse puffern 
und diese nacheinander an die jeweiligen Prozesse weiterleiten.

###Was sind Generics? 
Generics sind sozusagen Platzhalter für jegliche Datentypen. Kurz gesagt kann man damit doppelten code verhindern.
Generics in Verwendung:
Um nun Gebrauch davon zu machen, verwendet man keine speziellen Datentypen sondern einfach ein Wort oder auch einfach 
einen Buchstaben; hier zum Beispiel ein ‚T‘. 
Man kann dieser Klasse jegliche Datentypen übergeben und die Klasse weiß selbst, wie sie damit umzugehen hat. 
Praktisch gesehen werden aus zum Beispiel folgenden Klassen mit Interface:
```java
public interface IQueue{
}

public class StringQueue implements IQueue{
	private List<String> elements = new ArrayList<String>();

}

public class IntegerQueue implements IQueue {
	private List<Integer> elements = new ArrayList<Integer>();

}

public class ObjectQueue implements IQueue {
	private List<Object> elements = new ArrayList<Object>();

}
```

eine einzige gesammelte Klasse, die so aussieht:

```java
public class GenericQueue<T>{
	private List<T> elements = new ArrayList<T>();

}
```

Nicht nur Klassen sondern auch Methoden können mit Generics erstellt werden.
	 
###Was ist eine Code Coverage bei Source Code Tests?
Die Code Coverage gibt an, wie viel Prozent des Source Codes automatisch getestet werden. 
Wenn man die Code Coverage betrachtet, sieht man, ob es etwaige Lücken im Testen gibt. 
100%ige Code Coverage wäre zwar optimal, ist aufgrund des Aufwandes aber oft nicht möglich bzw. zahlt es sich nicht aus. 
Es werden also oft nur 80-90% (bei Unit-Tests) angepeilt, da mit diesem Prozentteil zwar nicht alles aber bereits ein signifikanter Teil getestet wird.