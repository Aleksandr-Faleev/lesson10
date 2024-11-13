public class Bowel{
       // Количество еды в миске
       private int foodAmount;

       // Конструктор для создания миски с начальным количеством еды
       public Bowel(int initialFoodAmount) {
           this.foodAmount = initialFoodAmount;
       }

       // Уменьшение количества еды при кормлении
       public void consumeFood(int amount) {
           foodAmount -= amount;
       }

       // Добавление еды в миску
       public void addFood(int additionalFood) {
           if (additionalFood > 0) {
               foodAmount += additionalFood;
               System.out.println(additionalFood + " единиц еды были добавлены в миску.");
           } else {
               System.out.println("Невозможно добавить отрицательное количество еды.");
           }
       }

       // Получение текущего количества еды в миске
       public int getFoodAmount() {
           return foodAmount;
       }
   }
