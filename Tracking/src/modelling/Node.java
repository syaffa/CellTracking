package modelling;

import java.util.ArrayList;

public class Node {
	int Index;
	ArrayList<Arc> ForwardArc;
	ArrayList<Arc> BackwardArc;
	
	Node(int aIndex)
	{
		Index=aIndex;
	}
	
	void addForwardArc(Arc aArc)
	{
		if(this== aArc.GetStart())
			ForwardArc.add(aArc);
		
		
	}
	void addBackwardArc(Arc aArc)
	{
		if(this == aArc.GetEnd())
			BackwardArc.add(aArc);
      		
	}
	int getNumOfBackArcs()
	{
		return BackwardArc.size();
	}
	int getNumOfForArcs()
	{
		return ForwardArc.size();
	}
	Arc getForwardArc(int indx)
	{
		return ForwardArc.get(indx);
	}
	int getIndex()
	{
		return Index;
	}
	
	Arc getBackwardArc(int indx)
	{
		return BackwardArc.get(indx);
	}
}
