Composition
========
Реализирайте пример за composition, където имаме main клас, един клас Job и два класа Person1 и Person2.

Job трябва да съдържа променливата "заплата" със сетър и гетър.

В main класа трябва да инстанцираме обект от Person1 и Person2, и да извикаме техните заплати.

В Person1 и Person2 не трябва да създаваме нова променлива за заплата, нито да наследяваме Job.

* Използвайки composition, в Person1 и 2 може да инстанцираме обект от Job, чрез който да викаме методите му setSalary() и getSalary().

* Това може да се реализира чрез създаване на променлива от тип Job и след това към нея се отправя конструктор (или сетър), който казва че тази променлива е = new Job();

* Така се получава инстанциране на обект от Job ( Job job = new Job(); ) и след това имаме достъп до job.setSalary() и job.getSalary()