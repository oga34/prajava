public class Main {
    public static void main(String[] args) {
        System.out.println("じゃんけんを始めます");
        System.out.print("[0]グー,[1]チョキ,[2]パーの中から番号で選択してください:");
        String[] number = {"グー","チョキ","パー"};
        int n = new java.util.Scanner(System.in).nextInt();
        System.out.println("あなたの選んだ手は" + number[n]);
        int c = new java.util.Random().nextInt(3);
        if (n == c) {
            System.out.println("コンピューターの手は" + number[c]);
            System.out.println("あいこでした");
        } else if ((n == 0 && c == 1) || (n == 1 && c == 2) || (n == 2 && c == 0)) {
            System.out.println("コンピューターの手は" + number[c]);
            System.out.println("あなたの勝ち");
        } else {
            System.out.println("コンピューターの手は" + number[c]);
            System.out.println("あなたの負け");
        } 
    }
}