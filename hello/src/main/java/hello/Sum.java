package hello;

public class Sum {
	
	private long num1;
    private long num2;
    private long res;
  
    public Sum(long num1, long num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public long getNum1() {
		return num1;
	}

	public void setNum1(long num1) {
		this.num1 = num1;
	}

	public long getNum2() {
		return num2;
	}

	public void setNum2(long num2) {
		this.num2 = num2;
	}

	public void sumar(long num1, long num2){
    	res = num1 + num2;
    	this.setRes(res);
    }

	public long getRes() {
		return res;
	}

	public void setRes(long res) {
		this.res = res;
	}


}
