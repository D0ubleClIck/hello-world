
public class hello_world {
	public static void main(String args[]) {
		char array[] = {'h', 'e','l','l','o','w','o','r','l','d'}; 
		
		for(int i = 0; i < array.length; i++)
		{
			if(i == 5)
			{
			System.out.print(" ");	
			}
			System.out.print(array[i]);
		}
	}

}
