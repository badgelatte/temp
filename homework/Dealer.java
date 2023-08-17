import java.util.Collections;
import java.util.List;

public class Dealer {   // 카드 나눠주기
    List<Card> cards;
    

    // 사용되지 않은 카드 뭉치 가지기(unusedCard)
    
    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public void shuffle() {
        Collections.shuffle(cards); // 카드 섞는다
        System.out.println("딜러가 카드를 섞었습니다.");
    }
    
    public void draw(Player player) {
        player.receive(cards.remove(0));
        System.out.println("딜러가 플레이어에게 카드를 배부하였습니다.");
    }

    public void sort() {
        Collections.sort(cards);
    }

}
