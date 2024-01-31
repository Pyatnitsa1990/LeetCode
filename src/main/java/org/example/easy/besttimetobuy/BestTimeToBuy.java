package org.example.easy.besttimetobuy;

public class BestTimeToBuy {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {1, 2};
        int[] prices3 = {7, 6, 4, 3, 1};
        int[] prices4 = {2, 1, 2, 1, 0, 1, 2};
        System.out.println(maxProfit(prices4));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int interimResult = 0;
        int currentPriceToBuy = 0;
        int minPrice = 0;
        int currentPriceForSale = 0;
        int maxPrice = 0;
        int indexPriceForSale = 0;
        int indexPriceToBuy = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            currentPriceToBuy = prices[i];
            currentPriceForSale = prices[i + 1];
            if (i == 0 || currentPriceToBuy < minPrice) {
                minPrice = currentPriceToBuy;
                indexPriceToBuy = i;
                indexPriceForSale = i + 1;

            }
            if (i == 0 || indexPriceToBuy < indexPriceForSale) {
                maxPrice = currentPriceForSale;
                interimResult = maxPrice - minPrice;
            }
            if (interimResult > profit) {
                profit = interimResult;
            }

        }
        return profit;
    }
}
