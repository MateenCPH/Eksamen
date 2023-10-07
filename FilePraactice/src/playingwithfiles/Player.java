package playingwithfiles;

public class Player
    {
        private String name;
        private int balance;

        public Player(String name, int balance)
            {
                this.name = name;
                this.balance = balance;
            }

        public String toString()
            {
                return "Player: " + name + " has " + balance + " DKK.";
            }
    }
