package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
//	フィールド
	HashMap<String, String> dictionaryMap = new HashMap<String, String>();
	
//	辞書を初期化するメソッド
	public void fruitsDictonary() {
		dictionaryMap.put("apple", "リンゴ");
		dictionaryMap.put("peach", "桃");
		dictionaryMap.put("banana", "バナナ");
		dictionaryMap.put("lemon", "レモン");
		dictionaryMap.put("pear", "梨");
		dictionaryMap.put("kiwi", "キウィ");
		dictionaryMap.put("strawbery", "いちご");
		dictionaryMap.put("grape", "ぶどう");
		dictionaryMap.put("muscat", "マスカット");
		dictionaryMap.put("cherry", "さくらんぼ");
	}

//	検索するメソッド
	public void search(String[] word) {
		for(String fruitsName : word) {
//			辞書にあるかチェック
			if(dictionaryMap.get(fruitsName) != null) {
				System.out.println(fruitsName + "の意味は" + dictionaryMap.get(fruitsName));
			} else {
				System.out.println(fruitsName + "は辞書に存在しません");
			}
		}
	}
	
}
	

	


