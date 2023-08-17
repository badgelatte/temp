import java.util.List;
import java.util.ArrayList;

// 카드 승패
public class Player { // 셔플
    List<Card> hands;

    public Player() {
        hands = new ArrayList<>();
    }

    // 플레이어가 카드 받기
    public void receive(Card card) {
        hands.add(card);
        System.out.println("플레이어가 "+ card +"를 받았습니다.");
    }
    
    //손에 들린 카드 보여주기
    public void showCard() {
        System.out.println("플레이어 덱: " + hands);
    }
    
}
