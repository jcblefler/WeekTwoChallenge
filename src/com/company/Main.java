package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Main {


    public static int randomNumber(int x){
        Random random = new Random();
        int num = random.nextInt(x);
        return num;
    }


    private static DecimalFormat df2 = new DecimalFormat("#.00");

    public static void main(String[] args) {

        ArrayList<String> burrito = new ArrayList<String>();

        String[] rice = new String[3];
        String[] meat = new String[6];
        String[] beans = new String[3];
        String[] salsa = new String[5];
        String[] veggies = new String[4];
        boolean cheese;
        boolean guac;
        boolean queso;
        boolean cream;
        double price;

        rice[0] = "white rice";
        rice[1] = "brown rice";
        rice[2] = "no rice";

        meat[0] = "chicken";
        meat[1] = "steak";
        meat[2] = "carnidas";
        meat[3] = "chorizo";
        meat[4] = "sofritas";
        meat[5] = "veggies";

        beans[0] = "pinto beans";
        beans[1] = "black beans";
        beans[2] = "no beans";

        salsa[0] = "mild salsa";
        salsa[1] = "medium salsa";
        salsa[2] = "hot salsa";
        salsa[3] = "no salsa";
        salsa[4] = "all salsa";

        veggies[0] = "lettuce";
        veggies[1] = "fajita veggies";
        veggies[2] = "no veggies";
        veggies[3] = "all veggies";

        for (int i = 0; i < 26; i++){

            burrito.clear();

            if (randomNumber(3) == 1){
                cheese = true;
            } else{
                cheese = false;
            }
            if (randomNumber(3) == 2){
                guac = true;
            } else{
                guac = false;
            }
            if (randomNumber(9) < 4){
                queso = true;
            } else{
                queso = false;
            }
            if (randomNumber(9) >= 4){
                cream = true;
            } else{
                cream = false;
            }

            String pickRice = rice[randomNumber(rice.length)];
            String pickSalsa = salsa[randomNumber(salsa.length)];
            String pickVeggies = veggies[randomNumber(veggies.length)];
            String pickBeans = beans[randomNumber(beans.length)];

            System.out.print("Burrito "+ i + ": ");
            burrito.add(pickRice);
            burrito.add(meat[randomNumber(meat.length)]);
            burrito.add(pickBeans);
            if (pickSalsa.equalsIgnoreCase("all salsa")){
                burrito.add(salsa[0]);
                burrito.add(salsa[1]);
                burrito.add(salsa[2]);
            } else{
                burrito.add(pickSalsa);
            }
            if (pickVeggies.equalsIgnoreCase("all veggies")){
                burrito.add(veggies[0]);
                burrito.add(veggies[1]);
            } else{
                burrito.add(pickVeggies);
            }
            if (cheese == true){
                burrito.add("cheese");
            }
            if (guac == true){
                burrito.add("guac");
            }
            if (queso == true){
                burrito.add("queso");
            }
            if (cream == true){
                burrito.add("sour cream");
            }


            System.out.print(burrito.get(0));
            for (int j = 1; j < burrito.size(); j++){
                System.out.print(", " + burrito.get(j));
            }



            price = 3.00 + (.50 * burrito.size());
            if (pickRice.equalsIgnoreCase("no rice")){
                price = price - .5;
            }
            if (pickBeans.equalsIgnoreCase("no beans")){
                price = price - .5;
            }
            if (pickSalsa.equalsIgnoreCase("no salsa")){
                price = price - .5;
            }
            if (pickVeggies.equalsIgnoreCase("no veggies")){
                price = price - .5;
            }
            System.out.print("\t $" + df2.format(price));
            System.out.println("\n");
        }



    }
}
