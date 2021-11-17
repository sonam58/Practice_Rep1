/*Git Sample
* Prasad Patil 11/10/21
*/

/*For Pull process Adding logger in updated Git sample.
* Sonam Yadav 17/11/21
*/

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hello{
	
	private static final Logger Log = LogManager.getLogger(Hello.class);
	
	public static void main(String[] args){
		logger.info("Sample info message");
		logger.debug("Hello World");
	}
}