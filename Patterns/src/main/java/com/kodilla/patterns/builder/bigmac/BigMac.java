package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;

public class BigMac {
    private final String bun;
    private final String sauce;
    private final ArrayList<String> ingredients;

    public static class BigMacBuilder {
        private String bun;
        private String sauce;
        private ArrayList<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredients(String ingredient) {

            ingredients.add(ingredient);
            return this;
        }

        public BigMac create() {
            return new BigMac(bun, sauce, ingredients);
        }
    }

    private BigMac(String bun, String sauce, ArrayList<String> ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
