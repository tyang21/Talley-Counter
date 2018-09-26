/**
 * 
 * @author Tyler
 *
 */
public class TallyCounter 
{
	private int count;
	
	public TallyCounter() 
	{
		count = 0;
	}
	public TallyCounter(int startNum) 
	{
		count = startNum;
	}
	public void click() 
	{
		count = count + 1;
		// Can also be count++
		// As well as count +=1
	}
	public void reset() 
	{
		count = 0;
	}
	public int getCount() 
	{
		return count;
	}
	public void unclick() 
	{	
		count--;
	}
}
