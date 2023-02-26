class If_exp2
{
	public static void main(String[] args) 
	{
		int i,j,k;
		i=100;j=70;k=200;
		int min=0;
		if(i<j && i<k)min=i;
		if(j<i && j<k)min=j;
		if(k<j && k<i)min=k;
		System.out.println("Min of  "+i+","+j+" and "+k+" is "+min);
	}
}
			
		