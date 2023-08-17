/* public enum CardShape {
    Clover,  //1    -> 서열 꼴찌
    Heart,   // 2
    Diamond,  // 3
    Spade  //4
} */
public enum CardShape { // 그림을 띄우기 위해 유니코드사용
    클로버("\u2663"),
    하트("\u2665"),
    다이아("\u2666"),
    스페이드("\u2660");

    public static final String red = "\u001B[31m";
    public static final String exit = "\u001B[0m";

    public final String simbol;

    CardShape(String simbol) {
        this.simbol = simbol;
    }

    public String toString() {
        if (simbol.equals("\u2665") || simbol.equals("\u2666")) {
            return red + simbol + exit;
        } else {
            return simbol;
        }
    }
}