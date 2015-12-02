package edu.esprit.gestion_projet.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.StaticPart;

public class Logger {
	
	public void logMethodEntry(JoinPoint jp)
	{
		String name=jp.getSignature().toLongString();
		
		Object[]args=jp.getArgs();
		StringBuffer sb= new StringBuffer
				(name+"les arguments pass�s: \n");
	
		for(int i=0;i<args.length;i++)
		{
			Object o=args[i];
			sb.append(o);
		}
		System.out.println(sb);
	}

	public void logMethodAfter(StaticPart st,Object result)
	{
		String name=st.getSignature().toLongString();
		System.out.println(name+"Valeur de retour:\n"+result);
	}
	
}
