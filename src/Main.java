public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService(); // Создание объекта
        var bmi = service.calculate(1.87, 98); // Вызов метода
        System.out.println("Индекс массы тела: " + bmi); // Вывод результата
    }
}