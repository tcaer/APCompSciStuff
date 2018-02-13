public class Test {

	public static void main(String[] args){

  Highway hway = new Highway(4, 8);
    hway.addCar(0,1 );
    hway.addCar(0, 6);
    hway.addCar(1, 3);
    hway.addCar(1, 6);
    hway.addCar(2,1);
    hway.addCar(2, 4);
    hway.addCar(3, 2);
    hway.addCar(3, 3);
    hway.addCar(3,4);

    int[][] hwy = hway.getHwy();

    for(int[] lane: hwy){
        for(int l: lane){
            System.out.print(l);
        }
        System.out.println();
    }
    System.out.println();
    System.out.println(hway.canSwitchLane(0, 1, 6));
    System.out.println(hway.canSwitchLane(2, -1, 4));
    System.out.println(hway.canSwitchLane(3, -1,2));
   hway.moveAllForward();
    System.out.println();
    System.out.println();
    for(int[] lane: hwy){
        for(int l: lane){
            System.out.print(l);
        }
        System.out.println("");
    }

     hway.moveAllForward();
     System.out.println("");
for(int[] lane: hwy){
        for(int l: lane){
            System.out.print(l);
        }
        System.out.println();
    }
}


}