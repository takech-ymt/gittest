package la.business;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalcAge {
	public int howOld(int year, int month, int date) {
		// 今日の日付を設定
		LocalDate today = LocalDate.now();

		// 誕生日を設定
		LocalDate birthday = LocalDate.of(year, month, date);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

		// 今日の日付と誕生日を8桁のintにする
		int todayInt = Integer.parseInt(today.format(formatter));
		int birthdayInt = Integer.parseInt(birthday.format(formatter));

		// 年齢を計算
		return (int) ((todayInt - birthdayInt) / 10000);
	}
}