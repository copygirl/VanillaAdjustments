package net.mcft.copy.vanilladj.recipe;

import net.minecraft.item.crafting.IRecipe;

public interface IRecipeListener {
	
	public void doSomethingWith(RecipeIterator iterator, IRecipe recipe);
	
}
