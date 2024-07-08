package kadai_015;

public class CarExec_Chapter15 {
//インスタンス化
	public static void main(String[] args) {
		Car_Chapter15 car1 = new Car_Chapter15(3, 30);

//		gearChangeメソッドを実行（メソッドの呼び出し）
		car1.gearChange(3);
		car1.run();
	}
}
