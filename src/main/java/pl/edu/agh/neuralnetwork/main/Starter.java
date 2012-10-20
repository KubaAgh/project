package pl.edu.agh.neuralnetwork.main;



import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import pl.edu.agh.neuralnetwork.parser.NetworkParser;

public class Starter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		Logger logger = Logger.getLogger(Starter.class);
		
		CommandLineParser commandLineParser = new BasicParser();

		Options options = new Options();
		
		Option option1 = new Option("t", true, "xml with neural network");
		
		
		options.addOption(option1);
		
		
		try {
			CommandLine commandLine = commandLineParser.parse(options, args);			
			String networkFile = commandLine.getOptionValue("t");
			NetworkParser.parse(networkFile);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
