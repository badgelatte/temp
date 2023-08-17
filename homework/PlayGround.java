import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayGround { // 카드 뭉치들
    List<Card> cards;
    List<Player> players;
    Dealer dealer;
    Rule rule;

    public PlayGround() {
        cards = new ArrayList<>();
        players = new ArrayList<>();
        rule = new Rule();

        for (CardShape s : CardShape.values()) { // CardShape 내용물을 하나씩 s로 옮김
            for (CardNum n : CardNum.values()) {
                // cards = new ArrayList<>();   // for문 돌때마다 리스트 한개씩 만듦, 값을 하나씩 리스트에 넣은 것이 아님
                cards.add(new Card(s, n));

            }
        }
        dealer = new Dealer(); // 딜러고용
        dealer.setCards(cards); // 딜러가 카드 가져가기
        
        // Collections.shuffle(cards); // 셔플 완료 -> 사람이 셔플하게끔도 가능 = 딜러
    }

    public void join(Player player) {   // 사람 입장 
        players.add(player);    // player 리스트에 사람 1명 넣음 -> 방문명단에 사람 1명 이름 적음
    }
    
    public void start() {
        
        dealer.shuffle();   // 딜러가 카드 섞기

        for (Player p : players) { // 모든 플레이어
            dealer.draw(p); // 딜러가 가진 섞은 카드를 모든 플레이어에게 한개씩 배분
        }
        // 베팅  -> 근데 이건 안 할거임
        // 게임 진행 가능 여부 판단 
        rule.judge(players);
    }
    
    public boolean startable() {
        return players.size() > 1;
    }

    // 버리는 카드 가지기 = 사용된 카드(usedCard)


    // 카드 정렬하기




}
