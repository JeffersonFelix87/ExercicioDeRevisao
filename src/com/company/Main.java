package com.company;
import com.company.Janela;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Janela janela = new Janela();

        List<Janela> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a cor: ");
        String cor = sc.next();
        System.out.println("Informe dimensao X: ");
        int dimx = sc.nextInt();
        System.out.println("Informe a dimensao Y: ");
        int dimy = sc.nextInt();
        System.out.println("Informe a dimensao Z: ");
        int dimz = sc.nextInt();

        list.add(new Janela(cor, dimx, dimy, dimz ));

        for(Janela lis : list){
            lis.imprimir();
        }

        sc.close();

    }
}