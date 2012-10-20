package pl.edu.agh.neuralnetwork.network;

import java.util.List;

import pl.edu.agh.neuralnetwork.exception.WrongNumerOfInputSignals;

public interface INeuralNetwork {

	public void setInputSignals(List<Double> input) throws WrongNumerOfInputSignals;

	public List<Double> getOutputSignals();

	public void compute();

}