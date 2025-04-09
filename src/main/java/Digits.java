import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num) {
		String numtoString = toString(num);
		int count = 0;
		for(int i = 0; i < numtoString.length(); i++) {
			count++;
		}
		int start = 0;
		int end = 1;
		for(int j = 0; j < count; j++) {
			digitList.add(numtoString.substring(start, end));
			start++;
			end++;
		}
	}

	public boolean isStrictlyIncreasing() {
		for(int i = 0; i < digitList.size(); i++) {
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
