package potter;

import java.util.ArrayList;
import java.util.Scanner;


public class Potter {


    public static void main(String[] args) {

        ArrayList<String> basket = new ArrayList<String>();

        boolean running = true;

        while (running == true) {

            System.out.println("Would you like to add a book to your basket? (yes/no)");
            Scanner scanner = new Scanner(System.in);

            if(scanner.hasNext()) {
                String yesNo = scanner.next();


                switch (yesNo) {
                    case "yes":
                        System.out.println("which volume would you like to add? (Please select one option from 1-5)");
                        Scanner scanner2 = new Scanner(System.in);
                        if (scanner2.hasNextInt()) {
                            int volume = scanner2.nextInt();
                            if (volume <= 5 && volume >= 1) {
                                String whichBook = "Volume " + volume;
                                basket.add(whichBook);
                                System.out.println("added to basket: " + whichBook);
                            } else {
                                System.out.println("Requested volume not recognised. Please try again.");
                            }
                        }

                        break;

                    case "no":
                        System.out.println("Items in basket:");
                        for (String book : basket) {
                            System.out.println(book);}
                            System.out.println();
                        System.out.println("Calculating cost of basket...");
                        running = false;
                        break;

                    default :
                        System.out.println("please type 'yes' or 'no'");
                        break;
                                    }
                                }
                            }
                        }






        }



