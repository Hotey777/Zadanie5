package ru.netology.sqr;

public class SQRService {

    public int calcSqr(int lower, int upper) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i <= upper && i * i >= lower) {
                count++;
            }
        }
        return count;
    }
}
