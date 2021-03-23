package com.company;

import java.util.Scanner;

public class Main {

        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            String vvedennya ="0.0";
            double suma = 0, serednie = 0,chyslo = 0;
            int kilkistChysel = 0;
            while (vvedennya.equals("=") != true) {
                chyslo = Double.parseDouble(vvedennya);
                suma = suma + chyslo;
                System.out.println("Введіть число або(=) шоб зупинитись:");
                vvedennya = scanner.nextLine();
                kilkistChysel++;
            }
            serednie = suma/--kilkistChysel;
            System.out.println("Середнє з " +kilkistChysel + " чисел: " + serednie);
            }
        }

