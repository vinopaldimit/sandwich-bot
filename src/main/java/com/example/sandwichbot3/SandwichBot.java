package com.example.sandwichbot3;

import java.util.ArrayList;

public class SandwichBot {

	private String[] normal = { "peanut butter", "jelly", "smoked ham", "turkey", "assorted deli meats", "watercress",
			"cream cheese", "peppers", "pickled peppers", "cucumber slices", "swiss cheese", "cheddar cheese" };
	private String[] unusual = { "jelly-fish", "death", "the concept of time", "sadness", "happiness",
			"the space-time continuum", "gravel", "dirt", "sand", "ennui", "the fifth dimension" };

	public String generateSandwich(int ingredients) {
		chooseIngredient(ingredients);
		return "";
	}

	private void chooseIngredient(int ingredients) {
		ArrayList<String> chosen = new ArrayList<String>();
		for (int i = 0; i < ingredients; i++) {
			String choice = chooseOneIngredient();
			while (chosen.contains(choice)) {
				choice = chooseOneIngredient();
			}
			chosen.add(choice);
		}
	}

	private String chooseOneIngredient() {
		String ingredient;
		int randomNumber = (int) (Math.random() * (normal.length + unusual.length) + 1);
		if (randomNumber < normal.length) {
			ingredient = normal[randomNumber];
		} else {
			ingredient = unusual[randomNumber - normal.length];
		}
		return ingredient;
	}
}