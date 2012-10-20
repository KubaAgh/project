package pl.edu.agh.neuralnetwork.layer;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import pl.edu.agh.neuralnetwork.neuron.INeuron;



public class Layer<T extends INeuron> implements ILayer<T> {

	Collection<T> neurons;
	
	public Layer(Collection<T> neurons){
		this.neurons = neurons;
	}
	
	public Layer(int size, Class<T> clazz){
		neurons = new LinkedList<T>();
		for(int i=0; i< size; i++){
			try {
				neurons.add(clazz.newInstance());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public Iterator<T> iterator() {		
		return neurons.iterator();
	}
	
	public int getNeuronsNumber(){
		return neurons.size();
	}
	
}
