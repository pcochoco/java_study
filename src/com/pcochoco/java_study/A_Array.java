package com.pcochoco.java_study;

import java.util.Scanner;

public class A_Array {

    public void practice1(){

        System.out.print("정수를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
            System.out.printf("arr[%d] : %d\n", i, arr[i]);
        }
    }

    public void practice2(){
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[3];
        double sum = 0.0;
        double avg = 0.0;
        for(int i = 0; i < 3; i++){
            System.out.print("키 입력 > ");
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        avg = sum / 3;
        System.out.printf("총합 : %.1f \n 평균 : %.1f", sum, avg);

    }

    public void practice3(){
        //랜덤값 대입하되 중복 제거
        int[] arr = new int[9];
        int[][] arr2 = new int[3][3];

        for(int i = 0; i < 9; i++){
            for(int j = i; j < i; j++) {
                if (i == j) {
                    arr[i] = (int) (Math.random() * 10 + 1);
                    j = -1; //random num can be random again
                }
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr2[i][j] = arr[i + j];
            }
        }


    }


}
