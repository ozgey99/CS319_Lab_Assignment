import java.util.ArrayList;

public class Main {
    public static void main( String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(500);
        list1.add(900);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(800);
        list2.add(600);
        list2.add(300);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(400);
        list3.add(700);
        list3.add(200);

        ArrayOrganizer a = new ArrayOrganizer();
        ArrayList<Integer> result = a.concatAndSort(list1,list2,list3);

        System.out.println("Result => " + result.toString());
        System.out.println("---------------------------------");

        Player p1 = new Player("Tom");
        Player p2 = new Player("John");
        Player p3 = new Player("James");
        Player p4 = new Player("Henry");

        Die d = new Die();

        for(int i = 0; i < 5; i++){
            p1.addScore(d.rollDie());
            p2.addScore(d.rollDie());
            p3.addScore(d.rollDie());
            p4.addScore(d.rollDie());
        }

        System.out.println(p1 + "\n" + p2 + "\n" + p3 + "\n" + p4);        
    }

}
