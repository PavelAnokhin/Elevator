package Elevatoring;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> floors = new ArrayDeque<>();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("I'm forward looking for number of floor:-)Pls, type it! or 0 for end:");
            String input = scan.nextLine();
            int temp = Integer.parseInt(input);
            if(temp<=25&&temp>0){
                floors.offer(temp);}
            else if(temp==0){

                System.out.println("Would you like calculate spent time for you small travelling?\nPls,type yes for calculate or end for exit:");
                String input2 = scan.nextLine();
                if(input2.equals("yes")){

                    }

                }

                //Just comment for checking GIT Hub
            // break;
            }

        }
    }

