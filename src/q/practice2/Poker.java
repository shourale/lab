package q.practice2;

import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static String[] deal(int players) {
        if (players < 1 || players > 10) {
            throw new IllegalArgumentException("Игроков должно быть от 1 до 10");
        }
        String[] deck = new String[52];
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + suit;
                index++;
            }
        }
        Random random = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String card = deck[i];
            deck[i] = deck[j];
            deck[j] = card;
        }
        String[] cards = new String[players * 5];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = deck[i];
        }
        return cards;
    }

    public static void main(String[] args) {
        System.out.print("Число игроков (1–10): ");
        Scanner scanner = new Scanner(System.in);
        try {
            int players = Integer.parseInt(scanner.nextLine());
            String[] cards = deal(players);
            for (int i = 0; i < players; i++) {
                System.out.println("Игрок " + (i + 1));
                for (int j = 0; j < 5; j++) {
                    System.out.println(cards[i * 5 + j]);
                }
                System.out.println();
            }
        } catch (IllegalArgumentException | java.util.NoSuchElementException error) {
            System.out.println("Ошибка ввода: " + error.getMessage());
        }
    }
}
