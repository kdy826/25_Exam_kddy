package org.example;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt(); //오직 정수만들어갈수있는 변수c에 스캐너 타입을 입력받게 만든다.

        for (int i = 0; i < c; i++) { // 반복문 으로 입력받은 변수만큼 반복하게 만든다.
            for (int j = 0; j < i; j++) {  //이중반복문으로 입력받은 수가 한번만 반복하지 않게 만든다.
                System.out.printf(" ");  //피라미드 형실을 위한 줄 띄우기
            }

            for (int j = c - i; j > 0; j--) {
                System.out.printf(j + " "); //정수형 j에 c - i를 넣어점점 줄어드는 반복문으로 만든다.
            }
            System.out.println(); //피라미드 형식을 위한 줄바꿈
        }
    }
}





