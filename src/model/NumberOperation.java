package model;

public class NumberOperation implements Operation {
    private float sum;

    /**
     * Обработчик с числами
     * @param s новый токен под обработку
     * @return всегда true так как нет случая ошибок
     */
    @Override
    public boolean process(String s) {
       countSum(Float.valueOf(s));
       return true;
    }

    /**
     * Считаем сумму всех чисел. Так как результат нам не нужен то возвращает void. Но легко если нужно вытащить sum.
     * Суммирует все четные числа.
     * @param number с чем суммировать
     */
    private void countSum(Float number){
        if(number % 2 == 0){//Если число четное
            sum += number;
            System.out.println(sum);//Печатаем каждое число
        }
    }
}
