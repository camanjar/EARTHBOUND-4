 ![Image description](src/main/resources/ui/images/earthbound4.png)
 
# Welcome to Earthbound 4!
Is this an assignment for SER316 at ASU Polytechnic Campus? **Maybe...** Is this another one of Pokey's evil ruses to rule the world once again? **Most definitly.** ✧ (▀̿Ĺ̯▀̿ ̿) 

Welcome to Onette, where our hero Ness lives to once again return to humanity's rescue. He and his many friends, including his trusty dog sidekick Randy, will be forced to battle villains at the hottest spots close and far from Onette. Villains, like 
Silberkugel and Bronze Kneecap, will try to overcome Ness and his friends' powers and aid Pokey to his conquest of planetary destruction.  (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ ᵖᵏ ˢᵗᵃʳˢᵗᵒʳᵐ✧ﾟ･

### Software Structure 
Following Design Patterns are used for the structure of this simulation: 
- Builder Design Pattern
- Factory Design Pattern

The simulation begins in the city of Onette, where villains will "spawn" through the builder design pattern. These villains, inspired by both Nintendo's SNES release "EARTHBOUND" and my previous assignment for this class, will be randomly generated villains with different attacking power and health.

The simulation will included timed events with an introduction to the "game", meeting the characters, and battles that will commence once heroes go into generated layers. Each layer will feature a main villain and for the sake of this assignment will only have one generated villain through the factory design pattern.

The battles are the key component to the simulation. Ness attacks with physical damage while Paula attacks with special damage. Attacks will decrease the HP (health points) of the opponents. The battle function, taking three parameters (hero, villain, and turn) also ensures the correct sfx are played for attacks and victory. 

More information covering villanous activity in Onette: 
- Villain layers will be constructed through the factory pattern
- Villains will belong to group layers where heroes will battle
- Layers will have randomly generated names and descriptions
- Villains will belong to specific layers 
- Layer names are randomly constructed for further design pattern demonstration 

Thank you and enjoy the show! Sound on :)

