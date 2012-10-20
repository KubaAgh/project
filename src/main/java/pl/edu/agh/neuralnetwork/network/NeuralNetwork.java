package pl.edu.agh.neuralnetwork.network;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import pl.edu.agh.neuralnetwork.exception.WrongNumerOfInputSignals;
import pl.edu.agh.neuralnetwork.layer.Layer;
import pl.edu.agh.neuralnetwork.neuron.INeuron;
import pl.edu.agh.neuralnetwork.neuron.InnerNeuron;
import pl.edu.agh.neuralnetwork.neuron.InputNeuron;

public class NeuralNetwork implements INeuralNetwork {
	Layer<InputNeuron> inputLayer;
	List<Layer<InnerNeuron>> hiddenLayers;

	
	
	
	public NeuralNetwork(Layer<InputNeuron> inputLayer,
			List<Layer<InnerNeuron>> hiddenLayers) {
		super();
		this.inputLayer = inputLayer;
		this.hiddenLayers = hiddenLayers;
	}

	/* (non-Javadoc)
	 * @see pl.edu.agh.neuralnetwork.network.INeuralNetwork#getOutputSignals()
	 */
	public List<Double> getOutputSignals(){		
		Layer<InnerNeuron> lastLayer =  hiddenLayers.get(hiddenLayers.size()-1);		
		List<Double> output = new LinkedList<Double>();
		for(INeuron neuron : lastLayer){
			output.add(neuron.getOutputSignal());
		}		
		return output;
	}
	
	/* (non-Javadoc)
	 * @see pl.edu.agh.neuralnetwork.network.INeuralNetwork#compute()
	 */
	public void compute(){
	}

	
	public void setInputSignals(List<Double> input) throws WrongNumerOfInputSignals {
		if(input.size() != inputLayer.getNeuronsNumber()){
			throw new WrongNumerOfInputSignals();
		}
		
		int i=0;
		for(InputNeuron neuron : inputLayer){
			neuron.setInputSignal(input.get(i));
			i++;
		}		
	}	
}
