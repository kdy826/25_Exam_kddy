package org.example;


public class Main {
    public static void main(String[] args) {

        int a = 10;    // 오직 정수만받을수있는 변수 a의 값에 10 넣음
        int number = 0;  // 오직 정수만받을수있는 변수 number의 값에 0 넣음
        int number1 =1;  // 오직 정수만받을수있는 변수 number1의 값에 1 넣음

        for(int i = 0;i <a ; i++){  //0부터 9까지 반복
            System.out.printf("%d " ,number); // number를 출력해 반복하면서 출력할수있게 만듬
            int num = number + number1; // 새로 정수만 받을수있는 변수 num의 값에 number + number1 을넣음
            number = number1; //number = number 1 을 사용해 number에게 number1 의 값을 넣음
            number1 = num; // 그리고 합쳐진 값인 num을 number1 에게 재할당 하면서 0 ,1 더해서 1 ,1 더해서 1 ,2 더해서 2,3 더해서 3,5 이렇게 나올수있게 만듬
        }
    }
}