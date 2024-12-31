package step03;

public class MyArt {
	//변수, 메소드 구현
	String modelNo = "N1328BT";
	
	public String getModelNo() {
		return this.modelNo;
	}
	
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	
	public static void main(String[] args) {
		
		//객체 생성
		MyArt my = new MyArt();
		
		//변수와 메소드호출
		System.out.println(my.getModelNo());
		System.out.println(my.modelNo);
		
		//값 수정
		my.setModelNo("abcdefg");

		//수정 후 호출
		System.out.println(my.getModelNo());
		System.out.println(my.modelNo);
	}

}
