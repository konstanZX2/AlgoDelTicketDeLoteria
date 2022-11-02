public class Main {
    public static void main(String[] args) {

        Block b= new Block(9);
        Block c=new Block(3,4,5,6,7);

        Ticket ticket= new Ticket(4);
        System.out.println(ticket);

        ticket.printUsedNumbers();

        Ticket ticket2 = new Ticket(8);
        System.out.println("\n");
        System.out.println("-----------------");
        System.out.println(ticket2);
        System.out.println("---------------");

        Block block = new Block(1,3,10,14,16,20,23,30,42,47,49);
        System.out.println(block);
    }


}