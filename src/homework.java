public class homework {
    static float calc(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    static boolean sumCheck(int a, int b) {
        if(a + b <= 20 && a + b >= 10) {
            return true;
        } else {
            return false;
        }
    }



    static void logPrint(int number) {
        if(number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("positive");
        }
    }

    static boolean logReturn(int number) {
        if(number < 0) {
            return true;
        } else {
            return false;
        }
    }


    static void printName(String name){
        System.out.println("Hello, " + name);
    }

    static void year(int year) {
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println("високосный");
                } else {
                    System.out.println("не високосный");
                }
            } else {
                System.out.println("високосный");
            }
        } else {
            System.out.println("не високосный");
        }
    }

    public static void main(String[]args){
        boolean a = true;
        byte b = 127;
        char c = 'a';
        short d = 50;
        int e = 2;
        long f = 1L;
        float g = 1.24f;
        double h = 1.2d;

    }
}
