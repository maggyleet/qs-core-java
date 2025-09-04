package method_overloading;

import java.util.*;

class TrainSearch {

    public void search(int trainNo) {
        System.out.println("Train searching done via train number");
    }

    public void search(String trainName) {
        System.out.println("Train searching done via train name");
    }
}

public class MainOfTrainSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        TrainSearch ts = new TrainSearch();
        System.out.println("1.train no \n2. train name");
        System.out.println("Please make a choice:");
        int choice = scn.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter train number:");
                int trainNo = scn.nextInt();
                ts.search(trainNo);
                break;
            case 2:
                System.out.println("Enter train name:");
                String trainName = scn.next();
                ts.search(trainName);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        scn.close();
    }
}
