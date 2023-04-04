Documentație
Am creat o funcție numită “checkPassword” care primește un string s ca parametru. Pentru început am inițializat cu lungimea stringului cu variabila n si un Boolean cu valoarea false pentru fiecare condiție: parola să aibă cel puțin o literă mare (checkUppercase), parola să aibă cel puțin o literă mică (checkLowercase), să aibă cel puțin o cifră (checkDigit) și 3 caractere consecutive să nu se repete (checkRepeatLetter). 
M-am gândit să parcurg tot stringul și să verific dacă gasesc toate cele 3 condiții de mai sus (literă mare, literă mica și cifră) și în cazul în care găseam modificam Boolean-urile respective în true.
Cu variabila missingCondition inițializată cu 0, număr câte condiții îmi lipsesc și încep să tratez următoarele cazuri:
•	dacă îndeplinește condițiile adică missingCount este 0 și numărul caracterelor este mai mare egal decât 6 și mai mic egal decât 20 atunci retunez 0, înseamnă că parola este puternică.
•	dacă nu îndeplinește condițiile adică missingCount este diferit de 0 și numărul caracterelor este mai mare egal decât 6 și mai mic egal decât 20 atunci retunez numărul de condiții lipsă, adică câte modificări trebuie să fac.
•	dacă îndeplinește condițiile, missingCount este 0 și numărul caracterelor este mai mic decât 6, atunci returnez 6 – n, numărul de minim de modificări necesare, adică câte caractere trebuie adăugate ca să fie mai mare decât 6. Nu am luat în considerare dacă adaug caractere și vor fi 3 consecutive la fel.
•	dacă îndeplinește condițiile, missingCount este 0 și numărul caracterelor este mai mare decât 20, atunci returnez n - 20, numărul de caractere care trebuie șterse ca să fie mai mare decât 6. Nu am luat în considerare dacă șterg caractere și nu se vor mai îndeplini condițiile.
•	dacă nu îndeplinește condițiile adică missingCount este diferit de 0 și numărul caracterelor este mai mic decât 6, atunci returnez numărul de condiții neîndeplinite și 6-n câte caractere mai trebuie adăugate.
•	dacă nu îndeplinește condițiile adică missingCount este diferit de 0 și numărul caracterelor este mai mare decât 20, atunci returnez numărul de condiții neîndeplinite și n-20 câte caractere trebuie șterse.
Asta este implementarea pe care am găsit-o pentru problemă. În unele cazuri nu returnează numărul minim de schimbări necesare, depinde de caz. În main am apelat funcția în diferite cazuri.

