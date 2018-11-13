package br.com.mario;

public class Main {

    public static void main(String[] args) {
        int i = 12;

        int count = 0;

        while (i > 0) {
            if (i % 3 == 0 && i % 2 == 0) {
                count += 6;
                i = i / 6;
            } else if (i % 3 == 0) {
                count += 3;
                i = i / 3;
            } else if (i % 2 == 0) {
                count += 2;
                i = i / 2;
            } else {
                count += i;
                i--;
                System.out.println("else");
            }
        }
        System.out.println(count);
    }
}
