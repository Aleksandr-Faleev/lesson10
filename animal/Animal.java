public class Animal {
    // Статическая переменная для подсчёта общего числа животных
    private static int animalCount = 0;

    public Animal() { //подсчёта общего числа животных
        animalCount++;
    }
    public static int  quantityCount(){
        return animalCount; //возращает  общего число животных
    }
}
