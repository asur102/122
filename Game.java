// Basic Java shooting and fighting game

class Character {
    int health;

    Character() {
        this.health = 100;
    }
}

class Player extends Character {
    void attack(Enemy enemy) {
        enemy.health -= 10;
    }
}

class Enemy extends Character {
    void attack(Player player) {
        player.health -= 5;
    }
}

public class Game {
    public static void main(String[] args) {
        Player player = new Player();
        Enemy enemy = new Enemy();

        System.out.println("Player health: " + player.health);
        System.out.println("Enemy health: " + enemy.health);

        player.attack(enemy);
        enemy.attack(player);

        System.out.println("Player health after attack: " + player.health);
        System.out.println("Enemy health after attack: " + enemy.health);
    }
}
