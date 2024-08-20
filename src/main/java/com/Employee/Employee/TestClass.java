package com.Employee.Employee;

import org.springframework.stereotype.Component;

@Component
public class TestClass {

		@SuppressWarnings("finally")
		public int test()
		{
			int i = 0;
			try
			{
				return 1;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				return 2;
			}
		}
		
}
