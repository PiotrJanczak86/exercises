package com.exercises.asciishapes;

import java.util.Scanner;

public class CustomTriangle {
    public void drawShape() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the height of the upper part:");
        int x = scanner.nextInt();
        scanner.close();

        int height = 3 * x + 4;
        int width = 6 * x + 3;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < height; i++) {

            if (i == 0 || i == height - 1) {
                sb.append("X".repeat(width));
                sb.append("\n");
            } else if (i == 1 || i == 2 + x || i == height - 2) {
                sb.append("X");
                sb.append(" ".repeat(width - 2));
                sb.append("X\n");
            } else if (i == 2) {
                sb.append("X");
                sb.append(" ".repeat((width - 3) / 2));
                sb.append("X");
                sb.append(" ".repeat((width - 3) / 2));
                sb.append("X\n");
            } else {
                String outerSpace = " ".repeat((width - 3 - (1 + (i - 3) * 2)) / 2);
                if (i == 1 + x || i == 3 + x || i == height - 3) {
                    sb.append("X");
                    sb.append(outerSpace);
                    sb.append("X".repeat(3 + (i - 3) * 2));
                    sb.append(outerSpace);
                    sb.append("X\n");
                } else {
                    sb.append("X");
                    sb.append(outerSpace);
                    sb.append("X");
                    sb.append(" ".repeat(1 + (i - 3) * 2));
                    sb.append("X");
                    sb.append(outerSpace);
                    sb.append("X\n");
                }
            }
        }

        System.out.println(sb);
    }
}