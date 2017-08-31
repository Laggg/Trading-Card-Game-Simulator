package com.heyitsdavid.pokemontcgo;

import com.heyitsdavid.pokemontcgo.cards.PokemonCard;

public class Attack {
	PokemonCard pokemon;
	char[] energyCost;
	String effect;
	int damage;
	EnumDamageType dt;
	
	public Attack(PokemonCard pokemon, char[] energyCost, String effect, int damage, EnumDamageType dt) {
		this.energyCost = energyCost;
		this.effect = effect;
		this.damage = damage;
		this.dt = dt;
		this.pokemon = pokemon;
	}
	
	
	
}
