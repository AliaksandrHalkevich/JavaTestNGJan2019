package day1;

import org.testng.annotations.Test;

public class Day1CodingExercises {


    @Test
    public void test001() {
        System.out.println("Hello, World!");
    }

    @Test
    public void test002() {
        String helloText = "Hello, World";

        System.out.println(helloText);
    }

    @Test
    public void test003() {
        String s1 = ("Who let the dogs out?");
        String s2 = "Who who who who!";

        System.out.println(s1 + "    plus    " + s2);
    }

    @Test
    public void test004() {
        int num = 5;
        String s = "I have " + num + " cookies";

        System.out.println(s);
    }

    @Test
    public void test005() {
        boolean b;
        boolean toBe = false;

        b = toBe || !toBe;

        if (b) {
            System.out.println(toBe);
        }
    }

    @Test
    public void test006() {
        boolean isElementVisible = false;

        if (isElementVisible) {
            System.out.println("click on the element");
        } else {
            System.out.println("element is NOT visible");
        }
    }

    @Test
    public void test007() {
        int a = 4;
        boolean b = a == 4;

        if (b) {
            System.out.println("It's true!");
        }
    }

    @Test
    public void test008() {
        int a = 4;
        int b = 5;

        if (a > b || a < b) ;
        {


            System.out.println("TRUE");
        }

    }

    @Test
    public void test009() {
        boolean elementAisvisible = true;
        boolean elementBisvisible = false;

        if (elementAisvisible || elementBisvisible) {
            System.out.println("click somewhere");
        } else {
            System.out.println(elementAisvisible + "   " + elementBisvisible);
        }
    }

    @Test
    public void test010() {
        int[] arr;
        arr = new int[10];

        arr[0] = 4;
        arr[1] = arr[0] + 5;

        if (arr[1] == 1) {
            System.out.println("equal to 1");
        } else {
            System.out.println("not equal to 1");
        }
    }

    @Test
    public void test011() {
        int[] arr = {1, 2, 3, 4, 5};

        if (arr[3] == 3) {
            System.out.println("equal to 3");
        } else {
            System.out.println("not equal to 3");
        }
    }


    @Test
    public void test012() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int i;
        for (i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
    }
}

    class main {
        public static void main(String[] args) {
            byte z = 0;
            short a = 3;
            int b = 11;
            char d = ' ';
            float x = 2.0f;
            boolean f = true;
            String output = "H" + a + b + z + d + "w" + z + "r" + b + "d" + d + x + d + f;
            System.out.println(output);
        }
    }

    class Main {
        public static void main(String[] args) {
                int[] numbers = {
                951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544,
                615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941,
                386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345,
                399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217,
                815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717,
                958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470,
                743, 527};

        for (int i = 0; i < numbers.length; i++) {
            int el = numbers[i];

            if (el == 237) {
                break;
            }

            if (el % 2 == 0) {
                System.out.println(el);
            }

        }
    }
}
