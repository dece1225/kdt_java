package ex03_KTH;

public class Main {
	public static void main(String[] args) {
		String nation = "Korea,Spain,Germany,America";

//		StringInter si = new StringInter() {
//
//			@Override
//			public String modify(String str) {
//				return nation.replace(',', '!');
//			}
//		};
		StringInter si = str -> nation.replace(',', '!');
		
		System.out.println(si.modify(nation));
	}
}
