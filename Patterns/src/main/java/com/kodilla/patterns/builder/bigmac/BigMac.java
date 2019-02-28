package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;

public class BigMac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final ArrayList<String> ingredients;

    public static class BigMacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private ArrayList<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
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
            return new BigMac(bun, burgers, sauce, ingredients);
        }
    }

    private BigMac(final String bun,final int burgers, final String sauce, final ArrayList<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
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
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
