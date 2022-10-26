import java.util.Arrays;

public class Block {


    private int[] numbers;

    public Block(int numNumbers){
    if (numNumbers<6){
        numNumbers=6;
    }
    if (numNumbers>49){
        numNumbers=49;
    }
    numbers = new int[numNumbers];
        for (int i = 0; i < numbers.length; i++) {

        }
        int count=0;
        while(count <numbers.length){
            int rand = (int)(Math.random()*49) +1;
            if (!isRepeatedNumber(rand)){
                numbers[count] = rand;
                count++;
            }

        }
        Arrays.sort(numbers);
    }




private boolean isRepeatedNumber(int number){
for (int i= 0; i<numbers.length;i++){
    if(number == numbers[i]){
    return true;
}


}return false;
    }

    public Block (int... numbers){
        this.numbers= numbers;  //Lo de los 3 puntos es para despues en
        //el main ponerle muchos valores(ir al main para verlo)
    }

    @Override
    public String toString() {
        String string="";
        for(int i=1;i<numbers.length;i++){
            string += ","+numbers[i];

        }
        return string;
    }
}
