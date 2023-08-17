import java.util.ArrayList;
import java.util.List;
import java.lang.Math;


public class Card implements Comparable<Card>{ // 숫자, 모양
    private CardShape shape;
    private CardNum num;
    
    public Card(CardShape shape, CardNum num) {
        this.shape = shape;
    }

    public CardNum getNum() {
        return num;
    }
    
    public CardShape getShape() {
        return shape;
    }
    
    @Override
    public String toString() {
        return shape + " " + num;
    }

    @Override
    public int compareTo(Card card) {
        //return  // 문양 비교

        int result = this.shape.compareTo(card.getShape()); // 양수 = this가 더 큰 거
        
        if (result == 0) {   // 같은 문양일때 
            result = this.num.compareTo(card.getNum()); // 넘버 순으로
            // return this.num.compareTo(card.getNum()); -> 이거 써도 됌
        }
        
        return result;  // 문양이 같지 않을때 문양순으로
        
        /* if (this.num.compareTo(card.getNum())>0) {
            return 1;
        }
        else if (this.num.compareTo(card.getNum()) < 0) {
            return -1;
        }
        else {
            return 0;
        } */
    }

}


