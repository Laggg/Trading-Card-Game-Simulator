package com.heyitsdavid.pokemontcgo.cards;

public abstract class PokemonCard extends Card{

  protected static int maxHP;
  protected static EnumDamageType type; //The damage-type of this pokemons attacks.
  protected static EnumDamageType weakness;
  protected static EnumDamageType resistance;
  protected static int retreatCost;
  
  //####################__Getter_&_Setter__##############################
  public int getMaxHP(){
    return maxHP;
  }
  public int getRetreatCost(){
    return retreatCost;
  }
  
  public EnumDamageType getType(){
    return type; 
  } 
  public EnumDamageType getWeakness(){
    return weakness;
  }
  public EnumDamageType getResistance(){
    return resistance;
  }
}
