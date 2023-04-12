package com.builder.pattern;

public class Pizza {

    private boolean hasPepperoni;
    private boolean isSalted;
    private boolean hasSweetKetchup;
    private boolean hasCheese;
    private boolean hasSpicyKetchup;
    private boolean hasHam;

    private Pizza(PizzaBuilder builder) {
        this.hasPepperoni = builder.hasPepperoni;
        this.isSalted = builder.isSalted;
        this.hasSweetKetchup = builder.hasSweetKetchup;
        this.hasCheese = builder.hasCheese;
        this.hasSpicyKetchup = builder.hasSpicyKetchup;
        this.hasHam = builder.hasHam;
    }

    public void displayIngredients() {
        System.out.println("Pizza ingredients:");
        if (hasPepperoni) {
            System.out.println("- Pepperoni");
        }
        if (isSalted) {
            System.out.println("- Salt");
        }
        if (hasSweetKetchup) {
            System.out.println("- Sweet ketchup");
        }
        if (hasCheese) {
            System.out.println("- Cheese");
        }
        if (hasSpicyKetchup) {
            System.out.println("- Spicy ketchup");
        }
        if (hasHam) {
            System.out.println("- Ham");
        }
    }


    public static class PizzaBuilder {
        private boolean hasPepperoni;
        private boolean isSalted;
        private boolean hasSweetKetchup;
        private boolean hasCheese;
        private boolean hasSpicyKetchup;
        private boolean hasHam;

        public PizzaBuilder addPepperoni(boolean hasPepperoni) {
            this.hasPepperoni = true;
            return this;
        }

        public PizzaBuilder addSalt(boolean isSalted) {
            this.isSalted = true;
            return this;
        }

        public PizzaBuilder addSweetKetchup(boolean hasSweetKetchup) {
            this.hasSweetKetchup = true;
            return this;
        }

        public PizzaBuilder addCheese(boolean hasCheese) {
            this.hasCheese = true;
            return this;
        }

        public PizzaBuilder addSpicyKetchup(boolean hasSpicyKetchup) {
            this.hasSpicyKetchup = true;
            return this;
        }

        public PizzaBuilder addHam(boolean hasHam) {
            this.hasHam = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}

