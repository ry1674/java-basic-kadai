package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
//		インスタンス化
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
//		初期化メソッドを呼び出し
		dictionary.fruitsDictonary();
		
		String[] fruitsArray = {"apple", "banana", "grape", "orange"};
		
		dictionary.search(fruitsArray);

		}
		
	}


