package Java;
interface Chain{
	public void setNextChain(Chain nextChain);
	public void calculate(Numbers req);
}
class Numbers{
	private int num1,num2;
	private String calculateWanted;
	public Numbers(int n1,int n2,String cw) {
		this.num1 = n1;
		this.num2 = n2;
		this.calculateWanted = cw;
	}
	public int getNumber1() {
		return num1;
	}
	public int getNumber2() {
		return num2;
	}
	public String getCalWanted() {
		return calculateWanted;
	}
}
class AddNumbers implements Chain{
	private Chain nextInChain;
	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;
	}
	public void calculate(Numbers req) {
		if(req.getCalWanted() == "add") {
			System.out.println(req.getNumber1() + " + " + req.getNumber2() + " = " + (req.getNumber1()+req.getNumber2()));
		} else {
			nextInChain.calculate(req);
		}
	}
}
class SubNumbers implements Chain{
	private Chain nextInChain;
	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;
	}
	public void calculate(Numbers req) {
		if(req.getCalWanted() == "sub") {
			System.out.println(req.getNumber1() + " - " + req.getNumber2() + " = " + (req.getNumber1()-req.getNumber2()));
		} else {
			nextInChain.calculate(req);
		}
	}
}
class MulNumbers implements Chain{
	private Chain nextInChain;
	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;
	}
	public void calculate(Numbers req) {
		if(req.getCalWanted() == "mul") {
			System.out.println(req.getNumber1() + " * " + req.getNumber2() + " = " + (req.getNumber1()*req.getNumber2()));
		} else {
			nextInChain.calculate(req);
		}
	}
}
class DivNumbers implements Chain{
	private Chain nextInChain;
	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;
	}
	public void calculate(Numbers req) {
		if(req.getCalWanted() == "div") {
			System.out.println(req.getNumber1() + " / " + req.getNumber2() + " = " + (req.getNumber1()/req.getNumber2()));
		} else {
			nextInChain.calculate(req);
		}
	}
}


public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chain c1 = new AddNumbers();
		Chain c2 = new SubNumbers();
		Chain c3 = new MulNumbers();
		Chain c4 = new DivNumbers();
		c1.setNextChain(c2);
		c2.setNextChain(c3);
		c3.setNextChain(c4);
		Numbers n = new Numbers(2,3,"add");
		c1.calculate(n);
	}

}
