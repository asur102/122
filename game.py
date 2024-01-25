# Basic Python shooting and fighting game

class Character:
    def __init__(self):
        self.health = 100

class Player(Character):
    def attack(self, enemy):
        enemy.health -= 10

class Enemy(Character):
    def attack(self, player):
        player.health -= 5

player = Player()
enemy = Enemy()

print(f"Player health: {player.health}")
print(f"Enemy health: {enemy.health}")

player.attack(enemy)
enemy.attack(player)

print(f"Player health after attack: {player.health}")
print(f"Enemy health after attack: {enemy.health}")
