package modelling;

import java.util.ArrayList;

public class Trellis
{
// Default constructor used to make it possible to inherit from the class.
	ArrayList<ArrayList<Nodes>> mNodes;
    int mNumT;
Trellis(int aNumT)
{
	mNumT=aNumT;
	for (int t=0; t<mNumT; t++) 
	{
		mNodes.add(new ArrayList<Node>());
	}
}

//Implement a destructor type for trellis

void addNode(int aT, Node aNode) {
	ArrayList<Node> arr=mNodes.get(aT);
	arr.add(aNode);
	mNodes.set(aT,arr);
}

Node GetNode(int aT, int aN) 
{
	return mNodes.get(aT).get(aN);
}

void HighestScoringPath(Arraylist<Arc> Arcs, double aScore) {

	ArrayList<ArrayList<Arc>> bestArcs;		
	ArrayList<ArrayList<Double>> bestScores;
	ArrayList<ArrayList<Integer>> prevIndex;		

	for (int t=0; t<mNumT; t++) {
		bestArcs.add(new ArrayList<Arc>(mNodes.size()));
		ArrayList<Double> x1=new ArrayList<Double>(mNodes.get(t).size());
		ArrayList<Integer> x2=new ArrayList<Integer>(mNodes.get(t).size());
		for(int i=0;i<x.size();i++)
		{
			x1.set(i,Integer.MAX_VALUE);
			x2.set(index, -1);
	    }
	    bestScores.add(x1);
		prevIndex.add(x2);  // -1 indicates that the node can not be reached.
	}

	// Set the initial scores to 0.
	ArrayList<Double> d=mNodes.get(0);
	for (int n=0; n<mNodes.get(0).size(); n++) {
        d.add(n,0);
    }
    bestScores.set(0,d);
	// Go through the layers one by one to find the highest scoring path from the beginning of the Trellis to the end.
    for (int t=1; t<mNumT; t++) {
        for (int n=0; n<mNodes.get(t).size(); n++) {
            Node node = mNodes.get(t).get(n);
			for (int i=0; i<node.GetNumBackwardArcs(); i++) {
				Arc bArc = node.GetBackwardArc(i);
                int pIndex = bArc.GetStartNode().GetIndex();
                double score = bestScores.get(t-1).get(pIndex) + bArc.GetScore();
                if (i==0 || score > bestScores.get(t).get(n))
                {
                	
                    ArrayList<Arc> y1=bestArcs.get(t);
                    y1.set(n,bArc);
                    bestArcs.set(t,y1);
                    
                    ArrayList<Double> y2=bestScores.get(t);
                    y2.set(n,score);
                    bestScores.set(t,y2);

                    ArrayList<Integer> y3=prevIndex.get(t);
                    y3.set(n,pIndex);
                    bestArcs.set(t,y3;
                }
            }
        }
    }
    
   	int endIndex = 0;
	for (int n=0; n<mNodes.get(mNumT-1).size();n++){
		if (bestScores.get(mNumT-1).get(n) > bestScores.get(mNumT-1).get(endIndex)) {
			endIndex = n;
		}
	}

	int maxIndex = endIndex;
    for (int t=mNumT-1; t>0; t--) {
		aArcs.add(bestArcs.get(t).get(maxIndex));
        maxIndex = prevIndex.get(t).get(maxIndex);
    }

	// Set output score.
    aScore = bestScores.get(mNumT-1).get(endIndex);

	//To Delete temporary lists
	
}
}