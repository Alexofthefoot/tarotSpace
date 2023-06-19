class PrintInsertStatements {

    public static void main(String[] args) {
        String[] nums = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Page", "Knight", "Queen", "King"};

        String[] suits = {"Swords", "Wands", "Pentacles", "Cups"};

        String[] names = {"The Fool", "The Magician", "The High Priestess", "The Empress", "The Emperor", "The Heirophant", 
        "The Lovers", "The Chariot", "Strength", "The Hermit", "Wheel of Fortune", "Justice", "The Hanged Man", "Death", "Temperance", 
        "The Devil", "The Tower", "The Star", "The Moon", "The Sun", "Judgement", "The World"};

        //minor upright
        int suit = 0;
        for (int i = 0; i < 56;) {
            for (int j = 0; j < nums.length; j++) {
                System.out.println("INSERT INTO Card values (" + i + ", \"" + nums[j]  + " of " + suits[suit] + "\", \"Minor\", \""+ suits[suit] + "\", \"Upright\");");  
                i++;            
            }
            suit++;
        }

        // major upright
        for (int i = 0; i < names.length; i++) {
            System.out.println("INSERT INTO Card (card_id, card_name, arcana, orientation) values (" + (i+56) + ", \"" + names[i] + "\", \"Major\", \"Upright\");");  
        }

        // minor reversed
        suit = 0;
        for (int i = 0; i < 56;) {
            for (int j = 0; j < nums.length; j++) {
                System.out.println("INSERT INTO Card values (" + (i+78) + ", \"" + nums[j]  + " of " + suits[suit] + " Reversed\", \"Minor\", \""+ suits[suit] + "\", \"Reversed\");");  
                i++;            
            }
            suit++;
        }

        // major reversed
        for (int i = 0; i < names.length; i++) {
            System.out.println("INSERT INTO Card (card_id, card_name, arcana, orientation) values (" + (i+134) + ", \"" + names[i] + " Reversed\", \"Major\", \"Reversed\");");  
        }

          
    }
}
