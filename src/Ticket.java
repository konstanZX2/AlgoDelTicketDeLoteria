public class Ticket {
    private Block[] blocks;


    public Ticket(int numBlocks){

        blocks=new Block [numBlocks];
        for (int i = 0; i < blocks.length; i++) {
            blocks[i]= new Block(6);

        }
    }

    @Override
    public  String toString() {
        String s = "";
        for (int i = 0; i < blocks.length; i++) {
            s += blocks[i] + "\n";

        }
        return s;
    }

        public void printUsedNumbers(){
            boolean [] usedNumbers = new boolean[50];
            for (int i=0; i< usedNumbers.length; i++){
                usedNumbers[i] = false;
            }
            for (int i = 0; i < blocks.length; i++) {
                int[] arrayDeInts = blocks[i].getNumbers();
                for (int j = 0; j <arrayDeInts.length ; j++) {
                    int index = arrayDeInts[j];
                    usedNumbers[index]= true;

                }
            }
            boolean addedComa = false;
            for (int i = 0; i < usedNumbers.length ; i++) {
                if (usedNumbers[i]){
                    if(!addedComa){
                        System.out.print(i);
                        addedComa=true;
                    }
                    else{
                        System.out.print(", "+i);

                    }

                }

            }
        }


}
