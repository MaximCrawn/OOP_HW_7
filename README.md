## Принципы SOLID в примере калькулятора

Код примера калькулятора демонстрирует использование некоторых принципов SOLID:

1. **Принцип единственной обязанности (SRP)**:
   - Класс `Calculator` отвечает только за ввод данных, выполнение операции и вывод результата. Логика операций вынесена в отдельные классы.

2. **Принцип открытости/закрытости (OCP)**:
   - При добавлении новой операции не требуется изменять код класса `Calculator`, так как он оперирует через интерфейс `Operation`, и новая операция просто должна реализовать этот интерфейс.

3. **Принцип подстановки Барбары Лисков (LSP)**:
   - Классы операций (`AdditionOperation`, `SubtractOperation`, `MultiplyOperation`, `DivisionOperation`) могут заменять базовый тип `Operation` без изменения ожидаемого поведения.

4. **Принцип инверсии зависимостей (DIP)**:
   - Класс `Calculator` зависит от абстракции `Operation`, а не от конкретных реализаций операций.

### Структура файлов

- **Calculator.java**: Главный класс приложения, отвечающий за ввод данных, выполнение операций и вывод результата.
- **Operation.java**: Интерфейс, определяющий метод `execute` для выполнения операции.
- **AdditionOperation.java**: Класс, реализующий интерфейс `Operation` для выполнения операции сложения.
- **SubtractOperation.java**: Класс, реализующий интерфейс `Operation` для выполнения операции вычитания.
- **MultiplyOperation.java**: Класс, реализующий интерфейс `Operation` для выполнения операции умножения.
- **DivisionOperation.java**: Класс, реализующий интерфейс `Operation` для выполнения операции деления.
- **CalculatorLogger.java**: Класс для логирования операций.