package commonscollection3withjava8;

import java.util.Map;
import java.util.logging.Logger;

import org.apache.commons.collections.MultiMap;
import org.apache.commons.collections.map.MultiValueMap;

public class Runner {

	static Logger logger = Logger.getAnonymousLogger();

	public static void main(String[] args) {
		MultiValueMap openbanktransfers = new MultiValueMap();
		openbanktransfers.put("key1", "value1");
		openbanktransfers.put("key2", "value2");
		logger.info("Beginning: " + openbanktransfers.toString() + "\r\n");

		openbanktransfers.remove("key1", "value1");

		logger.info("Result after removal with MultiValueMap reference: " + openbanktransfers.toString() + "\r\n");

		MultiMap someMultiMap = openbanktransfers;
		someMultiMap.remove("key2", "value2");

		logger.info("Result after removal with MultiMap reference: " + openbanktransfers.toString() + "\r\n");

		Map<?, ?> someMap = openbanktransfers;
		someMap.remove("key2", "value2");

		logger.info("Result after removal with Map reference: " + openbanktransfers.toString() + "\r\n");
	}
}
