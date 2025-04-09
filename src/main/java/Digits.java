import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num) {
		digitList = new ArrayList <Integer>();
		String numToString = "" + num;
		for(int i = 0; i < numToString.length(); i++) {
			digitList.add(numToString.charAt(i) - '0');
		}
	}

	public boolean isStrictlyIncreasing() {
		for(int i = 0; i < digitList.size() - 1; i++) {
			if(digitList.get(i+1) <= digitList.get(i)) {
				return false;
			}
		}
		return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
