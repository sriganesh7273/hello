package com.sapient.asde.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class RunnableThread {
    public static void main(String[] args) {
        System.out.println("start of main method");

        ExecutorService executor = Executors.newSingleThreadExecutor();
            try {
                Future<Integer> future = executor.submit(() -> {
                    Scanner scanner =new Scanner(System.in);
                    Integer result=1;
                    int n=Integer.parseInt(scanner.nextLine());
                    for(int i=2;i<=n;i++)
                        result*=i;
                    return result;
                });
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }catch (Exception e) {
                e.printStackTrace();
            }finally {
                executor.shutdown();
            }
    }
}
