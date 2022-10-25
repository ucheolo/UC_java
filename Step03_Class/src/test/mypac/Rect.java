package test.mypac;

public class Rect {
	
	public int width;
	public int height;
	
	public void showArea(){
		int area = this.width*this.height;
		System.out.println("폭:"+this.width+" 높이:"+this.height+" 넓이:"+area);
	}
	
}
