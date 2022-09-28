import java.util.ArrayList;
import java.util.List;
public class colle1
{
	public static void main(String [] args)
	{
		List<String> list=new ArrayList<String>();
		list.add("red");
		list.add("blue");
		
		for(String color:list)
		{
			System.out.println(color);
			//break;
		}
	}
}