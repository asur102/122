// Basic JavaScript shooting and fighting game

class Character {
    constructor() {
      this.health = 100;
    }
  }
  
  class Player extends Character {
    attack(enemy) {
      enemy.health -= 10;
    }
  }
  
  class Enemy extends Character {
    attack(player) {
      player.health -= 5;
    }
  }
  
  const player = new Player();
  const enemy = new Enemy();
  
  console.log(`Player health: ${player.health}`);
  console.log(`Enemy health: ${enemy.health}`);
  
  player.attack(enemy);
  enemy.attack(player);
  
  console.log(`Player health after attack: ${player.health}`);
  console.log(`Enemy health after attack: ${enemy.health}`);
  