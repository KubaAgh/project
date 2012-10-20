package pl.edu.agh.neuralnetwork.parser;

import java.io.File;

import org.apache.log4j.Logger;

import pl.edu.agh.neuralnetwork.network.INeuralNetwork;

public class NetworkParser {
	
	static Logger logger;
	static{
		logger = Logger.getLogger(NetworkParser.class);
	}


	public static INeuralNetwork parse(String file) {
		String path = "project" + File.separator + "src" + File.separator
				+ "main" + File.separator + "resources" + File.separator + file;

		return parse(new File(path));

	}

	public static INeuralNetwork parse(File file) {
		logger.debug("Parsing Neural network from: " + file.getAbsolutePath());

		return null;

	}

}
