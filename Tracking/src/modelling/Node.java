package modelling;

import java.util.ArrayList;
import java.util.HashMap;


import ij.gui.Roi;

public class Node {
	int index;
	ArrayList<Arc> forwardArc;
	ArrayList<Arc> backwardArc;
	HashMap<Integer,String> id1=new HashMap<>();              //FeatureNames
	HashMap<Integer,Double> id2=new HashMap<>();              //FeatureValues
	private Roi roi;
	Node(int aIndex, Roi roi)
	{
		index=aIndex;
		this.roi=roi;
	}
	
	
	void addForwardArc(Arc aArc)
	{
		if(this== aArc.getStart())
			forwardArc.add(aArc);
		
		
	}
	void addBackwardArc(Arc aArc)
	{
		if(this == aArc.getEnd())
			backwardArc.add(aArc);
      		
	}
	int getNumOfBackArcs()
	{
		return backwardArc.size();
	}
	int getNumOfForArcs()
	{
		return forwardArc.size();
	}
	Arc getForwardArc(int indx)
	{
		return forwardArc.get(indx);
	}
	int getIndex()
	{
		return index;
	}
	
	Arc getBackwardArc(int indx)
	{
		return backwardArc.get(indx);
	}
	public Object getNextEvent() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object getPrevCell() {
		// TODO Auto-generated method stub
		return null;
	}


	public Node getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean hasNextCell() {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean hasChildren() {
		// TODO Auto-generated method stub
		return false;
	}


	public State getState() {
		// TODO Auto-generated method stub
		return null;
	}


	public Node getNextCell() {
		// TODO Auto-generated method stub
		return null;
	}


//	@SuppressWarnings("static-access")
/*	void getFeatureMap(int i,int j) throws IOException
	{
		GroundTruthExtractor ob=new GroundTruthExtractor();
		ob.getValues(i);
		id1=ob.FeatureSet.get(j).featureNames;
		id2=ob.FeatureSet.get(j).featureValues;
	}
*/	
}
