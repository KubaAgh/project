package pl.edu.agh.neuralnetwork.neuron;

public class InputNeuron implements INeuron {

	/* (non-Javadoc)
	 * @see pl.edu.agh.neuralnetwork.neuron.INeuron#getOutput()
	 */
	
	double signal;
	
	public void setInputSignal(double signal){
		this.signal = signal;
	}
	
	public double getOutputSignal(){
		return signal;		
	}	
}
