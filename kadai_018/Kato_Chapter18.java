package kadai_018;

abstract public class Kato_Chapter18 {
//	フィールド
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区⚪︎×";
	
//	メソッド
	public void commonIntoroduce(){
		System.out.println("名前は" + familyName + givenName + "です" );
		System.out.println("住所は" + address + "です");
	};
	abstract public void eachIntoroduce();
	public void execIntoroduce() {
		commonIntoroduce();
		eachIntoroduce();
	}
}