package Pract1;

public class Task1 {
    public static void main(String[] args) {
        Consumer cons = new Consumer() {
            @Override
            public void printMax(String[] arr) {
                long kMax = 0;
                String newStr = "";
                for (int i = 0; i < arr.length; i++) {
                    long k = arr[i].chars().distinct().count();
                    if (k > kMax) {
                        kMax = k;
                        newStr = arr[i];
                    }
                }
                System.out.println(newStr);
            }
        };
        String arr[] = {"qwerty", "qqwweeeeeee", "qwertyu", "qwert"};
        cons.printMax(arr);
    }
}


/* public class Task1  {
    public static void main(String[] args) {

        List<String> str = Arrays.asList("qwerty", "qqwweeeeeee", "qwertyu", "qwert");

        Consumer<List<String>> newString = list -> {
            long kMax = list.get(0).length();
            String newStr = list.get(0);
            for (int i=1; i< list.size(); i++) {
                long k = list.get(i).chars().distinct().count();
                if (k > kMax) {
                    kMax = k;
                    newStr = list.get(i);
                }
            }
            System.out.println(newStr);
        };

        newString.accept(str);
    }
} */