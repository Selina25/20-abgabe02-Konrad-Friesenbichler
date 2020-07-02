###Was ist eine Queue? 
---
Die Queue (deusch: Warteschlange) ist eine der vier bekanntesten Datenstrukturen (Array, Linked List, Stack und Queue).
Sie arbeitet nach dem Fifo-Prinzip (First in- First out) und erlaubt daher nur das Entfernen des ersten Elements und das Hinzufügen eines Elements 
ganz hinten an der Liste. Ich kenne daher immer nur den Anfang und das Ende einer Liste, denn dort habe ich meine Pointer. 
Die elementaren Methoden einer Queue sind daher:  
* Offer:  
![Offer Method](images/offer.png)  
* Remove:  
![Remove Method](images/remove.png)   
* Poll:  
![Poll Method](images/poll.png)  
* Element:  
![Element Method](images/element.png)  
* Peek:  
![Peek Method](images/peek.png)  
Die Anwendungsmöglichkeiten sind dabei beispielsweise Request-Queuing bei Servern, Job Scheduling oder eine Ready Queue. 



###Wie kann eine Queue getestet werden?
---
Eine Queue kann man durch Ihre Methoden und verschiedene Szenarien testen. 
Natürlich ist es abhängig davon, wie ich teste und in welchem Zusammenhang. Generell gilt allerdings das ich alle möglichen Funktionen und Zustände einer Queue überprüfe. 
Beispielsweise wie die Methoden reagieren, wenn keine Elemente enthalten sind oder wenn zu viele Elemente zu einer Warteschlange hinzugefügt werden. 
