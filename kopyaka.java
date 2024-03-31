import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JavaApplication1 {

    public static Scanner userInput = new Scanner(System.in);
    public static ArrayList<Integer> dealerScores = new ArrayList<>();
    public static ArrayList<String> dealerNames = new ArrayList<>();

    public static void main(String[] args) {
        dealerNames.add("GABRIEL AARON A. GONZALES");
        dealerScores.add(69696969);
        for (int i = 0; i < Math.min(10, dealerNames.size()); i++) { dealerNames.add(" "); dealerScores.add(-69); }
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.print("\n------------------------------------\n\nWelcome to Lucky9\n\n[1] Start Game\n[2] View Leader board\n[3] Exit\nSelect your action: ");
            int menuNum = userInput.nextInt();
            switch (menuNum) {
                case 1 -> { startGame();}
                case 2 -> { viewLeaderBoard(); }
                case 3 -> { System.out.println("\nThanks for Playing!"); System.exit(0); }
                default -> { System.out.println("\nInvalid input. Please Input again.\n\n------------------------------------\n"); }
            }
        }
    }

    public static void startGame() {
        Random randomNumber = new Random();
        int cashFund, numberofPlayers, cashTakeOut = 0, initialCashFund = 0, finalCashFund = 0;

        userInput.nextLine();
        System.out.print("\n------------------------------------\n\nEnter your dealer name: ");
        String dealerName = userInput.nextLine();

        while (true) {
            System.out.print("Enter your cash fund: ");
            cashFund = userInput.nextInt();
            if (cashFund >= 1) {
                break;
            }
            System.out.println("Invalid cash funds. Please input positive numbers Only.");
        }

        initialCashFund = cashFund;

        while (true) {
            System.out.print("Enter number of player(s): ");
            numberofPlayers = userInput.nextInt();
            if (numberofPlayers >= 1 && numberofPlayers <= 20) {
                break;
            }
            System.out.println("Invalid number of player(s). Please input from 1-20 Only.");
        }

        System.out.println();

        int[] playerBets = new int[numberofPlayers];

        for (int counter = 1; counter <= numberofPlayers; counter++) {
            int randomBet = (randomNumber.nextInt(10 - 1 + 1) + 1) * 10;
            System.out.println("Player " + counter + " bet: " + randomBet);
            playerBets[counter - 1] = randomBet;
        }

        System.out.print("\n[1] Play\n[2] Exit\nSelect your action: ");
        int menuNum = userInput.nextInt();

        System.out.println();

        boolean isStillPlaying = true;

        switch (menuNum) {
            case 1 -> {
                while (isStillPlaying == true) {
                    char[] drawCards = {'A', 'J', 'Q', 'K'};
                    String[] cardSuits = {"♥", "♦", "♣", "♠"};
                    Object[] dealerCardsInTable = new Object[4];
                    Object[] playerCardsInTable = new Object[numberofPlayers + 10];
                    int[] playerTotalScores = new int[numberofPlayers];
                    boolean[] lucky9Winners = new boolean[numberofPlayers];
                    boolean dealerLucky9 = false;
                    int dealerMoneyWon = 0, playerMoneyWon = 0;

                    for (int counter = 1; counter <= 3; counter++) {
                        int randomNum = randomNumber.nextInt((13 - 2) + 1) + 2;

                        if (randomNum > 9) {
                            char dealerFirstCard = drawCards[randomNum - 10];
                            System.out.println((counter == 1) ? "Your " + counter + "st card: " + dealerFirstCard + " " + cardSuits[randomNumber.nextInt(4)] + "" : (counter == 2) ? "Your " + counter + "nd card: " + dealerFirstCard + " " + cardSuits[randomNumber.nextInt(4)] + "" : "Your " + counter + "rd card: " + dealerFirstCard + " " + cardSuits[randomNumber.nextInt(4)] + "");
                            dealerCardsInTable[counter - 1] = dealerFirstCard;
                            if (dealerCardsInTable[counter - 1] == null || dealerFirstCard == 'J' || dealerFirstCard == 'Q' || dealerFirstCard == 'K') {
                                dealerCardsInTable[counter - 1] = 0;
                            } else if (dealerFirstCard == 'A') {
                                dealerCardsInTable[counter - 1] = 1;
                            }
                        } else {
                            int dealerFirstCard = randomNum;
                            System.out.println((counter == 1) ? "Your " + counter + "st card: " + dealerFirstCard + " " + cardSuits[randomNumber.nextInt(4)] + "" : (counter == 2) ? "Your " + counter + "nd card: " + dealerFirstCard + " " + cardSuits[randomNumber.nextInt(4)] + "" : "Your " + counter + "rd card: " + dealerFirstCard + " " + cardSuits[randomNumber.nextInt(4)] + "");
                            dealerCardsInTable[counter - 1] = dealerFirstCard;
                        }
                        if (counter == 2) {

                            if (((int) dealerCardsInTable[0] + (int) dealerCardsInTable[1]) == 9) {
                                System.out.println("You got lucky 9");
                                dealerLucky9 = true;
                                dealerCardsInTable[(counter + 1) - 1] = 0;
                                break;
                            } else {
                                System.out.print("Do you wanna Draw [Y/N]: ");
                                char drawOrNot = userInput.next().toLowerCase().charAt(0);
                                if (drawOrNot == 'y') {

                                } else if (drawOrNot == 'n') {
                                    dealerCardsInTable[(counter + 1) - 1] = 0;
                                    break;
                                }
                            }
                        }
                    }

                    int dealerTotalScorePoints = ((int) dealerCardsInTable[0] + (int) dealerCardsInTable[1] + (int) dealerCardsInTable[2]) > 10 ? ((int) dealerCardsInTable[0] + (int) dealerCardsInTable[1] + (int) dealerCardsInTable[2]) - 10 : (int) dealerCardsInTable[0] + (int) dealerCardsInTable[1] + (int) dealerCardsInTable[2];
                    while (dealerTotalScorePoints >= 10) {
                        dealerTotalScorePoints -= 10;
                    }

                    System.out.printf("\nYour total value: %d\n\nPress Enter to view player's cards...", dealerTotalScorePoints);
                    userInput.nextLine();
                    userInput.nextLine();

                    for (int playerCounter = 1; playerCounter <= numberofPlayers; playerCounter++) {
                        System.out.println("\n------------------------------------\n\nPlayer " + playerCounter + "\n");

                        for (int cardCounter = 1; cardCounter <= 3; cardCounter++) {
                            int randomNum = randomNumber.nextInt((13 - 2) + 1) + 2;

                            if (randomNum > 9) {
                                char dealerFirstCard = drawCards[randomNum - 10];
                                System.out.println((cardCounter == 1) ? cardCounter + "st card: " + dealerFirstCard + " " + cardSuits[randomNumber.nextInt(4)] + "" : (cardCounter == 2) ? cardCounter + "nd card: " + dealerFirstCard + " " + cardSuits[randomNumber.nextInt(4)] + "" : cardCounter + "rd card: " + dealerFirstCard + " " + cardSuits[randomNumber.nextInt(4)] + "");
                                playerCardsInTable[cardCounter - 1] = dealerFirstCard;
                                if (playerCardsInTable[cardCounter - 1] == null || dealerFirstCard == 'J' || dealerFirstCard == 'Q' || dealerFirstCard == 'K') {
                                    playerCardsInTable[cardCounter - 1] = 0;
                                } else if (dealerFirstCard == 'A') {
                                    playerCardsInTable[cardCounter - 1] = 1;
                                }
                            } else {
                                int dealerFirstCard = randomNum;
                                System.out.println((cardCounter == 1) ? cardCounter + "st card: " + dealerFirstCard + " " + cardSuits[randomNumber.nextInt(4)] + "" : (cardCounter == 2) ? cardCounter + "nd card: " + dealerFirstCard + " " + cardSuits[randomNumber.nextInt(4)] + "" : cardCounter + "rd card: " + dealerFirstCard + " " + cardSuits[randomNumber.nextInt(4)] + "");
                                playerCardsInTable[cardCounter - 1] = dealerFirstCard;
                            }

                            if (cardCounter == 2) {
                                if (((int) playerCardsInTable[0] + (int) playerCardsInTable[1]) == 9) {
                                    //System.out.println("Player " + playerCounter + " got lucky 9");
                                    lucky9Winners[playerCounter - 1] = true;
                                    playerCardsInTable[2] = 0;
                                    break;
                                }
                            }
                            lucky9Winners[playerCounter - 1] = false;
                        }
                        int playerTotalScorePoints = (int) playerCardsInTable[0] + (int) playerCardsInTable[1] + (int) playerCardsInTable[2];
                        while (playerTotalScorePoints >= 10) {
                            playerTotalScorePoints -= 10;
                        }
                        System.out.println("Player " + playerCounter + " value: " + playerTotalScorePoints);
                        playerTotalScores[playerCounter - 1] = playerTotalScorePoints;
                    }

                    System.out.println("\n------------------------------------\n\nWinner(s): ");

                    for (int winnerCounter = 1; winnerCounter <= numberofPlayers; winnerCounter++) {
                        if (lucky9Winners[winnerCounter - 1] == true && dealerLucky9 == false) {
                            System.out.println("Player " + winnerCounter + " (" + (playerBets[winnerCounter - 1] * 3) + ")");
                            playerMoneyWon += playerBets[winnerCounter - 1] * 3;
                        } else if (playerTotalScores[winnerCounter - 1] > dealerTotalScorePoints) {
                            System.out.println("Player " + winnerCounter + " (" + (playerBets[winnerCounter - 1] * 2) + ")");
                            playerMoneyWon += playerBets[winnerCounter - 1] * 2;
                        }
                    }

                    System.out.println("\nTied(s): ");

                    for (int tiedCounter = 1; tiedCounter <= numberofPlayers; tiedCounter++) {
                        if (lucky9Winners[tiedCounter - 1] == true && dealerLucky9 == true) {
                            System.out.println("Player " + tiedCounter);
                        } else if ((lucky9Winners[tiedCounter - 1] == false && dealerLucky9 == false) && (playerTotalScores[tiedCounter - 1] == dealerTotalScorePoints)) {
                            System.out.println("Player " + tiedCounter);
                        }
                    }

                    System.out.println("\nLoser(s): ");

                    for (int loserCounter = 1; loserCounter <= numberofPlayers; loserCounter++) {
                        if (dealerLucky9 == true && lucky9Winners[loserCounter - 1] == false) {
                            System.out.println("Player " + loserCounter);
                            dealerMoneyWon += playerBets[loserCounter - 1];
                        } else if (dealerTotalScorePoints > playerTotalScores[loserCounter - 1]) {
                            System.out.println("Player " + loserCounter);
                            dealerMoneyWon += playerBets[loserCounter - 1];
                        }
                    }

                    System.out.printf("\n------------------------------------\n\nDealer Result: \n\nWin: %d \n\nLose: %d \n\nDealer total fund: %d \n\n------------------------------------\n\n", dealerMoneyWon, playerMoneyWon, ((cashFund - playerMoneyWon) + dealerMoneyWon));

                    cashFund -= (playerMoneyWon - dealerMoneyWon);
                    cashTakeOut += (playerMoneyWon + dealerMoneyWon);

                    if (cashFund <= 0) {
                        finalCashFund = (cashTakeOut - initialCashFund);
                        System.out.println("cashTakeOut: " + cashTakeOut + " initialCashFund: " + initialCashFund);
                        System.out.println("YOU LOSE. NICE TRY.\n");
                        boolean isValidInput = false;
                        while (!isValidInput) {
                            System.out.println("[1] Play Again(new data)\n\n[2] Quit\n");
                            System.out.print("Select your Action: ");
                            int playOrNot = userInput.nextInt();
                            switch (playOrNot) {
                                case 1 -> {
                                    dealerNames.add(dealerName);
                                    dealerScores.add(finalCashFund);
                                    startGame();
                                    return;
                                }
                                case 2 -> {
                                    dealerNames.add(dealerName);
                                    dealerScores.add(finalCashFund);
                                    menu();
                                    return;
                                }
                                default ->
                                    System.out.println("Invalid Selection. Try again.");
                            }
                        }
                    }

                    boolean isValidInput = false;
                    while (!isValidInput) {
                        finalCashFund = (cashTakeOut - initialCashFund);
                        System.out.println("[1] Play again\n\n[2] Quit\n");
                        System.out.print("Select your Action: ");
                        int playOrNot = userInput.nextInt();
                        switch (playOrNot) {
                            case 1 -> {
                                System.out.println();

                                for (int counter = 1; counter <= numberofPlayers; counter++) {
                                    int randomBet = (randomNumber.nextInt(10 - 1 + 1) + 1) * 10;
                                    System.out.println("Player " + counter + " bet: " + randomBet);
                                    playerBets[counter - 1] = randomBet;
                                }

                                System.out.println();
                                isValidInput = true;
                                break;
                            }
                            case 2 -> {
                                dealerNames.add(dealerName);
                                if (finalCashFund < 0) {
                                    dealerScores.add(finalCashFund + initialCashFund);
                                }
                                dealerScores.add(finalCashFund);
                                // System.out.println("finalcashFund: " + finalCashFund + " initialCashFund: " + initialCashFund);
                                isStillPlaying = false;
                                menu();
                                isValidInput = true;
                                break;
                            }
                            default ->
                                System.out.println("Invalid Selection. Try again.");
                        }
                    }
                }
            }
            case 2 -> { menu(); }
            default -> { System.out.println("\nInvalid input. Please Input again.\n\n------------------------------------"); }
        }
    }

    public static void viewLeaderBoard() {

        System.out.println("\n------------------------------------\n\nViewing Leaderboard...\n\n------------------------------------\n");

        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < dealerNames.size(); i++) {
            indices.add(i);
        }
        Collections.sort(indices, Comparator.comparingInt((Integer i) -> dealerScores.get(i)).reversed());

        for (int i = 0; i < Math.min(10, dealerNames.size()); i++) {
            int index = indices.get(i);
            System.out.println((dealerScores.get(index) < 0) ? (i + 1) + ")" : (i + 1) + ") " + dealerNames.get(index) + " (" + dealerScores.get(index) + ")");
        }

        menu();
    }
}
