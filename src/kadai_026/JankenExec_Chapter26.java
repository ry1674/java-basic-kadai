package kadai_026;

public class JankenExec_Chapter26 {

	public static void main(String[] args) {
//		インスタンス化
		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();

//		相手の手をランダムに選ぶメソッドを呼び出し、返値をmeへ代入
		String me = jyanken.getMyChoice();
		
//		相手の手をランダムに選ぶメソッドを呼び出し、返値をcpuへ代入
		String cpu = jyanken.getRandom();

//		じゃんけんを行うメソッドを呼び出し
		jyanken.playGame(me, cpu);

	}

}
