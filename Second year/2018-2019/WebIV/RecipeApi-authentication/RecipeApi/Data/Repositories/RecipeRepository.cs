﻿using Microsoft.EntityFrameworkCore;
using RecipeApi.Models;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;

namespace RecipeApi.Data.Repositories
{
    public class RecipeRepository : IRecipeRepository
    {
        private readonly RecipeContext _context;
        private readonly DbSet<Recipe> _recipes;

        public RecipeRepository(RecipeContext dbContext)
        {
            _context = dbContext;
            _recipes = dbContext.Recipes;
        }

        public IEnumerable<Recipe> GetAll()
        {
            return _recipes.Include(r => r.Ingredients);
        }

        public Recipe GetBy(int id)
        {
            return _recipes.Include(r => r.Ingredients).SingleOrDefault(r => r.Id == id);
        }

        public IEnumerable<Recipe> GetBy(string name = null, string chef = null, string ingredientName = null)
        {
            var recipes = _recipes.Include(r => r.Ingredients).AsQueryable();
            if (!string.IsNullOrEmpty(name))
                recipes = recipes.Where(r => r.Name.IndexOf(name, System.StringComparison.OrdinalIgnoreCase) >= 0);
            if (!string.IsNullOrEmpty(chef))
                recipes = recipes.Where(r => r.Chef != null && r.Chef.Equals(chef, System.StringComparison.OrdinalIgnoreCase));
            if (!string.IsNullOrEmpty(ingredientName))
                recipes = recipes.Where(r => r.Ingredients.Any(i => i.Name.Equals(ingredientName, System.StringComparison.OrdinalIgnoreCase)));

            foreach(var res in recipes)
            {
                Debug.Print(res.Name);
            }
            return recipes.OrderBy(r => r.Name).ToList();
        }
  

        public bool TryGetRecipe(int id, out Recipe recipe)
        {
            recipe = _context.Recipes.Include(t => t.Ingredients).FirstOrDefault(t => t.Id == id);
            return recipe != null;
        }

        public void Add(Recipe recipe)
        {
            _recipes.Add(recipe);
        }

        public void Update(Recipe recipe)
        {
            _context.Update(recipe);
        }

        public void Delete(Recipe recipe)
        {
            _recipes.Remove(recipe);
        }

        public void SaveChanges()
        {
            _context.SaveChanges();
        }
     }
}
