package edu.esprit.gestion_projet.aop;

public class Performmance {
	
	
	private float startTime;
	private float stopTime ;
	
	//Before
	public void startChrono()
	{
	startTime=System.currentTimeMillis();
		
	}

	//After
	
	public void stopChrono()
	{
		stopTime=System.currentTimeMillis();
		
		System.out.println("ElapsedTime: "+(stopTime-startTime)+" ms");
		
	}
}
