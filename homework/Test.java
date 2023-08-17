public class Test {
    public static void main(String[] args) {
        PlayGround board = new PlayGround();
        Player person1 = new Player();
        Player person2 = new Player();
        Player person3 = new Player();
        
        board.join(person1); // 게임판에 사람 입장
        board.join(person2);
        board.join(person3);

        if (board.startable()) {
            board.start(); // play하는 과정
        }

        // person1.showCard();
        // person2.showCard();

        

        /*
         * // List<Card> cards = new ArrayList<>();
         * 
         * 
         * // System.out.println(cards);
         * // System.out.println();
         * // System.out.println();
         * 
         * // System.out.println(cards.size());
         * // Card boxincard = cards.remove(0);
         * // System.out.println(boxincard);
         * // System.out.println(cards.size());
         * 
         * 
         * 
         * // Collections.sort(cards); // 정렬
         * // System.out.println(cards);
         * 
         * // compareTo 확인
         * // Card c = new Card(CardShape.Clover, CardNum.Eight);
         * // Card c2 = new Card(CardShape.Clover, CardNum.Ace);
         * // System.out.println(c.compareTo(c2));
         * // System.out.println(c2.getNum().compareTo(c.getNum()));
         */
    }
}
