package chibuzorAssignment.TestDrillerUTMEAssignment;

public class TestDriller {

    public static int testDriller(int copies) {
        if (copies >= 1 && copies <= 4) return 2000;
        else if (copies >= 5 && copies <= 9) return 1800;
        else if (copies >= 10 && copies <= 29) return 1600;
        else if (copies >= 30 && copies <= 49) return 1500;
        else if (copies >= 50 && copies <= 99) return 1300;
        else if (copies >= 100 && copies <= 199) return 1200;
        else if (copies >= 200 && copies <= 499) return 1100;
        else {
            return 1000;
        }
    }

}