package pl.edu.agh.neuralnetwork.neuron;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InnerNeuron implements INeuron {

	double signal;
	Map<INeuron, Double> inputNeurons;
	
	
	public InnerNeuron(List<INeuron> neurons, List<Double> weights) {
		inputNeurons = new HashMap<INeuron, Double>();		
		int i=0;
		for(INeuron neuron : neurons){
			inputNeurons.put(neuron, weights.get(i++));
		}
		
	}
	
	public double getOutputSignal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
