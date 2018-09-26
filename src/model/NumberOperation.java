package model;

public class NumberOperation implements Operation {
    private float sum;

    @Override
    public boolean process(String s) {
        float number = Float.valueOf(s);
        if(number % 2 == 0){//Если число четное
            sum += number;
            System.out.println(sum);
        }
        return true;
    }
}
