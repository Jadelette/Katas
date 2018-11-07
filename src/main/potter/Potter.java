package potter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;


public class Potter {


    public Potter (){

    }


      public static void main(String[] args) {

        Potter potter = new Potter();


        ArrayList<String> basket = new ArrayList<String>();
        /*basket.add("Volume 1");
        basket.add("Volume 1");
        basket.add("Volume 1");
        basket.add("Volume 2");
        basket.add("Volume 2");
        basket.add("Volume 2");
        basket.add("Volume 3");
        basket.add("Volume 3");
        basket.add("Volume 3");
        basket.add("Volume 4");
        basket.add("Volume 4");
        basket.add("Volume 5");
        basket.add("Volume 5");
        //get rid of these when real code is used*/


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
              potter.calculateBasketTotal(basket);

                            } //end of main method

    public float calculateBasketTotal(ArrayList<String> itemsInBasket){

        int v1Copies = 0;
        int v2Copies = 0;
        int v3Copies = 0;
        int v4Copies = 0;
        int v5Copies = 0;

        for (String item : itemsInBasket) {

           switch (item) {
               case "Volume 1":
                   v1Copies++;
                   break;

               case "Volume 2":
                   v2Copies++;
                   break;

               case "Volume 3":
                   v3Copies++;
                   break;

               case "Volume 4":
                   v4Copies++;
                   break;

               case "Volume 5":
                   v5Copies++;
                   break;

           }

        }

        /*System.out.println(v1Copies);
        System.out.println(v2Copies);
        System.out.println(v3Copies);
        System.out.println(v4Copies);
        System.out.println(v5Copies);*/

        int totalBooksLeft = (v1Copies + v2Copies + v3Copies + v4Copies + v5Copies);

        System.out.println("Your basket contains " + totalBooksLeft + " books.");

        ArrayList<Integer> sets = new ArrayList<Integer>();


        int set = 0;

        while (totalBooksLeft >0) {

            if (v1Copies > 0) {
                set++;
                v1Copies--;
                totalBooksLeft--;
            }

            if (v2Copies >0) {
                set++;
                v2Copies--;
                totalBooksLeft--;
            }

            if (v3Copies >0) {
                set++;
                v3Copies--;
                totalBooksLeft--;
            }

            if (v4Copies >0) {
                set++;
                v4Copies--;
                totalBooksLeft--;
            }

            if (v5Copies >0) {
                set++;
                v5Copies--;
                totalBooksLeft--;
            }

            sets.add(set);
            //System.out.println(set);
            set = 0;

            }
            //end of while loop


        /**
         * I know how many complete / incomplete sets are in the basket
         * I need to find out how many sets have only 3 books in (Binary Search?)
         * If there is a set of three books, check if there is also a set of five books
         * If there is a set of three and a set of five - amend both values to four
         * For each item in sets, switch statement calculate cost
         */

        Collections.sort(sets);

        do {
            if (sets.contains(3) && sets.contains(5)) {

                int setOfThreeIndex = Collections.binarySearch(sets, 3);
                //System.out.println(setOfThreeIndex);
                //System.out.println(sets.get(setOfThreeIndex));
                sets.set(setOfThreeIndex, 4);
                //System.out.println(sets.get(setOfThreeIndex));

                int setOfFiveIndex = Collections.binarySearch(sets, 5);
                //System.out.println(setOfFiveIndex);
                //System.out.println(sets.get(setOfFiveIndex));
                sets.set(setOfFiveIndex, 4);
                //System.out.println(sets.get(setOfFiveIndex));

            }
        } while (sets.contains(3) && sets.contains(5));

        System.out.println("Your basket contains " + sets.size() + " discounted sets.");


        float cost = 0;

        for (int setNew:sets) {
            switch (setNew) {
                case 1:
                    System.out.println("1 * single volume (£8) @ full price");
                    cost +=8;
                    break;
                case 2:
                    System.out.println("1 * set of 2 volumes (£16) @ 5% discount");
                    cost += 15.20;
                    break;
                case 3:
                    System.out.println("1 * set of 3 volumes (£24) @ 10% discount");
                    cost += 21.60;
                    break;
                case 4:
                    System.out.println("1 * set of 4 volumes (£32) @ 20% discount");
                    cost += 25.60;
                    break;
                case 5:
                    System.out.println("1 * set of 5 volumes (£40) @ 25% discount");
                    cost += 30.00;
                    break;

            }//end of switch

        }//end of foreach

        System.out.println("Basket Total: " + cost);

        return cost;

        }
        // end of method

    }
    //end of class







