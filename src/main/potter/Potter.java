package potter;

import java.util.*;


public class Potter {


    public Potter (){

    }


      public static void main(String[] args) {

        Potter potter = new Potter();


       HashMap <String, Integer> basket = new HashMap<String, Integer>();

        boolean running = true;

        System.out.println("Would you like to add a book to your basket? (y/n)");

        while (running == true) {

            Scanner addBooks = new Scanner(System.in);

            if(addBooks.hasNext()) {
                String yesNo = addBooks.next();
                String choice = yesNo.toUpperCase();
                switch (choice) {
                    case "Y":
                        System.out.println("Which volume would you like to add? (Please select one option from 1-5)");
                        Scanner selectVolume = new Scanner(System.in);
                        if (selectVolume.hasNextInt()) {
                            int volume = selectVolume.nextInt();

                            if (volume <= 5 && volume >= 1) {
                                String whichBook = "Volume " + volume;
                                System.out.println("How many copies of " + whichBook + " would you like to add?");

                                Scanner howManycopies = new Scanner(System.in);

                                if (howManycopies.hasNextInt()) {
                                    int copiesToAdd = howManycopies.nextInt();

                                    if (basket.containsKey(whichBook)) {
                                        int updatedNumberOfCopies = basket.get(whichBook)+ copiesToAdd;
                                        basket.put(whichBook, updatedNumberOfCopies);
                                    } else {
                                    basket.put(whichBook, copiesToAdd);}

                                    System.out.printf("Added to basket: %d copies of %s %n%n%n", copiesToAdd, whichBook);

                                    System.out.println("Would you  like to add another book to your basket?");
                                }else {
                                    System.out.println("invalid selection for number of copies; would you like to try again?");
                                }
                                //basket.add(whichBook);
                                //System.out.println("added to basket: " + whichBook);
                            }else {
                                System.out.println("Requested volume not recognised. Would you like to try again.");
                            } //end of nested if/else

                        } //end of original if
                        break;

                    case "N":
                        System.out.println("Items in basket:");
                        for (String book : basket.keySet()) {
                            System.out.println(basket.get(book) + " copies of " + book);}
                            System.out.println();
                        System.out.printf("Calculating cost of basket... %n%n");
                        running = false;
                        break;

                    default :
                        System.out.println("please type 'y' or 'n'");
                        break;
                                    }
                                }
                            }
              potter.calculateBasketTotal(basket);

                            } //end of main method

    public float calculateBasketTotal(HashMap<String, Integer> itemsInBasket){

        int v1Copies = 0;
        int v2Copies = 0;
        int v3Copies = 0;
        int v4Copies = 0;
        int v5Copies = 0;

        for (String item : itemsInBasket.keySet()) {

           switch (item) {
               case "Volume 1":
                   v1Copies = itemsInBasket.get(item);
                   break;

               case "Volume 2":
                   v2Copies = itemsInBasket.get(item);
                   break;

               case "Volume 3":
                   v3Copies = itemsInBasket.get(item);
                   break;

               case "Volume 4":
                   v4Copies = itemsInBasket.get(item);
                   break;

               case "Volume 5":
                   v5Copies  = itemsInBasket.get(item);
                   break;

           }

        }

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
                sets.set(setOfThreeIndex, 4);

                int setOfFiveIndex = Collections.binarySearch(sets, 5);
                sets.set(setOfFiveIndex, 4);

            }
        } while (sets.contains(3) && sets.contains(5));


            System.out.println("Your basket contains " + sets.size() + " sets.");


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

        System.out.printf("%n Basket Total: £%.2f %n", cost);

        return cost;

        }
        // end of method

    }
    //end of class







