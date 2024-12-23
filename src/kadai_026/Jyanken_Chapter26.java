package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
//	自分の手を入力し、正しいかどうかを判定する
	public String getMyChoice() {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {		
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			String myChoice = scanner.nextLine();
			
			if(myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
				scanner.close();
				return myChoice;//while文抜ける			
			} else {
				System.out.println("入力が誤っています。やり直してください。");
			}
		}
	}
	
//	相手の手をランダムに選ぶ
	public String getRandom(){
		String[] randomChoice = {"r", "s", "p"};
		int i = (int)Math.floor(Math.random() * 3);
		return randomChoice[i];

	}

//	じゃんけんを行う
	public void playGame(String me, String cpu) {
		HashMap<String, String> jyankenMap = new HashMap<String, String>();
		
		jyankenMap.put("r", "グー");
		jyankenMap.put("s", "チョキ");
		jyankenMap.put("p", "パー");

		
		String myChoice = jyankenMap.get(me);
		String cpuChoice = jyankenMap.get(cpu);
		
		System.out.println("自分の手は" + myChoice + ",対戦相手の手は" + cpuChoice);
		
		if((myChoice.equals("グー") && cpuChoice.equals("チョキ"))
				|| (myChoice.equals("チョキ") && cpuChoice.equals("パー"))
				|| (myChoice.equals("パー") && cpuChoice.equals("グー"))){
			System.out.println("自分の勝ちです");
		} else if(myChoice.equals(cpuChoice)) {
			System.out.println("あいこです");
		} else {
			System.out.println("自分の負けです");
		}
		
	}
		
		
}
