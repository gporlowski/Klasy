# Klasy
1. Stwórz klasę Rectangle, która będzie miała pola: a, b (długości boków). Do klasy dodaj konstruktor (ustawiający wartości wszystkich pól).
1b. Dodaj do klasy metodę getArea, która zwróci pole powierzchni, oraz metodę getPerimeter zwracającą obwód figury.

2. Postąp analogicznie dla koła oraz trójkątu (a, b, c).

3. Stwórz klasę Person, która będzie miała pola: firstName, lastName oraz age oraz konstruktor (ustawiający wartości wszystkich pól).

4. Stwórz klasę Room, która będzie miała pola: area oraz height.

5. Stwórz klasę House, która będzie miała pola: address (String), kitchen, bathroom oraz tablicę pokojów (rooms). W przypadku pól oznaczających pomieszczenia skorzystajmy z klasy Room.

6. Do klasy House dodaj metodę getArea, która zwróci pole powierzchni domu.

7. Stwórz klasę Party, która będzie miała pola: host (gospodarz), attendees (uczestnicy). Do klasy dodaj metodę getAverageAge, która zwróci średni wiek uczestników.

8. Stwórz typ Lock, reprezentujący zamek na kod (z trzema przekładniami - np. zamek do walizki/roweru). Będziemy mogli tworzyć obiekt typu Lock przekazując jako parametr konstruktora trzy cyfry - kod otwierający zamek. Domyślnie obiekt będzie tworzony z losowym ustawieniem przekładni. Obiekt typu Lock będzie oferował trzy metody zmieniający ustawienie każdej z przekładni o jedną pozycję w prawo. Będzie również oferował metodę sprawdzającą, czy zamek jest otwarty, czy nie, oraz metodę wypisującą na ekranie aktualnie ustawioną kombinację zamka.

9. Stwórz interfejs użytkownika dla zamka. Kolejno:
- pytamy użytkownika w trzech krokach o poprawną kombinację
- nastepnie użytkownik może:
- sprawdzić aktualną kombinację zamka
- przesunąć wybraną przekładnię
- sprawdzić, czy zamek jest otwarty

10. Zmodyfikuj typ Lock, aby zamek mógł posiadać dowolną liczbę przekładni (zaktualizuj też oczywiście interfejs - użytkownik na początku określa ile jest przekładni).
