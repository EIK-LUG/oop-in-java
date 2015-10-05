
/*
 --Status effects--
 
 Abstract class BaseStatusEffect
   Constructor(affectedAbility, effectAmount)
   Fields: affectedAbility, effectAmount
   Methods: apply, remove
 
 class Poisoned extends BaseStatusEffect
   Constructor(specialEffects)
   New fields: specialEffects
   Implement: apply, remove
 
 class Dazed extend BaseStatusEffect
   Constructor(specialEffects)
   New fields: specialEffects
   Implement: apply, remove
*/

/*
 --Items--
 
 Abstract class BaseItem
   Constructor(value)
   Fields: value
   Method: sell
 
 Interface Equippable
   Methods: equip, unequip
   
 Interface Usable
   Methods: use, refill
   
 Weapon extends BaseItem Equippable
   Constructor(damage, speed, value)
   New Fields: damage, speed
   New Methods: calcDamage
   Implement: equip, unequip
   
 Consumable extends BaseItem Usable
   Constructor(effect)
   New Fields: effect
   Implement: use, refill
*/

/*
 --Characters--  
 
 Not complete!
 
 Abstract BaseCharacter
   Constructor(health, stamina, skills, stats, items)
   Fields: health, stamina, skills, stats, inventory
   Methods: fight
 
 Interface Converseable
   Constructor(conversationTree)
   Methods: talk
 
 MainCharacter extends BaseCharacter
   New Fields: questBook
   New Methods: talk, equip   
 
 NPC extends BaseCharacter, Converseable
 
 EssentialNPC extends NPC
 
 Shopkeeper extends NPC
 
*/

public class GameExample {

    public static void main(String[] args) {
        
    }
    
}
