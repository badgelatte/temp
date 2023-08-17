import java.util.List;
import java.util.Objects;

public class Rule {

    public void judge(List<Player> players) {

        Player winner = null;
        int count = 1;

        for (Player player : players) {
            if (Objects.isNull(winner)) {   // winner가 아무도 없다면
                winner = player;
                continue;
            }

            Card card = player.hands.get(player.hands.size() - 1);
            Card wCard = winner.hands.get(winner.hands.size() - 1);

            if (card.compareTo(wCard) > 0) {    // player 카드가 우승자 카드보다 크다면
                winner = player;                // player가 winner가 됩니다.
                System.out.println("우승자가 탄생하였습니다.");
                count++;
            }
            
            
        }
        System.out.println("최종 우승자는 " + count + "번째 플레이어입니다.");


    }
}
