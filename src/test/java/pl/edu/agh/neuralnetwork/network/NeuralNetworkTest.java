package pl.edu.agh.neuralnetwork.network;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import pl.edu.agh.neuralnetwork.exception.WrongNumerOfInputSignals;
import pl.edu.agh.neuralnetwork.layer.Layer;
import pl.edu.agh.neuralnetwork.neuron.InnerNeuron;
import pl.edu.agh.neuralnetwork.neuron.InputNeuron;


public class NeuralNetworkTest {

	NeuralNetwork neuralNetwork;
	@Before
	public void init(){
		Layer<InputNeuron> inputLayer;
		List<Layer<InnerNeuron>> hiddenLayers;

		int neuronNumber = 3;
/*		Collection<InputNeuron> neurons = new LinkedList<InputNeuron>();
		for(int i=0; i<neuronNumber; i++){
			neurons.add(new InputNeuron());
		}	*/	
		inputLayer = new Layer<InputNeuron>(neuronNumber, InputNeuron.class);
		
		hiddenLayers = new LinkedList<Layer<InnerNeuron>>();
		
		neuralNetwork = new NeuralNetwork(inputLayer, hiddenLayers);
	}
	
	
	@Test
	public void testSetInputSignal() throws WrongNumerOfInputSignals{		
		Double[] test = {0.3, 0.7, 0.0};
		List<Double> input = Arrays.asList(test);
		
		neuralNetwork.setInputSignals(input);	
	}
	
	@Test(expected=WrongNumerOfInputSignals.class)
	public void testSetInputSignalException() throws WrongNumerOfInputSignals{		
		List<Double> input = new LinkedList<Double>();			
		neuralNetwork.setInputSignals(input);		
	}
}
