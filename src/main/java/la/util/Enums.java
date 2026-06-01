package la.util;

public enum Enums {
	LOGIN("/login"), HOME("/home"), USER_LIST("/user/list"), USER_DETAIL("/user/detail");

	private String label;

	Enums(String label) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.label = label;
	}

}
