# ПП коллоквиум от 24.10

Часть 1: Design Patterns
1)  Расписать что из себя представляет Singleton Design Pattern. Нарисовать «псевдо» UML диаграмму. Расписать какие аспекты инкапсулирует DP, какие аспекты изменчивости и сложности, привести примеры.

Часть 2: ООП
2)  Что такое ООП декомпозиция? Приведите примеры.
5)  Что такое агрегация? Когда нужно применять наследование, а когда агрегацию?
8)  Что такое Абстрагирование? Почему Гради Буч ввел Абстрагирование как 4-й принцип ООП?
12)  Что такое функциональное программирование? Приведите примеры использования функционального программировании.

Часть 3: Элементы промышленного программирования
1)  Пирамида тестирования? Определение, физический смысл, примеры.
3)  «Магическое число» 7 +-2. Связь с «магическим числом» и цикломатической сложностью.
6)  Что такое Test Runner, дайте определение, приведите примеры Java Frameworks.
9)  Что такое Reflection в Java? Как используется в контексте Mock frameworks?

Часть 4: Задачи на кодирование
1)  Реализовать в ООП стиле следующую задачу: рассчитать первых n факториалов, вернуть контейнер с первыми n факториалами. Код должен быть промышленного качества: обрабатывать ошибки, исключительные ситуации, покрыт UnitTest-ами.

Часть 5: Задачи на Design Patterns
1)  Реализовать Абстрактную Фабрику, можно фактически «скопировать» «реализацию с доски» (кто не ходил, тем хуже). Покрыть код UnitTest-ами.

Часть 6: Задачи на Mock-и
У нас есть класс CalculationEngine и метод calc и process. Его нужно покрыть UnitTest-ами, но есть одно маленькое но: для конфирурирования CalculationEngine, требуется класс DBGateForCalculations, который в свою очередь надо конфиругировать DBConnetion-ом. И DBConnetion и DBGateForCalculations еще не реализованы, их нужно заменить Mock-ами используя тот или иной Mock Framework:
1)  Mockito
