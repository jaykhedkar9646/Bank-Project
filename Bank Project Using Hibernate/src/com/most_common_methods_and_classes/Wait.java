package com.most_common_methods_and_classes;

public class Wait {

	public static void wait_Time()
	{
		System.out.print("Wait a second");
		try {
			int count=0;
			for(int i=0;i<3;i++)
			{
				Thread.sleep(500);
				System.out.print(".");
				count++;
				if(count==3)
				{
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			
			e.getMessage();
		}
		System.out.println();

	}
}
